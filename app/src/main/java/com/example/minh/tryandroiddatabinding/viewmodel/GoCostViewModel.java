package com.example.minh.tryandroiddatabinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.example.minh.tryandroiddatabinding.BR;
import com.example.minh.tryandroiddatabinding.model.GoCost;

/**
 * Created by Administrator on 08-Oct-15.
 */
public class GoCostViewModel extends BaseObservable {
    private final GoCost model;

    public GoCostViewModel(GoCost model) {
        this.model = model;
    }

    public GoCost getModel() {
        return model;
    }

    public String getDistance(){
        return String.valueOf(model.getDistance());
    }

    public String getUnit(){
        return String.valueOf(model.getUnit());
    }

    @Bindable
    public String getCost(){;
        return  String.valueOf(model.getCost());
    }

    public void setCost(String distance, String unit){
        Integer distanceModel;
        Integer unitModel;
        try {
            distanceModel = Integer.parseInt(distance);
            unitModel = Integer.parseInt(unit);
            model.setDistance(distanceModel);
            model.setUnit(unitModel);
        } catch (NumberFormatException e){
            return;
        }
        notifyPropertyChanged(BR.cost);
    }

    public TextWatcher getDistanceWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int tmp = Integer.parseInt(s.toString());
                    model.setDistance(tmp);
                    notifyPropertyChanged(BR.cost);
                } catch (NumberFormatException e){
                    return;
                }
            }
        };
    }

    public TextWatcher getUnitWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int tmp = Integer.parseInt(s.toString());
                    model.setUnit(tmp);
                    notifyPropertyChanged(BR.cost);
                } catch (NumberFormatException e){
                    return;
                }
            }
        };
    }

}
