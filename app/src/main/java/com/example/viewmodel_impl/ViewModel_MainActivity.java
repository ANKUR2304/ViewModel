package com.example.viewmodel_impl;

import androidx.lifecycle.ViewModel;

public class ViewModel_MainActivity extends ViewModel {
    private int count = 0;

    public void increaseCount(){
        count++;
        return;
    }

    public int getCount(){
        return count;
    }
}
