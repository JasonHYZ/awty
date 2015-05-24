package edu.washington.yizhouh.awty2;


import android.app.IntentService;
import android.content.Intent;
import android.telephony.SmsManager;
import android.util.Log;

public class SendMessagerService extends IntentService {
    String phoneNo;
    String sms;

    public SendMessagerService() {
        super("SendMessagerService");
    }

    @Override
    public void onCreate() { super.onCreate(); }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        phoneNo = intent.getStringExtra("Phone");
        sms = intent.getStringExtra("message");

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, sms, null, null);

            Log.i("SendMessagerService", "Message Sent");

        } catch (Exception e) {
            Log.i("SendMessagerService", "Sent Failed");
            e.printStackTrace();
        }
    }
}
