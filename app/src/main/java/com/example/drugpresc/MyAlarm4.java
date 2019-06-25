package com.example.drugpresc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;

public class MyAlarm4 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mediaPlayer=MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.start();
        Intent inalarm4;
        inalarm4 = new Intent(context,AlarmScreen4.class);
        context.startActivity(inalarm4);


    }
}
