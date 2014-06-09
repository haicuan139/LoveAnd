package app.loveand.utils;

import android.content.DialogInterface.OnClickListener;
import app.loveand.R;

public class LADialogConfig {
	private OnClickListener negativeButtonListener;
	private String negativeButtonText;
	private OnClickListener mPositiveButtonListener;
	private String positiveButtonText;
	private String title;
	private String message;
	private int iconId = 0;
	public OnClickListener getNegativeButtonListener() {
		return negativeButtonListener;
	}
	public void setNegativeButtonListener(OnClickListener negativeButtonListener) {
		this.negativeButtonListener = negativeButtonListener;
	}
	public String getNegativeButtonText() {
		return negativeButtonText;
	}
	public void setNegativeButtonText(String negativeButtonText) {
		this.negativeButtonText = negativeButtonText;
	}
	public OnClickListener getmPositiveButtonListener() {
		return mPositiveButtonListener;
	}
	public void setmPositiveButtonListener(OnClickListener mPositiveButtonListener) {
		this.mPositiveButtonListener = mPositiveButtonListener;
	}
	public String getPositiveButtonText() {
		return positiveButtonText;
	}
	public void setPositiveButtonText(String positiveButtonText) {
		this.positiveButtonText = positiveButtonText;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getIconId() {
		if(iconId == 0){
			iconId = R.drawable.ic_launcher;
		}
		return iconId;
	}
	public void setIconId(int iconId) {
		this.iconId = iconId;
	}
	
	
}
