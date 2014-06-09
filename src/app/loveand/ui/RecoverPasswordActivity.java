package app.loveand.ui;

import android.os.Bundle;
import android.view.View;
import app.loveand.R;

public class RecoverPasswordActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recover_password);
	}
	@Override
	public void onClick(View v) {
		super.onClick(v);
		finish();
	}
}
