package com.hfad.surveybox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {

    private EditText subscriptionText;
    private String subscriptionString = "Please set a subscription value.";
    private Button lockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        subscriptionText = (EditText)findViewById(R.id.subscriptionTextID);
        lockButton = (Button) findViewById(R.id.lockButtonID);

        lockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(SettingsActivity.this, SurveyActivity.class));

                //Store contents of subscription text field in subscriptionString variable as string.
                subscriptionString = subscriptionText.getText().toString();

                //Switch activities and pass string to SurveyActivity.
                Intent myIntent = new Intent(SettingsActivity.this, SurveyActivity.class);
                myIntent.putExtra("subscriptionKey", subscriptionString); //Optional parameters
                SettingsActivity.this.startActivity(myIntent);

                }
            }
        );
    }
}
