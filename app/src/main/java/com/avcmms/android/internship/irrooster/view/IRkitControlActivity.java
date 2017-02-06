package com.avcmms.android.internship.irrooster.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.avcmms.android.internship.irrooster.R;
import com.avcmms.android.internship.irrooster.model.IRkitControlloer;


public class IRkitControlActivity extends AppCompatActivity implements View.OnClickListener {

    private IRkitControlloer mIrkitController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIrkitController = new IRkitControlloer(getApplicationContext());

        ((Button) findViewById(R.id.btn_cnl1)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl2)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl3)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl4)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl5)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl6)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl7)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl8)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl9)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl10)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl11)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_cnl12)).setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(final View v) {
        if (mIrkitController != null) {
            mIrkitController.sendCommand(mIrkitController.getChanelId(v.getId()));
        }
    }

}
