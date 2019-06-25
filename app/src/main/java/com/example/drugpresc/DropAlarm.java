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

public class DropAlarm extends AppCompatActivity {
    private TimePicker tpk;
    private  Button bdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_alarm);
        tpk=(TimePicker) findViewById(R.id.tp3);
        bdp=(Button) findViewById(R.id.bdrop2);
        bdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal4 = Calendar.getInstance();
                if (Build.VERSION.SDK_INT >= 23) {
                    cal4.set(
                            cal4.get(Calendar.YEAR),
                            cal4.get(Calendar.MONTH),
                            cal4.get(Calendar.DAY_OF_MONTH),
                            tpk.getHour(),
                            tpk.getMinute(),
                            0
                    );
                }
                else {
                    cal4.set(
                            cal4.get(Calendar.YEAR),
                            cal4.get(Calendar.MONTH),
                            cal4.get(Calendar.DAY_OF_MONTH),
                            tpk.getCurrentHour(),
                            tpk.getCurrentMinute(),
                            0
                    );

                }
                setAlarm(cal4.getTimeInMillis());
            }
        });

    }

    private void setAlarm(long timeInMillis) {
        AlarmManager alarmManagerdp=(AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intentdp=new Intent(this,MyAlarm3.class);
        PendingIntent pidp=PendingIntent.getBroadcast(this,0,intentdp,0);
        alarmManagerdp.setRepeating(AlarmManager.RTC_WAKEUP,timeInMillis,AlarmManager.INTERVAL_DAY,pidp);
        Toast.makeText(this,"Reminder is Set",Toast.LENGTH_SHORT).show();



    }
}

