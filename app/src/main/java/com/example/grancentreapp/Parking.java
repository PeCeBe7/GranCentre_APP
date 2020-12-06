package com.example.grancentreapp;

public class Parking {
    private String img;
    private String title;
    private String desc1;
    private String desc2;

    public Parking(String img, String title, String desc1, String desc2) {
        this.img = img;
        this.title = title;
        this.desc1 = desc1;
        this.desc2 = desc2;
    }
    public String getImg() {
        return img;
    }
    public String getTitle() { return title; }
    public String getDesc1() { return desc1; }
    public String getDesc2() { return desc2; }

}
