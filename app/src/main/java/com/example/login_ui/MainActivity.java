package com.example.login_ui;

import android.os.Bundle;
import android.view.View;
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

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email_text = email.getText().toString();
                String password_text = password.getText().toString();

                if (email_text.equals("madeel466466@gmail.com") && password_text.equals("2126")) {
                    setContentView(R.layout.second_activity);
                } else {
                    email.setError("Invalid email or password");
                    password.setError("Invalid email or password");
                }
            }}
        );







    }
}