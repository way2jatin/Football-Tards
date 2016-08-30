package com.way2jatin.football_tards;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class Tab3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.serieatable);
        final WebView wv = (WebView) findViewById(R.id.webPage);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://footballtards.com/serie-a/");
        wv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        wv.setWebViewClient(new WebViewClient() {


            public void onPageFinished(WebView view, String url) {
                wv.loadUrl("javascript:document.getElementById('masthead').style.display = 'none';");
                wv.loadUrl("javascript:document.getElementById('widget-area-2').style.display = 'none';");

            }

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                final Toast showToastMessage = Toast.makeText(Tab3Activity.this, "Loading", Toast.LENGTH_SHORT);

                showToastMessage.show();

                view.loadUrl(url);
                return false;
            }
        });
    }

}