package com.jio.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.jio.testlibrary.BluetoothDetails;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BluetoothDetails bluetoothDetails = new BluetoothDetails();
    }
}