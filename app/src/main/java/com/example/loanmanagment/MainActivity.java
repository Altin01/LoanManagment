package com.example.loanmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin;
     TextView buttonSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSignUp=(TextView) findViewById(R.id.btn_SingUp);
        buttonLogin = (Button) findViewById(R.id.btn_login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "you clicked on SignIn", Toast.LENGTH_LONG).show();

            }
        });
         buttonSignUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this,SignUp_Activity.class);
                 startActivity(intent);
                 Toast.makeText(MainActivity.this,"you clicked on SignUp",Toast.LENGTH_LONG).show();
             }
         });
    }

}
