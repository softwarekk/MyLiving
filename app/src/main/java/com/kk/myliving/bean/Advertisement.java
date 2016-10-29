package com.kk.myliving.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/10/28.
 */

public class Advertisement {

    /**
     * code : 200
     * data : {"bootList":[{"type":0,"imgurl":"http://oss.fenbei.com/fenbei/banner/cjk_loading2.png"}],"joinRoomMsg":["我们提倡绿色直播，封面和直播内容含吸烟、低俗、引诱、暴露等都将会被封停账号，网警24小时在线巡查哦！"],"update":{"content":"++热门改头换面，焕然一新，快来体验！\n++房间弹幕优化，历史弹幕随意看，新消息也能一条不落\n++新增多种礼物，仔细看好哦~\n++优化了部分机型音画不同步的问题\n++更新失败请在www.fenbei.com下载最新版","vernum":35,"title":"本次更新：","lowestnum":30,"download":"http://oss.fenbei.com/fenbei/download/fenbei-1.2.6.apk","forceupdate":true,"version":"1.2.5"},"host":"http://www.fenbei.com/","bootImg":["http://oss.fenbei.com/fenbei/banner/cjk_loading2.png"],"close_vote":0}
     * msg : ok
     */

    private int code;
    /**
     * bootList : [{"type":0,"imgurl":"http://oss.fenbei.com/fenbei/banner/cjk_loading2.png"}]
     * joinRoomMsg : ["我们提倡绿色直播，封面和直播内容含吸烟、低俗、引诱、暴露等都将会被封停账号，网警24小时在线巡查哦！"]
     * update : {"content":"++热门改头换面，焕然一新，快来体验！\n++房间弹幕优化，历史弹幕随意看，新消息也能一条不落\n++新增多种礼物，仔细看好哦~\n++优化了部分机型音画不同步的问题\n++更新失败请在www.fenbei.com下载最新版","vernum":35,"title":"本次更新：","lowestnum":30,"download":"http://oss.fenbei.com/fenbei/download/fenbei-1.2.6.apk","forceupdate":true,"version":"1.2.5"}
     * host : http://www.fenbei.com/
     * bootImg : ["http://oss.fenbei.com/fenbei/banner/cjk_loading2.png"]
     * close_vote : 0
     */

    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * content : ++热门改头换面，焕然一新，快来体验！
         ++房间弹幕优化，历史弹幕随意看，新消息也能一条不落
         ++新增多种礼物，仔细看好哦~
         ++优化了部分机型音画不同步的问题
         ++更新失败请在www.fenbei.com下载最新版
         * vernum : 35
         * title : 本次更新：
         * lowestnum : 30
         * download : http://oss.fenbei.com/fenbei/download/fenbei-1.2.6.apk
         * forceupdate : true
         * version : 1.2.5
         */

        private UpdateBean update;
        private String host;
        private int close_vote;
        /**
         * type : 0
         * imgurl : http://oss.fenbei.com/fenbei/banner/cjk_loading2.png
         */

        private List<BootListBean> bootList;
        private List<String> joinRoomMsg;
        private List<String> bootImg;

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public int getClose_vote() {
            return close_vote;
        }

        public void setClose_vote(int close_vote) {
            this.close_vote = close_vote;
        }

        public List<BootListBean> getBootList() {
            return bootList;
        }

        public void setBootList(List<BootListBean> bootList) {
            this.bootList = bootList;
        }

        public List<String> getJoinRoomMsg() {
            return joinRoomMsg;
        }

        public void setJoinRoomMsg(List<String> joinRoomMsg) {
            this.joinRoomMsg = joinRoomMsg;
        }

        public List<String> getBootImg() {
            return bootImg;
        }

        public void setBootImg(List<String> bootImg) {
            this.bootImg = bootImg;
        }

        public static class UpdateBean {
            private String content;
            private int vernum;
            private String title;
            private int lowestnum;
            private String download;
            private boolean forceupdate;
            private String version;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getVernum() {
                return vernum;
            }

            public void setVernum(int vernum) {
                this.vernum = vernum;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getLowestnum() {
                return lowestnum;
            }

            public void setLowestnum(int lowestnum) {
                this.lowestnum = lowestnum;
            }

            public String getDownload() {
                return download;
            }

            public void setDownload(String download) {
                this.download = download;
            }

            public boolean isForceupdate() {
                return forceupdate;
            }

            public void setForceupdate(boolean forceupdate) {
                this.forceupdate = forceupdate;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }

        public static class BootListBean {
            private int type;
            private String imgurl;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }
        }
    }
}
