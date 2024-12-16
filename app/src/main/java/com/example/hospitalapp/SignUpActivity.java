package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        et1=(EditText) findViewById(R.id.Name);
        et2=(EditText) findViewById(R.id.Addr);
        et3=(EditText) findViewById(R.id.pi);
        et4=(EditText) findViewById(R.id.Mob);
        et5=(EditText) findViewById(R.id.Uname1);
        et6=(EditText) findViewById(R.id.Pass1);
        et7=(EditText) findViewById(R.id.Pass2);
        b1=(Button) findViewById(R.id.Sign);
        b2=(Button) findViewById(R.id.Login);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
            }
        });

    }
}