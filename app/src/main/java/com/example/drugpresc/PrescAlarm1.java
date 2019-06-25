package com.example.drugpresc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class PrescAlarm1 extends AppCompatActivity {
    private TimePicker timePicker;
    private Button balarm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presc_alarm1);
        timePicker=(TimePicker) findViewById(R.id.tp1);
        balarm1=(Button) findViewById(R.id.balarm1);
        balarm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal2 = Calendar.getInstance();
                if (Build.VERSION.SDK_INT >= 23) {
                    cal2.set(
                            cal2.get(Calendar.YEAR),
                            cal2.get(Calendar.MONTH),
                            cal2.get(Calendar.DAY_OF_MONTH),
                            timePicker.getHour(),
                            timePicker.getMinute(),
                            0
                    );
                }
                else {
                    cal2.set(
                            cal2.get(Calendar.YEAR),
                            cal2.get(Calendar.MONTH),
                            cal2.get(Calendar.DAY_OF_MONTH),
                            timePicker.getCurrentHour(),
                            timePicker.getCurrentMinute(),
                            0
                    );

                }
                setAlarm(cal2.getTimeInMillis());
            }
        });

    }

    private void setAlarm(long timeInMillis) {
        AlarmManager alarmManager=(AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intent=new Intent(this,MyAlarm.class);
        PendingIntent pi=PendingIntent.getBroadcast(this,0,intent,0);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,timeInMillis,AlarmManager.INTERVAL_DAY,pi);
        Toast.makeText(this,"Reminder is Set",Toast.LENGTH_SHORT).show();



    }
}
