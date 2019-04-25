package com.example.xiebin.mymdapp.widget;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DimenTool {

    public static void gen() {

        File file = new File("./app/src/main/res/values/dimens.xml");
        BufferedReader reader = null;
        StringBuilder sw320 = new StringBuilder();
        StringBuilder sw360 = new StringBuilder();
        StringBuilder sw380 = new StringBuilder();
        StringBuilder sw411 = new StringBuilder();



        try {
            System.out.println("生成不同分辨率：");
            reader = new BufferedReader(new FileReader(file));
            String tempString;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束

            while ((tempString = reader.readLine()) != null) {

                if (tempString.contains("</dimen>")) {
                    //tempString = tempString.replaceAll(" ", "");
                    String start = tempString.substring(0, tempString.indexOf(">") + 1);
                    String end = tempString.substring(tempString.lastIndexOf("<") - 2);
                    int num = Integer.valueOf(tempString.substring(tempString.indexOf(">") + 1, tempString.indexOf("</dimen>") - 2));

                    sw320.append(start).append((int) Math.round(num * 0.6)).append(end).append("\n");
                    sw360.append(start).append((int) Math.round(num *0.9)).append(end).append("\n");
                    sw380.append(start).append((int) Math.round(num * 0.9)).append(end).append("\n");
                    sw411.append(start).append((int) Math.round(num * 0.9)).append(end).append("\n");
                 


                } else {
                    sw320.append(tempString).append("\n");
                    sw360.append(tempString).append("\n");
                    sw380.append(tempString).append("\n");
                    sw411.append(tempString).append("\n");

                }
                line++;
            }
            reader.close();
            System.out.println("<!--  w480 -->");
            System.out.println(sw320);
            System.out.println("<!--  w600 -->");
            System.out.println(sw360);

            System.out.println("<!--  w720 -->");
            System.out.println(sw380);


            String sw320file = "./app/src/main/res/values-w320dp/dimens.xml";
            String sw360file = "./app/src/main/res/values-w360dp/dimens.xml";
            String sw380file = "./app/src/main/res/values-w380dp/dimens.xml";
            String sw411file = "./app/src/main/res/values-w411dp/dimens.xml";
            writeFile(sw320file, sw320.toString());
            writeFile(sw360file, sw360.toString());
            writeFile(sw380file, sw380.toString());
            writeFile(sw411file, sw411.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static void writeFile(String file, String text) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.close();
    }

    public static void main(String[] args) {
        gen();
    }
}