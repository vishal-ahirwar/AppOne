package com.vishal.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Making full name  by adding firstname(edittext) and lastname(edittext)
    public void btnChange(View view)
    {
        TextView fullName=findViewById(R.id.fullName);
        EditText firstNaame=findViewById(R.id.firstName);
        EditText lastName=findViewById(R.id.lastName);
        fullName.setText(firstNaame.getText()+" "+lastName.getText());
    }

}