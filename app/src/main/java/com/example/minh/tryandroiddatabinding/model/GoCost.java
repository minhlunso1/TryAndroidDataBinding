package com.example.minh.tryandroiddatabinding.model;

/**
 * Created by Administrator on 08-Oct-15.
 */
public class GoCost {
    private int distance;
    private int unit;
    private int cost;

    public GoCost() {
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance){
        this.distance=distance;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getCost() {
        return distance*unit;
    }
}

//public class GoCost{
//    private String distance;
//    private String unit;
//    private String cost;
//
//    public GoCost(String distance, String unit) {
//        this.distance = distance;
//        this.unit = unit;
//    }
//
//    public String getDistance() {
//        return distance;
//    }
//
//    public void setDistance(String distance) {
//        this.distance = distance;
//    }
//
//    public String getUnit() {
//        return unit;
//    }
//
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }
//
//    public String getCost() {
//        return String.valueOf(int.parseint(getDistance()) * Integer.parseInt(getUnit()));
//    }
//
//    public void setCost(String cost) {
//        this.cost = cost;
//    }
//}