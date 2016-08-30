package com.way2jatin.football_tards;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PagesFragment extends Fragment {

    public PagesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);
        Intent intent = new Intent(getActivity(), LeagueBarActivity.class);
        startActivity(intent);
        return rootView;
    }
}
