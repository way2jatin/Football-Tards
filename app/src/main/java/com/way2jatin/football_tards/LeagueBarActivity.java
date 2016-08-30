package com.way2jatin.football_tards;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class LeagueBarActivity extends TabActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabsleague);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, Tab1League.class);
        spec = tabHost.newTabSpec("EPL").setIndicator("EPL")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab2League.class);
        spec = tabHost.newTabSpec("La Liga").setIndicator("La Liga")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Tab3League.class);
        spec = tabHost.newTabSpec("ISL").setIndicator("ISL")
                .setContent(intent);
        tabHost.addTab(spec);


    }
}