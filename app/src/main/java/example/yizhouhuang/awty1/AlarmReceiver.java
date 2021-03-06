package example.yizhouhuang.awty1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by yizhouhuang on 5/14/15.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String phoneNum = intent.getStringExtra("phone");
        String message = intent.getStringExtra("message");

        Toast.makeText(context, phoneNum + ":" + message, Toast.LENGTH_SHORT).show();

    }
}
