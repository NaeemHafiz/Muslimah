package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.muslima.R;

public class SuccesStoryActivity extends AppCompatActivity {
    private WebView webView_success;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes_story);

        webView_success =  findViewById(R.id.webview_success);
        webView_success.setWebViewClient(new WebViewClient());
        webView_success.loadUrl("http://alazwaj.pk/Contents/pages/About-Us");

        WebSettings webSettings = webView_success.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView_success.canGoBack()) {
            webView_success.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
