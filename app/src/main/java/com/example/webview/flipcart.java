package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class flipcart extends AppCompatActivity {

    WebView flipcart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipcart);
        initBinding();
        loadUri();
    }
    void initBinding()
    {
        flipcart=findViewById(R.id.flipcart);
    }
    @SuppressLint("SetJavaScriptEnabled")
    void loadUri()
    {
        flipcart.loadUrl("https://www.flipkart.com");
        flipcart.getSettings().setJavaScriptEnabled(true);
    }
}