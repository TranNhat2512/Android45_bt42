package com.android45.android45_bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvFood;
    List<Food> foodList;
    Food food1,food2, food3, food4, food5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFood = findViewById(R.id.lvFood);
        foodList = new ArrayList();

        food1=new Food("Món Huế","Phở Mì Bún, Cơm,  50000d", R.drawable.food_3);
        food2=new Food("Cafe","Coffee, 20000d", R.drawable.coffe_1);
        food3=new Food("Doner Kebab","Bánh mì, 20000d", R.drawable.doner_1);
        food4=new Food("Cơm mẹ nấu"," Cơm nhà, cơm vườn, 30000d", R.drawable.food_2);
        food5=new Food("Thịt Bò","Món Tây, 200000d", R.drawable.food_1);

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
        foodList.add(food5);

        AdapterFood adapterFood=new AdapterFood(foodList);

        lvFood.setAdapter(adapterFood);


    }
}