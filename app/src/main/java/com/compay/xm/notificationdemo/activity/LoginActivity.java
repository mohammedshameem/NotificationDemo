package com.compay.xm.notificationdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.compay.xm.notificationdemo.R;
import com.compay.xm.notificationdemo.Utilvalidate.UtilValidate;
import com.compay.xm.notificationdemo.holder.UserObjectHolder;
import com.compay.xm.notificationdemo.managers.LoginManagerClass;
import com.compay.xm.notificationdemo.webservice.AsyncTaskCallBack;

public class LoginActivity extends ActionBarActivity implements View.OnClickListener {
    LoginCallBackClass loginCallBackClass;
    EditText etUserName, etUserPassword;
    Button btClearText, btLogin;
    private boolean emailFlag;
    private boolean passwordEmptyFlag;
    String Email, Password;
    private int requestcode = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        initLoginManager();
    }

    private void initViews() {
        etUserName = (EditText) findViewById(R.id.etUserName);
        etUserPassword = (EditText) findViewById(R.id.etUserPassword);
        btClearText = (Button) findViewById(R.id.btClearText);
        btLogin = (Button) findViewById(R.id.btLogin);
        btClearText.setOnClickListener(this);
        btLogin.setOnClickListener(this);
    }

    private void initLoginManager() {
        loginCallBackClass = new LoginCallBackClass();
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btClearText:
                etUserName.setText("");
                etUserPassword.setText("");
                break;
            case R.id.btLogin:
                checkDetails();
                break;
        }

    }

    private void checkDetails() {
        if (!etUserName.getText().toString().equalsIgnoreCase("")) {
            emailFlag = true;
            Email = etUserName.getText().toString();
        } else {
            emailFlag = false;
            etUserName.setError("Enter UME-ID");
        }
        if (etUserPassword.getText().length() == 0) {
            passwordEmptyFlag = false;
        } else {
            passwordEmptyFlag = true;
            Password = etUserPassword.getText().toString();
        }
        if (emailFlag && passwordEmptyFlag) {
            LoginManagerClass.getInstance().emailLogin(LoginActivity.this, Email, Password, loginCallBackClass, requestcode);
        }

    }

    private class LoginCallBackClass implements AsyncTaskCallBack {
        @Override
        public void onFinish(int responseCode, Object result) {
            final UserObjectHolder userObjectHolder = (UserObjectHolder) result;
            if (UtilValidate.isNotNull(userObjectHolder)) {
                if (userObjectHolder.getStatus().equalsIgnoreCase("failure")) {

                    Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
                }
                if (userObjectHolder.getStatus().equalsIgnoreCase("success")) {

                    Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
                    if (UtilValidate.isNotNull(userObjectHolder)) {

                        if (UtilValidate.isNotNull(userObjectHolder.getUser())) {

                            Intent i = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        }

                    }
                }

            }
        }

        @Override
        public void onFinish(int responseCode, String result) {

        }
    }
}
