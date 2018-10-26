package jic8138.jic9138androidsmarttreatmentcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText mEmailTextField;
    private EditText mPasswordTextField;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        mEmailTextField = findViewById(R.id.login_email);
        mPasswordTextField = findViewById(R.id.login_password);
        mLoginButton = findViewById(R.id.login_button);
    }

    private void onLoginTap() {
        //TODO: Add database logic for login
        this.finish();
    }
}