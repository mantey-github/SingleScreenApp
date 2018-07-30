package com.mantey.makeduconsult;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCurrentWorkingDay();
    }


    /**
     * This method highlights the current working day of the company
     */
    public void setCurrentWorkingDay() {
        TextView mondayText = findViewById(R.id.monday);
        TextView mondayTimeText = findViewById(R.id.monday_time);
        TextView tuesdayText = findViewById(R.id.tuesday);
        TextView tuesdayTimeText = findViewById(R.id.tuesday_time);
        TextView wednesdayText = findViewById(R.id.wednesday);
        TextView wednesdayTimeText = findViewById(R.id.wednesday_time);
        TextView thursdayText = findViewById(R.id.thursday);
        TextView thursdayTimeText = findViewById(R.id.thursday_time);
        TextView fridayText = findViewById(R.id.friday);
        TextView fridayTimeText = findViewById(R.id.friday_time);
        TextView saturdayText = findViewById(R.id.saturday);
        TextView saturdayTimeText = findViewById(R.id.saturday_time);
        TextView sundayText = findViewById(R.id.sunday);
        TextView sundayTimeText = findViewById(R.id.sunday_time);

        String current_day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(new Date());

        switch (current_day) {
            case "Monday":
                mondayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                mondayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;

            case "Tuesday":
                tuesdayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                tuesdayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;


            case "Wednesday":
                wednesdayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                wednesdayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;

            case "Thursday":
                thursdayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                thursdayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;

            case "Friday":
                fridayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                fridayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;

            case "Saturday":
                saturdayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                saturdayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;

            case "Sunday":
                sundayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                sundayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                break;

            default:
                mondayText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
                mondayTimeText.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        }


    }
}
