package com.denobaba.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById<WebView>(R.id.web) as WebView

        webView.loadUrl("https://yagizhanbilaldurak.com/")

        webView.settings.javaScriptEnabled = true

        webView.webViewClient= WebViewClient()

        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}