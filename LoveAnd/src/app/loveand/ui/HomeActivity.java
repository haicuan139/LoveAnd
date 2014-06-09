package app.loveand.ui;

import android.os.Bundle;
import app.loveand.R;
import app.loveand.fragment.HomeFragmet;
import app.loveand.fragment.Right_Fragment;

import com.slidingmenu.lib.SlidingMenu;


public class HomeActivity extends SlideBaseActivity {

	public HomeActivity() {
		super(R.string.left_and_right);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSlidingMenu().setMode(SlidingMenu.LEFT_RIGHT);
		getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
		
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new HomeFragmet())
		.commit();
		
		getSlidingMenu().setSecondaryMenu(R.layout.menu_frame_two);
		getSlidingMenu().setSecondaryShadowDrawable(R.drawable.shadowright);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.menu_frame_two, new Right_Fragment())
		.commit();
	}

}
