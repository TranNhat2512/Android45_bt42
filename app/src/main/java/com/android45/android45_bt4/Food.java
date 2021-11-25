package com.android45.android45_bt4;;

public class Food {
    String nameFood, infor;
    int imgFood;

    public Food(String nameFood, String infor, int imgFood) {
        this.nameFood = nameFood;
        this.infor = infor;
        this.imgFood = imgFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }
}