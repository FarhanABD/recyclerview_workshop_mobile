package com.example.recyclerview.Model;

public class itemList {
    private String foodtitle;
    private int imageId;

    public itemList(String foodtitle, int imageId) {
        this.foodtitle = foodtitle;
        this.imageId = imageId;
    }

    public String getFoodtitle() {
        return foodtitle;
    }

    public void setFoodtitle(String foodtitle) {
        this.foodtitle = foodtitle;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
