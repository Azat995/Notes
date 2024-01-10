package com.example.notes.ui.draws

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DrawsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Draws Fragment"
    }
    val text: LiveData<String> = _text
}