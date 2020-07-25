package com.example.myapplication;
public class datawisata {
    private int imageId;
    private String title;
    private String detail;
    private String detail2;
    public datawisata(int imageId, String title, String detail, String detail2) {
        this.imageId = imageId;
        this.title = title;
        this.detail = detail;
        this.detail2 = detail2;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getDetail2() {
        return detail2;
    }
    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }
}
