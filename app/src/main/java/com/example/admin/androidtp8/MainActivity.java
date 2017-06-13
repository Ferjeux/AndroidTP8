package com.example.admin.androidtp8;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected  void envoyer(){
        EditText message = (EditText) findViewById(R.id.sms);
        EditText numero = (EditText) findViewById(R.id.numero);
        //String uri = "smsto:" + numero.getText().toString();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(numero.getText().toString(), null, message.getText().toString(), null, null);

       /*Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(uri));
        intent.putExtra("sms_body", message.getText().toString());
        startActivity(intent);*/
    }

    public void Envoi(View view) {

        this.envoyer();

    }
}
