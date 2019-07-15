package com.example.mohit.logindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //inital
    private EditText name_a, pass_a;
    private Button login_a;
    private TextView txt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mapping
        txt_view = findViewById(R.id.txt_view);
        name_a = findViewById(R.id.edt_name);
        pass_a = findViewById(R.id.edt_pass);
        login_a = findViewById(R.id.btn_login);

        login_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //value store
                String hh = name_a.getText().toString();
                txt_view.setText("user added :" + hh);
                Toast.makeText(MainActivity.this, "hello user" + hh, Toast.LENGTH_LONG).show();
            }
        });


    }
}
