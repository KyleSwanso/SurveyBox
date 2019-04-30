package com.hfad.surveybox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SurveyFragment extends Fragment {
    private TextView questionText;

    public SurveyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey, container, false);

        Bundle bundle = getArguments();
        String subscriptionString = bundle.getString(SettingsActivity.SUBSCRIPTION_KEY);

        questionText = view.findViewById(R.id.questionTextID);
        questionText.setText(subscriptionString);
        return view;
    }


}
