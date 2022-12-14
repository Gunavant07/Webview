package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class tatacliq extends AppCompatActivity {
    WebView tatacliq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatacliq);
        initBinding();
        loadUri();
    }
    void initBinding()
    {
        tatacliq=findViewById(R.id.tatacliq);
    }
    @SuppressLint("SetJavaScriptEnabled")
    void loadUri()
    {
        tatacliq.loadUrl("\n" + "https://www.snapdeal.com/\n");
        tatacliq.getSettings().setJavaScriptEnabled(true);
    }
}