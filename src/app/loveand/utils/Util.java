package app.loveand.utils;

import java.io.File;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;


public class Util {

	private static final String APP_VERSION = "app_version";
	private static final String IS_FIRST_START = "isfirstrun";
			
	/**
     * Convert from DIP value to Pixel value.
     * @param dip Value in DIP
     * @return Value in Pixel
     */
    public static int dip2px(float dip , Context context) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dip * scale + 0.5f);
    }

    /**
     * Convert from Pixel value to DIP value.
     * @param pixel Value in Pixel
     * @return Value in DIP
     */
    public static int px2dip(float pixel , Context context) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pixel / scale + 0.5f);
    }

	public static void saveVersionCode(Context context){
		SharedPreferences sp = SharedPreferencesManager.getSP(context);
		int version;
		try {
			version = context.getPackageManager().getPackageInfo(
					context.getPackageName(), 0).versionCode;
			sp.edit().putInt(APP_VERSION, version).commit();
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 判断APP是否更新
	 */
	public static boolean isFirstStartFromVersonCode(Context context)
	{
		try
		{
			SharedPreferences sp = SharedPreferencesManager.getSP(context);
			int version = context.getPackageManager().getPackageInfo(
					context.getPackageName(), 0).versionCode;
			boolean isFirst = version > sp.getInt(APP_VERSION,
					1);
			saveVersionCode(context);
			return isFirst;
		}
		catch (NameNotFoundException e)
		{
			e.printStackTrace();
		}
		return false;

	}
	
	/**
	 * 是否是第一次运行.
	 */
	public static boolean isFirstStartFromConfig(Context context) {
		boolean isFirst = false;
		SharedPreferences sp = SharedPreferencesManager.getSP(context);
		if (!sp.getBoolean(IS_FIRST_START, false)){
			isFirst = true;
			sp.edit().putBoolean(IS_FIRST_START, true).commit();
			saveVersionCode(context);
		}
		return isFirst;
	}
	/**
	 * 根据路径安装一个App
	 */
	public static void installApk(String apkPath , Context context) {
		Intent intent = new Intent(Intent.ACTION_VIEW);  
        intent.setDataAndType(Uri.fromFile(new File(apkPath)),  
                "application/vnd.android.package-archive");  
        context.startActivity(intent);
	}
}
