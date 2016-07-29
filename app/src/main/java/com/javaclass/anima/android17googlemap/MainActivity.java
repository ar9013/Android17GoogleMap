package com.javaclass.anima.android17googlemap;

import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    private LocationManager lmgr;
   // private MyLocationListener listener;
    private TextView tv;
   // private UIHandler handler;
    private Timer timer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        lmgr = (LocationManager) getSystemService(LOCATION_SERVICE);

        webview = (WebView) findViewById(R.id.webView);
        initwebview();

    }

    private void initwebview(){

        WebSettings settings =webview.getSettings();
        settings.setJavaScriptEnabled(true);

//        webview.addJavascriptInterface();
        webview.loadUrl("file:///android_asset/brad.html");
    }



}
