package com.example.muslima.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.muslima.R;

public class TermsActivity extends AppCompatActivity {
    private WebView webView_terms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        webView_terms = findViewById(R.id.webview_terms);

        webView_terms.setWebViewClient(new WebViewClient());

        webView_terms.loadUrl("http:alazwaj.pk/Contents/pages/terms-and-conditions/");

        WebSettings webSettings =
                webView_terms.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (
                webView_terms.canGoBack()) {

            webView_terms.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
