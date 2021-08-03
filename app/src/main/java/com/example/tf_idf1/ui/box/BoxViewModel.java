package com.example.tf_idf1.ui.box;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BoxViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BoxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Box fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}