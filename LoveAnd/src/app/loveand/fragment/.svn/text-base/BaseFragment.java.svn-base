package app.loveand.fragment;

import net.tsz.afinal.FinalHttp;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import app.loveand.utils.SharedPreferencesManager;
import app.loveand.utils.ToastUtil;

public class BaseFragment extends Fragment implements OnClickListener{
	@Override
	public void onClick(View v) {
		
	}
	protected FinalHttp getHttpClient() {
		FinalHttp ht = new FinalHttp();
		ht.addHeader("dataType", "json");
//		ht.addHeader("ContentType", "image/png");
		return ht;
	}
	protected  void showToast(String msg) {
		ToastUtil.show(getActivity(), msg);
	}
	protected  SharedPreferences getSharedPreferencesManager() {
		return SharedPreferencesManager.getSP(getActivity());
	}

	
}
