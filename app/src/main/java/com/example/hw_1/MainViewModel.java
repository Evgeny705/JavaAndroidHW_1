package com.example.hw_1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

//    public String name = "Anonimous";

    public MutableLiveData<String> name = new MutableLiveData<>("Anonimus");
    public MutableLiveData<Integer> clickCount = new MutableLiveData<>(0);

}
