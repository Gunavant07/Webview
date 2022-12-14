package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class amazone extends AppCompatActivity {
    WebView amazon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazone);
        initBinding();
        loadUri();
    }
    void initBinding()
    {
        amazon=findViewById(R.id.amazon);
    }
    @SuppressLint("SetJavaScriptEnabled")
    void loadUri()
    {
        amazon.loadUrl("https://www.amazon.in/");
        amazon.getSettings().setJavaScriptEnabled(true);
    }

}