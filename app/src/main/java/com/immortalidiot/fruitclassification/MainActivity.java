package com.immortalidiot.fruitclassification;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToCameraActivity(View v) {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void switchToCreditsActivity(View v) {
        Intent intent = new Intent(this, CreditsActivity.class);
        startActivity(intent);
    }

    public void showExitHint(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", ((dialog, which) -> finish()))
                .setNegativeButton("No", ((dialog, which) -> dialog.cancel()));

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}