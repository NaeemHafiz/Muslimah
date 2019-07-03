package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.muslima.R;

public class PrivacyActivity extends AppCompatActivity {
    private WebView webView_privacy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        webView_privacy = (WebView) findViewById(R.id.webview);
        webView_privacy.setWebViewClient(new WebViewClient());
        webView_privacy.loadUrl("http://alazwaj.pk/Contents/pages/privacy-policy");

        WebSettings webSettings = webView_privacy.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView_privacy.canGoBack()) {
            webView_privacy.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
