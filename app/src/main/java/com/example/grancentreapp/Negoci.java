package com.example.grancentreapp;

public class Negoci {
    private String img;
    private String title;
    private String telef;
    private String direc;

    public Negoci(String img, String title, String telef, String direc) {
        this.img = img;
        this.title = title;
        this.telef = telef;
        this.direc = direc;
    }
    public String getImg() {
        return img;
    }
    public String getTitle() { return title; }
    public String getTelef() { return telef; }
    public String getDirec() { return direc; }

}
