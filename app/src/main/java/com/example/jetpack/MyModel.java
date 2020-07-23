package com.example.jetpack;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MyModel extends ViewModel {

    private MutableLiveData<Integer> number ;

    public MutableLiveData<Integer> getNumber() {
        if (null == number) {
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void add() {
        number.setValue(number.getValue() + 1);
    }
}
