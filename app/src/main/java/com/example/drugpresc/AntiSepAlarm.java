package com.example.drugpresc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class AntiSepAlarm extends AppCompatActivity {
    private TimePicker tpr;
    private Button bas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_sep_alarm);
        tpr=(TimePicker) findViewById(R.id.tp2);
        bas=(Button) findViewById(R.id.bsyal1);
        bas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal3 = Calendar.getInstance();
                if (Build.VERSION.SDK_INT >= 23) {
                    cal3.set(
                            cal3.get(Calendar.YEAR),
                            cal3.get(Calendar.MONTH),
                            cal3.get(Calendar.DAY_OF_MONTH),
                            tpr.getHour(),
                            tpr.getMinute(),
                            0
                    );
                }
                else {
                    cal3.set(
                            cal3.get(Calendar.YEAR),
                            cal3.get(Calendar.MONTH),
                            cal3.get(Calendar.DAY_OF_MONTH),
                            tpr.getCurrentHour(),
                            tpr.getCurrentMinute(),
                            0
                    );

                }
                setAlarm(cal3.getTimeInMillis());
            }
        });

    }

    private void setAlarm(long timeInMillis) {
        AlarmManager alarmManageras=(AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intentas=new Intent(this,MyAlarm2.class);
        PendingIntent pias=PendingIntent.getBroadcast(this,0,intentas,0);
        alarmManageras.setRepeating(AlarmManager.RTC_WAKEUP,timeInMillis,AlarmManager.INTERVAL_DAY,pias);
        Toast.makeText(this,"Reminder is Set",Toast.LENGTH_SHORT).show();



    }
}

