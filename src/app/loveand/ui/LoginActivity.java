package app.loveand.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import app.loveand.R;

public class LoginActivity extends BaseActivity {

	private EditText mLoginPassEdit;
	private EditText mLoginUserEdit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initView();
	}
	@Override
	protected void initView() {
		mLoginUserEdit = (EditText) findViewById(R.id.login_user_edittext);
		mLoginPassEdit = (EditText) findViewById(R.id.login_password_edittext);
		mLoginUserEdit.setHintTextColor(getResources().getColor(R.color.hitcolor));
		mLoginPassEdit.setHintTextColor(getResources().getColor(R.color.hitcolor));
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.login_new_user:
			startActivity(new Intent(this,RegActivity.class));
			break;
		case R.id.loging_recover_bt:
			startActivity(new Intent(this,RecoverPasswordActivity.class));
			break;
			
		default:
			break;
		}
	}
}
