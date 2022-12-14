package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class swiggy extends AppCompatActivity {

    WebView swiggy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy);
        initBinding();
        loadUri();
    }
    void initBinding()
    {
        swiggy=findViewById(R.id.swiggy);
    }
    @SuppressLint("SetJavaScriptEnabled")
    void loadUri()
    {
        swiggy.loadUrl("https://www.swiggy.com/");
        swiggy.getSettings().setJavaScriptEnabled(true);
    }
}