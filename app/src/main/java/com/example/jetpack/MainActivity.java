package com.example.jetpack;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.jetpack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    MyModel myModel ;
    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        myModel = ViewModelProviders.of(this).get(MyModel.class);
        binding.setData(myModel);
        binding.setLifecycleOwner(this);
//        myModel.getNumber().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(@Nullable Integer integer) {
//                 binding.textView.setText(String.valueOf(integer));
//            }
//        });

//        binding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myModel.add();
//            }
//        });
    }
}