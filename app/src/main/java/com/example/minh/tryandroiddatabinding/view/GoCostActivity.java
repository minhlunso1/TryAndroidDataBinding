package com.example.minh.tryandroiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
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

        binding.etDistance.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                goCostViewModel.setCost(s.toString(), binding.etUnit.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.etUnit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                goCostViewModel.setCost(binding.etDistance.getText().toString(), s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
