package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.muslima.R;

public class AboutusActivity extends AppCompatActivity {
    private WebView webView_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        webView_about =  findViewById(R.id.webview_about);
        webView_about.setWebViewClient(new WebViewClient());
        webView_about.loadUrl("http://alazwaj.pk/Contents/pages/About-Us");

        WebSettings webSettings = webView_about.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView_about.canGoBack()) {
            webView_about.goBack();
        } else {
            super.onBackPressed();
    }


        }
}
