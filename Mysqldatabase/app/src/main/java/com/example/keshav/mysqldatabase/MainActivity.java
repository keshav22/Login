package com.example.keshav.mysqldatabase;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt,PasswordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt=(EditText)findViewById(R.id.etusername);
        PasswordEt=(EditText)findViewById(R.id.etpassword);
    }

    public void onlogin(View view)
    {
        String username=UsernameEt.getText().toString();
        String password=PasswordEt.getText().toString();
        String type="login";
        BackgroundWork backgroundWork=new BackgroundWork(this);
        backgroundWork.execute(type,username,password);

    }
}
