package app.loveand.fragment;

import java.util.ArrayList;
import java.util.List;

import net.tsz.afinal.http.AjaxCallBack;
import net.tsz.afinal.http.AjaxParams;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.loveand.R;
import app.loveand.domain.content.ContentUrl;
import app.loveand.utils.Logger;

public class HomeFragmet extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.home_pager, null);
		ViewPager pager = (ViewPager) view.findViewById(R.id.page_home_pager);
		pager.setBackgroundColor(Color.WHITE);
		HomeTaskListFragment mHomeTaskListFragment = new HomeTaskListFragment();
		HomeTaskSquareFragment mHomeTaskSquareFragment = new HomeTaskSquareFragment(); 
		List<Fragment> fragments = new ArrayList<Fragment>();
		fragments.add(mHomeTaskSquareFragment);
		fragments.add(mHomeTaskListFragment);

//		http://[IP]/api/register?username=clllo2696@126.com&password=admin&nickname=板寸&sex=男&iconurl=abc
		pager.setAdapter(new MyFragmentPagerAdapter(fragments , getFragmentManager()));
		AjaxParams params = new AjaxParams();
		params.put("username", "usernameasdasdsa@aa.com");
		params.put("password", "password");
		params.put("nickname", "nickname");
		params.put("sex", "男");
		params.put("iconurl", "testiconurl");
		getHttpClient().get("http://192.168.1.33/api/register",params,new AjaxCallBack<String>(){
			@Override
			public void onStart() {
				super.onStart();
			}
			@Override
			public void onFailure(Throwable t, int errorNo, String strMsg) {
				Logger.e("REG", strMsg, t);
				super.onFailure(t, errorNo, strMsg);
			}
			@Override
			public void onSuccess(String t) {
				Logger.i("REG", t);
				super.onSuccess(t);
			}
			
		});
		return view; 
	}  

	public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
		private List<Fragment> fragmentsList;


		public MyFragmentPagerAdapter(List<Fragment> fragments , FragmentManager fragmentManager) {
			super(fragmentManager);
			this.fragmentsList = fragments;
		}

		@Override
		public int getCount() {
			return fragmentsList.size();
		}

		@Override
		public Fragment getItem(int arg0) {
			return fragmentsList.get(arg0);
		}

		@Override
		public int getItemPosition(Object object) {
			return super.getItemPosition(object);
		}

	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onClick(View v) {
		super.onClick(v);

	}
}
