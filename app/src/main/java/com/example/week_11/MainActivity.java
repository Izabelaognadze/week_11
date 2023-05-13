package com.example.week_11;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import androidx.core.app.NotificationCompat;
import android.content.Intent;


public class MainActivity extends Activity {
    Button b1;
    super.onCreate(savedInstanceState);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentview(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(v ->addNotification());
    }
    private void addNotification() {
        NotificationCompat.Builder builder =
        new NotificationCompat.Builder (this)
            .setSmallIcon(R.drawable.baseline_accessibility_new_24)
            .setContentTitle("notification example")
            .setContentText("this is a text notification");
        Intent notificationIntent = new intent(this, MainActivity.class);
        @SuppressLint("UnspecifiedImmutableFlag") PendingIntent contentIntent = PendingIntent . getActivity
                (this, 0, notificationIntent, pendingIntent.FLAG_UPADTE_CURRENT);
        builder.setContentIntent(contentIntent);

        NotificationManager manager (notificationManager) getSystemService
    }
}
