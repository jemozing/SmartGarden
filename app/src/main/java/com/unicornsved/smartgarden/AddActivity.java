package com.unicornsved.smartgarden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.unicornsved.smartgarden.databinding.ActivityAddBinding;

public class AddActivity extends AppCompatActivity {

    ActivityAddBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        binding = ActivityAddBinding.inflate(getLayoutInflater());
        binding.okButton.setOnClickListener(v -> {
            setContentView(R.layout.activity_main);
        });
    }
}