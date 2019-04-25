package com.example.xiebin.mymdapp.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangxiang
 * @date 2016/6/14
 */
public class HomeBean implements Serializable {


    /**
     * symbol_left : CAD
     * currency_left : CA$
     * banner : [{"image":"https://www.fs.com/includes/templates/fiberstore/images/banner/en/m-banner.jpg","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/specials/fs_box_beta-58.html?sorce=MobilePhoneApp","type":"page","title":""},{"image":"https://www.fs.com/includes/templates/fiberstore/images/banner/en/new_banner_seattle_m.jpg?v=2","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/shipping_policy.html?sorce=MobilePhoneApp","type":"page","title":""},{"image":"https://www.fs.com/includes/templates/fiberstore/images/banner/en/new_banner_01_m.jpg?v=2","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/specials/multiplexer-wdm-cwdm-dwdm-57.html?sorce=MobilePhoneApp","type":"page","title":""},{"image":"https://www.fs.com/images/home_custom/20180714130945_202.jpg","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/100G_Transceivers.html?sorce=MobilePhoneApp","type":"page","title":""}]
     * category : [{"image":"https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_01.png","title":"Categories","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/40g-100g-transceivers.html?sorce=MobilePhoneApp","type":"page"},{"image":"https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_02.png","title":"Clearance","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/100G_Transceivers.html?sorce=MobilePhoneApp","type":"page"},{"image":"https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_03.png","title":"Free Support","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/specials/10G-SFP-Series-Fiber-Optic-Transceivers-49.html?sorce=MobilePhoneApp","type":"page"},{"image":"https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_04.png","title":"Logistics","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/dac-cables.html?sorce=MobilePhoneApp","type":"page"},{"image":"https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_05.png","title":"Product Videos","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/data-center-switches.html?sorce=MobilePhoneApp","type":"page"},{"image":"https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_06.png","title":"Request A Sample","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/specials/wdm-otn-system.html?sorce=MobilePhoneApp","type":"page"}]
     * video : [{"image":"https://www.fs.com/includes/templates/fiberstore/images/new_index_wap/video_01.jpg","title":"Cisco Compatible 40G QSFP+","link":"https://www.youtube.com/embed/Oc4ZiaBiSCo?rel=0&showinfo=0","id":""},{"image":"https://www.fs.com/includes/templates/fiberstore/images/new_index_wap/video_02.jpg","title":"1U FHX Ultra HD Fiber Enclosure","link":"https://www.youtube.com/embed/BT0uMr1mGSw?rel=0&showinfo=0","id":""},{"image":"https://www.fs.com/images/home_custom/20180724165600_491.jpg","title":"40 Channels DWDM Mux Demux","link":"https://www.youtube.com/embed/jm82nPlSSAU?rel=0&showinfo=0","id":""}]
     * hot_products_list : [{"name":"Interconnection","product":{"products_id":"48354","title":"100G QSFP28 SR4","content":"Hot-pluggable QSFP28 optical module for 100 Gigabit Ethernet, transmits up to 100m on OM4 multimode fibre.","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_01.jpg","back_image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_banner.jpg","video_url":"","price":"263.00","stock":"1326 pcs in stock"},"products_list":[{"products_id":"11552","title":"10G SFP+ SR","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_02.jpg","price":"21.00","stock":"29380 pcs in stock"},{"products_id":"11555","title":"10G SFP+ LR","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_03.jpg","price":"45.00","stock":"12379 pcs in stock"},{"products_id":"36157","title":"40G QSFP+ SR4","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_04.jpg","price":"65.00","stock":"1926 pcs in stock"},{"products_id":"48355","title":"100G QSFP28 LR4","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_05.jpg","price":"1,319.00","stock":"1 pcs in stock"},{"products_id":"30849","title":"10G SFP+ to SFP+ DAC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_06.jpg","price":"13.00","stock":"3435 pcs in stock"},{"products_id":"30894","title":"40G QSFP+ to 4x SFP+ DAC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_07.jpg","price":"53.00","stock":"413 pcs in stock"},{"products_id":"30881","title":"10G SFP+ to SFP+ AOC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_08.jpg","price":"46.00","stock":"163 pcs in stock"},{"products_id":"30909","title":"40G QSFP+ to 4x SFP+ AOC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_09.jpg","price":"230.00","stock":"114 pcs in stock"}]},{"name":"Space Saving","product":{"products_id":"68911","title":"FHX Series","content":"Features superior performance, ultra high density and agility, FHX is your go-to choice for efficient cable management.","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/02-Space_Saving/Space_Saving_01.jpg","back_image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/02-Space_Saving/Space_Saving_banner.jpg","video_url":"","price":"150.00","stock":"128 pcs in stock"},"products_list":[{"products_id":"68916","title":"FHX MTP/MPO Cassettes","image":"https://www.fs.com//images/home_custom/20180725123022_533.jpg","price":"85.00","stock":"1100 pcs in stock"},{"products_id":"72135","title":"FHX Splice Cassettes","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/02-Space_Saving/Space_Saving_04.jpg","price":"70.00","stock":"Available"},{"products_id":"68962","title":"FHX LC SC MTP FAPs","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/02-Space_Saving/Space_Saving_05.jpg","price":"20.00","stock":"91 pcs in stock"},{"products_id":"51607","title":"FHD Series Enclosures","image":"https://www.fs.com//images/home_custom/20180714144050_235.jpg","price":"117.00","stock":"5 pcs in stock"},{"products_id":"41998","title":"FHD LC SC MTP FAPs","image":"https://www.fs.com//images/home_custom/20180730164137_990.jpg","price":"29.00","stock":"768 pcs in stock"},{"products_id":"57023","title":"FHD MTP/MPO Cassettes","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/02-Space_Saving/Space_Saving_08.jpg","price":"210.00","stock":"174 pcs in stock"},{"products_id":"43552","title":"MTP/MPO-LC Breakout Panels","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/02-Space_Saving/Space_Saving_02.jpg","price":"1,000.00","stock":"40 pcs in stock"},{"products_id":"35530","title":"FHU 1U 19\" Patch Panels","image":"https://www.fs.com//images/home_custom/20180714145050_375.jpg","price":"40.00","stock":"82 pcs in stock"}]},{"name":"Fiber Assemblies","product":{"products_id":"68017","title":"MTP Elite Plenum","content":"With Corning fiber, US Conec MTP elite connector, designed for 40G/100G high-density data center applications.","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_01.jpg","back_image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_banner.jpg","video_url":"","price":"52.00","stock":"619 pcs in stock"},"products_list":[{"products_id":"68047","title":"MTP to LC Breakout Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_02.jpg","price":"38.00","stock":"53 pcs in stock"},{"products_id":"40192","title":"LC SC ST Patch Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_03.jpg","price":"3.90","stock":"1843 pcs in stock"},{"products_id":"68295","title":"Ultra Low Loss LC Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_04.jpg","price":"11.00","stock":"41 pcs in stock"},{"products_id":"72170","title":"Uniboot LC Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_05.jpg","price":"9.80","stock":"Available"},{"products_id":"40384","title":"Armored Patch Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_06.jpg","price":"6.50","stock":"Available"},{"products_id":"50013","title":"Fiber Pigtails","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_07.jpg","price":"1.10","stock":"1984 pcs in stock"},{"products_id":"11997","title":"LC SC MTP Loopbacks","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_08.jpg","price":"5.20","stock":"88 pcs in stock"},{"products_id":"48497","title":"Fiber Optic Adapters/Couplers","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/03-Fiber_Assemblies/Fiber_Assemblies_09.jpg","price":"0.88","stock":"8935 pcs in stock"}]},{"name":"Copper Assemblies","product":{"products_id":"66742","title":"Ultra Slim Cat6","content":"Built for future-proof speed and connectivity, fit perfectly in high-density cabling environment.","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/04-Copper_Assemblies/Copper_Assemblies_01.jpg","back_image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/04-Copper_Assemblies/Copper_Assemblies_banner.jpg","video_url":"","price":"2.30","stock":"Available"},"products_list":[{"products_id":"70705","title":"Cat5e Patch Cables","image":"https://www.fs.com//images/home_custom/20180716150005_860.jpg","price":"1.10","stock":"8622 pcs in stock"},{"products_id":"70733","title":"Cat6 Patch Cables","image":"https://www.fs.com//images/home_custom/20180714132119_642.jpg","price":"3.10","stock":"2097 pcs in stock"},{"products_id":"66789","title":"Cat6a Patch Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/04-Copper_Assemblies/Copper_Assemblies_04.jpg","price":"1.60","stock":"566 pcs in stock"},{"products_id":"72001","title":"Cat7 Patch Cables","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/04-Copper_Assemblies/Copper_Assemblies_05.jpg","price":"5.30","stock":"Available"},{"products_id":"69067","title":"Cat6 Trunk Cables","image":"https://www.fs.com//images/home_custom/20180714140105_665.jpg","price":"34.00","stock":"100 pcs in stock"},{"products_id":"58708","title":"Cat6 Bulk Cables","image":"https://www.fs.com//images/home_custom/20180718101332_649.jpg","price":"141.00","stock":"324 pcs in stock"},{"products_id":"69182","title":"Blank Keystone Patch Panels","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/04-Copper_Assemblies/Copper_Assemblies_08.jpg","price":"14.00","stock":"Available"},{"products_id":"41313","title":"Keystone Jacks","image":"https://www.fs.com//images/home_custom/20180731112246_299.jpg","price":"2.80","stock":"244 pcs in stock"}]},{"name":"Optical Transport Network","product":{"products_id":"35887","title":"XWDM & Transponders","content":"Standard-based DWDM MUX/OEO/ADM for DCI , metro and long haul applications.","image":"https://www.fs.com//images/home_custom/20180801145751_508.jpg","back_image":"https://www.fs.com//images/home_custom/20180801102149_453.jpg","video_url":"","price":"2,257.00","stock":"28 pcs in stock"},"products_list":[{"products_id":"33485","title":"40CH DWDM Mux Demux","image":"https://www.fs.com//images/home_custom/20180802093820_481.jpg","price":"2,204.00","stock":"Available"},{"products_id":"72430","title":"16 CH DWDM Mux Demux","image":"https://www.fs.com//images/home_custom/20180801172404_669.jpg","price":"1,400.00","stock":"17 pcs in stock"},{"products_id":"33489","title":"18CH CWDM Mux Demux","image":"https://www.fs.com//images/home_custom/20180801095520_849.jpg","price":"910.00","stock":"114 pcs in stock"},{"products_id":"43099","title":"8CH CWDM Mux Demux","image":"https://www.fs.com//images/home_custom/20180801095740_920.jpg","price":"420.00","stock":"2 pcs in stock"},{"products_id":"39214","title":"1U Managed Chassis","image":"https://www.fs.com//images/home_custom/20180801095956_153.jpg","price":"480.00","stock":"52 pcs in stock"},{"products_id":"30515","title":"4CH Transponder (OEO)","image":"https://www.fs.com//images/home_custom/20180801100209_493.jpg","price":"1,000.00","stock":"57 pcs in stock"},{"products_id":"36524","title":"DWDM EDFA","image":"https://www.fs.com//images/home_custom/20180801100637_619.jpg","price":"1,900.00","stock":"47 pcs in stock"},{"products_id":"65781","title":"Dispersion Compensation","image":"https://www.fs.com//images/home_custom/20180801100854_366.jpg","price":"950.00","stock":"11 pcs in stock"}]},{"name":"Enterprise Network","product":{"products_id":"29123","title":"Data Center Switch","content":"40G/100G data center switches can fully meet various requirements for different size data center applications.","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/05-Managment_System/Managment_System_01.jpg","back_image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/05-Managment_System/Managment_System_banner.jpg","video_url":"","price":"5,278.00","stock":"18 pcs in stock"},"products_list":[{"products_id":"35289","title":"PoE+ Managed Switch","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/05-Managment_System/Managment_System_02.jpg","price":"249.00","stock":"28 pcs in stock"},{"products_id":"66144","title":"Access/Aggregation Switch","image":"https://www.fs.com//images/home_custom/20180714142240_336.jpg","price":"249.00","stock":"75 pcs in stock"},{"products_id":"69404","title":"10G Data Center Switch","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/05-Managment_System/Managment_System_04.jpg","price":"2,506.00","stock":"30 pcs in stock"},{"products_id":"69342","title":"40G SDN Switch","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/05-Managment_System/Managment_System_05.jpg","price":"7,681.00","stock":"46 pcs in stock"},{"products_id":"72940","title":"2U 1-Socket Server","image":"https://www.fs.com//images/home_custom/20180716171946_645.jpg","price":"4,580.00","stock":"Available"},{"products_id":"35168","title":"10 Gigabit Network Adapter","image":"https://www.fs.com//images/home_custom/20180717101952_793.jpg","price":"236.00","stock":"Available"},{"products_id":"35990","title":"Power Extension Cord","image":"https://www.fs.com//images/home_custom/20180717100149_530.jpg?v=2","price":"4.70","stock":"4237 pcs in stock"},{"products_id":"29452","title":"PDU Power Strips","image":"https://www.fs.com//images/home_custom/20180716171712_680.jpg","price":"25.00","stock":"195 pcs in stock"}]}]
     * solution : {"title":"Solutions","content":"Network solutions and advanced technologies engineered to help you achieve greater business value.","list":[{"title":"Data Center Cabling","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Data-Center-Cabling.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_01.jpg","type":"Page","list":["Interconnect Optical Solution","Fiber Cabling System","Copper Cabling System","Network Switches"]},{"title":"Enterprise Networks","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Enterprise-Networks.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_02.jpg","type":"Page","list":["Networking","Power over Ethernet","Surveillance","Fiber Cabling"]},{"title":"Optical OEM","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Optic-OEM-Solution.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_03.jpg","type":"Page","list":["Data Center Transceiver","Optical Transmission","Wireless Broadband"]},{"title":"Optical Transport Network","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Long-haul-Transmission.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_04.jpg","type":"Page","list":["DWDM Solution","CWDM Solution","OTN System","Fiber Cabling System"]}]}
     * total_items : 0
     * securityToken : fdafac75ef285d075f8aeaf9900a1475
     * search_hot : ["qsfp-40g-sr-bd","media converter","cwdm","lc to lc","10g sfp"]
     */

    private String symbol_left;
    private String currency_left;
    private SolutionBean solution;
    private String total_items;
    private String securityToken;
    private List<BannerBean> banner;
    private List<CategoryBean> category;
    private List<VideoBean> video;
    private List<HotProductsListBean> hot_products_list;
    private List<String> search_hot;

    public String getSymbol_left() {
        return symbol_left;
    }

    public void setSymbol_left(String symbol_left) {
        this.symbol_left = symbol_left;
    }

    public String getCurrency_left() {
        return currency_left;
    }

    public void setCurrency_left(String currency_left) {
        this.currency_left = currency_left;
    }

    public SolutionBean getSolution() {
        return solution;
    }

    public void setSolution(SolutionBean solution) {
        this.solution = solution;
    }

    public String getTotal_items() {
        return total_items;
    }

    public void setTotal_items(String total_items) {
        this.total_items = total_items;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public List<BannerBean> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerBean> banner) {
        this.banner = banner;
    }

    public List<CategoryBean> getCategory() {
        return category;
    }

    public void setCategory(List<CategoryBean> category) {
        this.category = category;
    }

    public List<VideoBean> getVideo() {
        return video;
    }

    public void setVideo(List<VideoBean> video) {
        this.video = video;
    }

    public List<HotProductsListBean> getHot_products_list() {
        return hot_products_list;
    }

    public void setHot_products_list(List<HotProductsListBean> hot_products_list) {
        this.hot_products_list = hot_products_list;
    }

    public List<String> getSearch_hot() {
        return search_hot;
    }

    public void setSearch_hot(List<String> search_hot) {
        this.search_hot = search_hot;
    }

    public static class SolutionBean {
        /**
         * title : Solutions
         * content : Network solutions and advanced technologies engineered to help you achieve greater business value.
         * list : [{"title":"Data Center Cabling","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Data-Center-Cabling.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_01.jpg","type":"Page","list":["Interconnect Optical Solution","Fiber Cabling System","Copper Cabling System","Network Switches"]},{"title":"Enterprise Networks","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Enterprise-Networks.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_02.jpg","type":"Page","list":["Networking","Power over Ethernet","Surveillance","Fiber Cabling"]},{"title":"Optical OEM","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Optic-OEM-Solution.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_03.jpg","type":"Page","list":["Data Center Transceiver","Optical Transmission","Wireless Broadband"]},{"title":"Optical Transport Network","link":"https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Long-haul-Transmission.html?sorce=MobilePhoneApp","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_04.jpg","type":"Page","list":["DWDM Solution","CWDM Solution","OTN System","Fiber Cabling System"]}]
         */

        private String title;
        private String content;
        private List<ListBean> list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * title : Data Center Cabling
             * link : https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/Data-Center-Cabling.html?sorce=MobilePhoneApp
             * image : https://www.fs.com/includes/templates/fiberstore/images/new_index/Solution_01.jpg
             * type : Page
             * list : ["Interconnect Optical Solution","Fiber Cabling System","Copper Cabling System","Network Switches"]
             */

            private String title;
            private String link;
            private String image;
            private String type;
            private List<String> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<String> getList() {
                return list;
            }

            public void setList(List<String> list) {
                this.list = list;
            }
        }
    }

    public static class BannerBean {
        /**
         * image : https://www.fs.com/includes/templates/fiberstore/images/banner/en/m-banner.jpg
         * link : https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/specials/fs_box_beta-58.html?sorce=MobilePhoneApp
         * type : page
         * title :
         */

        private String image;
        private String link;
        private String type;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class CategoryBean {
        /**
         * image : https://www.fs.com/includes/modules/phone/images/index_banner/home_banner_01.png
         * title : Categories
         * link : https://www.fs.com/index.php?version=2.0.0&modules=phone&handler=webView&request_action=common&url=https://www.fs.com/40g-100g-transceivers.html?sorce=MobilePhoneApp
         * type : page
         */

        private String image;
        private String title;
        private String link;
        private String type;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class VideoBean {
        /**
         * image : https://www.fs.com/includes/templates/fiberstore/images/new_index_wap/video_01.jpg
         * title : Cisco Compatible 40G QSFP+
         * link : https://www.youtube.com/embed/Oc4ZiaBiSCo?rel=0&showinfo=0
         * id :
         */

        private String image;
        private String title;
        private String link;
        private String id;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class HotProductsListBean {
        @Override
        public String toString() {
            return "HotProductsListBean{" +
                    "name='" + name + '\'' +
                    ", product=" + product +
                    ", viewType=" + viewType +
                    ", products_list=" + products_list +
                    '}';
        }

        /**
         * name : Interconnection
         * product : {"products_id":"48354","title":"100G QSFP28 SR4","content":"Hot-pluggable QSFP28 optical module for 100 Gigabit Ethernet, transmits up to 100m on OM4 multimode fibre.","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_01.jpg","back_image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_banner.jpg","video_url":"","price":"263.00","stock":"1326 pcs in stock"}
         * products_list : [{"products_id":"11552","title":"10G SFP+ SR","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_02.jpg","price":"21.00","stock":"29380 pcs in stock"},{"products_id":"11555","title":"10G SFP+ LR","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_03.jpg","price":"45.00","stock":"12379 pcs in stock"},{"products_id":"36157","title":"40G QSFP+ SR4","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_04.jpg","price":"65.00","stock":"1926 pcs in stock"},{"products_id":"48355","title":"100G QSFP28 LR4","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_05.jpg","price":"1,319.00","stock":"1 pcs in stock"},{"products_id":"30849","title":"10G SFP+ to SFP+ DAC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_06.jpg","price":"13.00","stock":"3435 pcs in stock"},{"products_id":"30894","title":"40G QSFP+ to 4x SFP+ DAC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_07.jpg","price":"53.00","stock":"413 pcs in stock"},{"products_id":"30881","title":"10G SFP+ to SFP+ AOC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_08.jpg","price":"46.00","stock":"163 pcs in stock"},{"products_id":"30909","title":"40G QSFP+ to 4x SFP+ AOC","image":"https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_09.jpg","price":"230.00","stock":"114 pcs in stock"}]
         */

        private String name;
        private ProductBean product;

        public int getViewType() {
            return viewType;
        }

        public HotProductsListBean setViewType(int viewType) {
            this.viewType = viewType;

            return this;
        }

        private int viewType;
        private List<ProductsListBean> products_list;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ProductBean getProduct() {
            return product;
        }

        public void setProduct(ProductBean product) {
            this.product = product;
        }

        public List<ProductsListBean> getProducts_list() {
            return products_list;
        }

        public void setProducts_list(List<ProductsListBean> products_list) {
            this.products_list = products_list;
        }

        public static class ProductBean {
            /**
             * products_id : 48354
             * title : 100G QSFP28 SR4
             * content : Hot-pluggable QSFP28 optical module for 100 Gigabit Ethernet, transmits up to 100m on OM4 multimode fibre.
             * image : https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_01.jpg
             * back_image : https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_banner.jpg
             * video_url :
             * price : 263.00
             * stock : 1326 pcs in stock
             */

            private String products_id;
            private String title;
            private String content;
            private String image;
            private String back_image;
            private String video_url;
            private String price;
            private String stock;

            @Override
            public String toString() {
                return "ProductBean{" +
                        "products_id='" + products_id + '\'' +
                        ", title='" + title + '\'' +
                        ", content='" + content + '\'' +
                        ", image='" + image + '\'' +
                        ", back_image='" + back_image + '\'' +
                        ", video_url='" + video_url + '\'' +
                        ", price='" + price + '\'' +
                        ", stock='" + stock + '\'' +
                        '}';
            }

            public String getProducts_id() {
                return products_id;
            }

            public void setProducts_id(String products_id) {
                this.products_id = products_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getBack_image() {
                return back_image;
            }

            public void setBack_image(String back_image) {
                this.back_image = back_image;
            }

            public String getVideo_url() {
                return video_url;
            }

            public void setVideo_url(String video_url) {
                this.video_url = video_url;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getStock() {
                return stock;
            }

            public void setStock(String stock) {
                this.stock = stock;
            }
        }

        public static class ProductsListBean {
            /**
             * products_id : 11552
             * title : 10G SFP+ SR
             * image : https://www.fs.com/includes/templates/fiberstore/images/new_index/01-Interconnection/Interconnection_02.jpg
             * price : 21.00
             * stock : 29380 pcs in stock
             */

            private String products_id;
            private String title;
            private String image;
            private String price;
            private String stock;


            @Override
            public String toString() {
                return "ProductsListBean{" +
                        "products_id='" + products_id + '\'' +
                        ", title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        ", price='" + price + '\'' +
                        ", stock='" + stock + '\'' +
                        '}';
            }


            public String getProducts_id() {
                return products_id;
            }

            public void setProducts_id(String products_id) {
                this.products_id = products_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getStock() {
                return stock;
            }

            public void setStock(String stock) {
                this.stock = stock;
            }
        }
    }
}
