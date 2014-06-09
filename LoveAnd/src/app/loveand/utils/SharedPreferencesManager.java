package app.loveand.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager
{

	public static SharedPreferences getSP(Context context) {
		SharedPreferences sp = context.getSharedPreferences("config",Context.MODE_PRIVATE);
		return sp;
	}

}

