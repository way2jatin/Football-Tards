package com.way2jatin.football_tards;


import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        final WebView wv = (WebView) rootView.findViewById(R.id.webPage);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);


        wv.setWebViewClient(new WebViewClient() {

            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                wv.loadUrl("javascript:document.getElementById('masthead').style.display = 'none';");
                wv.loadUrl("javascript:document.getElementById('widget-area-2').style.display = 'none';");

            }

            public void onPageFinished(WebView view, String url) {
            }

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                final Toast showToastMessage = Toast.makeText(getActivity(), "Loading", Toast.LENGTH_SHORT);

                showToastMessage.show();

                view.loadUrl(url);
                return false;
            }


        });
        wv.loadUrl("http://footballtards.com");


        return rootView;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        WebView scrollView = (WebView) getActivity().findViewById(R.id.webPage);
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN) {
                    scrollView.pageUp(false);
                }
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {
                    scrollView.pageDown(false);
                }
                return true;
            default:
                return false;
        }

    }

}
