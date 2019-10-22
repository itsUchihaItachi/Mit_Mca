package com.example.mitmca;

public class learnLanguages {

    private String nameofLang;
    private int imageID;
    private int tutorialNumber;

    public learnLanguages(String nameofLang, int imageID, int tutorialNumber) {
        this.nameofLang = nameofLang;
        this.imageID = imageID;
        this.tutorialNumber = tutorialNumber;
    }

    public String getNameofLang() {
        return nameofLang;
    }

    public int getImageID() {
        return imageID;
    }


    public int getTutorialNumber() {
        return tutorialNumber;
    }

}
