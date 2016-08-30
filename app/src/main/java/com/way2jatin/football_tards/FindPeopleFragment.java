package com.way2jatin.football_tards;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FindPeopleFragment extends Fragment {

    public FindPeopleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);

        Intent intent = new Intent(getActivity(), TabBarActivity.class);
        startActivity(intent);
        return rootView;

    }
}
