package com.example.myapplication;
public class DataList_Tempatwisata {
    private int imageId;
    private String tittle;
    private String detail1;
    private String detail2;
    public DataList_Tempatwisata(int imageId, String tittle, String detail1, String detail2) {
        this.imageId = imageId;
        this.tittle = tittle;
        this.detail1 = detail1;
        this.detail2 = detail2;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getDetail1() {
        return detail1;
    }
    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }
    public String getDetail2() {
        return detail2;
    }
    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }}