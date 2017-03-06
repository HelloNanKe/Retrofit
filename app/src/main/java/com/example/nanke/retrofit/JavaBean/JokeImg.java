package com.example.nanke.retrofit.JavaBean;

/**
 * Created by zt on 2017/3/6.
 */

public class JokeImg {

    /**
     * title : 放弃挣扎吧！你们躲不过命运的捉弄
     * thumburl : http://ww3.sinaimg.cn/large/e4e2bea6jw1eqiwfatbdwj20bq0a80t5.jpg
     * sourceurl : http://down.laifudao.com/images/tupian/201532521350.jpg
     * height : 368
     * width : 422
     * class : 10
     * url : http://www.laifudao.com/tupian/42617.htm
     */

    private String title;
    private String thumburl;
    private String sourceurl;
    private String height;
    private String width;
    //@com.alibaba.fastjson.annotation.JSONField(name = "class")

    private String classX;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumburl() {
        return thumburl;
    }

    public void setThumburl(String thumburl) {
        this.thumburl = thumburl;
    }

    public String getSourceurl() {
        return sourceurl;
    }

    public void setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
