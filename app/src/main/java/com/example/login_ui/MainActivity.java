package com.example.login_ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);



        setContentView(R.layout.activity_main);
        EditText email=findViewById(R.id.editTextTextEmailAddress);
        EditText password=findViewById(R.id.editTextTextEmailAddress2);
        Button login=findViewById(R.id.button);
        TextView forget=findViewById(R.id.textView2);
        TextView dont=findViewById(R.id.textView);







    }
}