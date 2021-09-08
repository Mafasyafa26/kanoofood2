package com.mafaa.kanoofood.admin_ui.store;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StoreViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public StoreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is store fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}