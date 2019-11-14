package com.example.mitmca.links;

public class linkList {
    public String nameOfLink;
   // private String Description;
    public String url;

    public linkList(String nameOfLink, String url) {
        this.nameOfLink = nameOfLink;
        //Description = description;
        this.url = url;
    }

    public String getNameOfLink() {
        return nameOfLink;
    }
//
//    public String getDescription() {
//        return Description;
//    }

    public String getUrl() {
        return url;
    }
}
