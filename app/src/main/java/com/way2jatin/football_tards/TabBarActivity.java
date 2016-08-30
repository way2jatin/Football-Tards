package com.way2jatin.football_tards;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabBarActivity extends TabActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabstables);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, Tab1Activity.class);
        spec = tabHost.newTabSpec("EPL").setIndicator("EPL")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab2Activity.class);
        spec = tabHost.newTabSpec("La Liga").setIndicator("La Liga")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab3Activity.class);
        spec = tabHost.newTabSpec("Serie A").setIndicator("Serie A")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab4Activity.class);
        spec = tabHost.newTabSpec("CL").setIndicator("CL")
                .setContent(intent);
        tabHost.addTab(spec);


    }
}