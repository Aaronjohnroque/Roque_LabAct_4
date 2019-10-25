package com.example.roque_labact_4;

public class AndroidVersion {
    private int logo;
    private String verTitle, verCountry, verIndustry, verCeo, verSum;

    public AndroidVersion(int logo, String verTitle, String verCountry, String verIndustry, String verCeo, String verSum) {

        this.logo = logo;
        this.verTitle = verTitle;
        this.verCountry = verCountry;
        this.verIndustry = verIndustry;
        this.verCeo = verCeo;
        this.verSum = verSum;


    }

    public int getLogo() {
        return logo;
    }

    public String getverTitle() {
        return verTitle;
    }

    public String getverCountry() {
        return verCountry;
    }

    public String getverIndustry() {
        return verIndustry;
    }

    public String getVerCeo() { return verCeo; }

    public String getsum() {
        return verSum;
    }
}
