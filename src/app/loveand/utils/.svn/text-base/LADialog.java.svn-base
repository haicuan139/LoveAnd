package app.loveand.utils;

import android.app.AlertDialog;
import android.content.Context;


public class LADialog {

	private static LADialog mLADialog;
	private static LADialogConfig mLADialogConfig;
	private static AlertDialog.Builder builder;
	private LADialog( ) {
		
	}
	
	public static LADialog getInstance(Context context  ,  LADialogConfig dialogConfig){
		if(mLADialog == null){
			mLADialog = new LADialog();
		}
		mLADialogConfig  = dialogConfig;
		initDialog(context);
		return mLADialog;
	}
	public void show(){
		builder.show();
	}
	private static void initDialog(Context context) {
		builder = new AlertDialog.Builder(context);
		builder.setIcon(mLADialogConfig.getIconId());
		builder.setMessage(mLADialogConfig.getMessage());
		builder.setTitle(mLADialogConfig.getTitle());
		builder.setPositiveButton(mLADialogConfig.getPositiveButtonText(), mLADialogConfig.getmPositiveButtonListener());
		builder.setNegativeButton(mLADialogConfig.getNegativeButtonText(), mLADialogConfig.getNegativeButtonListener());
	}
}
