package com.android45.android45_bt4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class AdapterFood extends BaseAdapter {

    List<Food> foodList;

    public AdapterFood(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.activity_food,parent,false);

        TextView tvNameFood = view.findViewById(R.id.tvNameFood);
        TextView tvInfor = view.findViewById(R.id.tvInfor);
        ImageView imgFood= view.findViewById(R.id.imgFood);

        Food food = foodList.get(position);


        tvNameFood.setText(food.getNameFood());
        tvInfor.setText(String.valueOf(food.getInfor()));
        imgFood.setImageResource(food.getImgFood());

        return view;
    }
}
