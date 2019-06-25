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

public class SyrupAlarm extends AppCompatActivity {
    private TimePicker tkp;
    private  Button bsrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrup_alarm);
        tkp=(TimePicker) findViewById(R.id.tp4);
        bsrp=(Button) findViewById(R.id.syrlarm1);
        bsrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal5 = Calendar.getInstance();
                if (Build.VERSION.SDK_INT >= 23) {
                    cal5.set(
                            cal5.get(Calendar.YEAR),
                            cal5.get(Calendar.MONTH),
                            cal5.get(Calendar.DAY_OF_MONTH),
                            tkp.getHour(),
                            tkp.getMinute(),
                            0
                    );
                }
                else {
                    cal5.set(
                            cal5.get(Calendar.YEAR),
                            cal5.get(Calendar.MONTH),
                            cal5.get(Calendar.DAY_OF_MONTH),
                            tkp.getCurrentHour(),
                            tkp.getCurrentMinute(),
                            0
                    );

                }
                setAlarm(cal5.getTimeInMillis());
            }
        });

    }

    private void setAlarm(long timeInMillis) {
        AlarmManager alarmManagersy=(AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intentsy=new Intent(this,MyAlarm4.class);
        PendingIntent pisy=PendingIntent.getBroadcast(this,0,intentsy,0);
        alarmManagersy.setRepeating(AlarmManager.RTC_WAKEUP,timeInMillis,AlarmManager.INTERVAL_DAY,pisy);
        Toast.makeText(this,"Reminder is Set",Toast.LENGTH_SHORT).show();



    }
}
