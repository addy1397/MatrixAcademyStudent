package com.addyaddy.matrixacademystudent.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.addyaddy.matrixacademystudent.main.MainActivity;
import com.addyaddy.matrixacademystudent.R;

public class LoginActivity extends AppCompatActivity {

    private EditText idEditText,passwordEditText;
    private Button buttonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idEditText = (EditText) findViewById(R.id.loginIdEditText);
        passwordEditText = (EditText) findViewById(R.id.loginPasswordEditText);

        buttonEnter = (Button) findViewById(R.id.loginEnterButton);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id,password;
                id = idEditText.getText().toString();
                password = passwordEditText.getText().toString();

                if(id.equals("addy") && password.equals("1234"))
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    idEditText.getText().clear();
                    passwordEditText.getText().clear();
                    Toast.makeText(getApplicationContext(),"Re-enter Id and Password" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
