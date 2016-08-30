package com.way2jatin.football_tards;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PhotosFragment extends Fragment {

    public PhotosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        final WebView wv = (WebView) rootView.findViewById(R.id.webPage);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://footballtards.com/live-score");
        wv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);


        wv.setWebViewClient(new WebViewClient() {

            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                wv.loadUrl("javascript:document.getElementById('masthead').style.display = 'none';");
                wv.loadUrl("javascript:document.getElementById('widget-area-2').style.display = 'none';");

            }

            public void onPageFinished(WebView view, String url) {
            }

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });

        return rootView;
    }
}
