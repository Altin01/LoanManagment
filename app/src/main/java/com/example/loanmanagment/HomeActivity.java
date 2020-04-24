package com.example.loanmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    ImageView buttonisettings;
    RelativeLayout buttonnewloan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonisettings = (ImageView) findViewById(R.id.buttonsettings);
        buttonnewloan=(RelativeLayout) findViewById(R.id.btn_realtivenewloan);
        buttonisettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, SettingsActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "you clicked on Settings", Toast.LENGTH_LONG).show();


            }
        });

        buttonnewloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,NewLoanActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this,"you clicked on NewLoan",Toast.LENGTH_LONG).show();
            }
        });



    }

}
