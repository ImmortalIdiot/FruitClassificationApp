package com.immortalidiot.fruitclassification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CreditsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    public void telegramImmortalIdiot(View v) {
        try {
            Intent telegram = new Intent(Intent.ACTION_VIEW);
            telegram.setData(Uri.parse("https://t.me/Immortal_Idiot"));
            startActivity(telegram);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void telegramSuomi(View v) {
        try {
            Intent telegram = new Intent(Intent.ACTION_VIEW);
            telegram.setData(Uri.parse("https://t.me/@Suomi555"));
            startActivity(telegram);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void telegramAlexanderGorodnikov(View v) {
        try {
            Intent telegram = new Intent(Intent.ACTION_VIEW);
            telegram.setData(Uri.parse("https://t.me/jasever"));
            startActivity(telegram);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void telegramTanyyaako(View v) {
        try {
            Intent telegram = new Intent((Intent.ACTION_VIEW));
            telegram.setData(Uri.parse("https://t.me/@tanyyaako"));
            startActivity(telegram);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void goBack(View v) {
        finish();
    }
}