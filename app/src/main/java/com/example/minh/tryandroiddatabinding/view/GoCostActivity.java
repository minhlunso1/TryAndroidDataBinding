package com.example.minh.tryandroiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.minh.tryandroiddatabinding.R;
import com.example.minh.tryandroiddatabinding.databinding.GoCostActivityBinding;
import com.example.minh.tryandroiddatabinding.model.GoCost;
import com.example.minh.tryandroiddatabinding.viewmodel.GoCostViewModel;

/**
 * Created by Administrator on 08-Oct-15.
 */
public class GoCostActivity extends AppCompatActivity {
    private GoCostActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.go_cost_activity);
        final GoCostViewModel goCostViewModel = new GoCostViewModel(new GoCost());
        binding.setGoCostVM(goCostViewModel);
    }
}
