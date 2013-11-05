package com.example.oldcartoon.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.example.oldcartoon.R;

@SuppressLint("ValidFragment")
public class ColorFragment extends Fragment {
	
	private int mColorRes = -1;
	
	public ColorFragment() { 
		this(R.color.white);
	}
	
	public ColorFragment(int colorRes) {
		mColorRes = colorRes;
		setRetainInstance(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (savedInstanceState != null)
			mColorRes = savedInstanceState.getInt("mColorRes");
		// construct the RelativeLayout
		ScrollView v = new ScrollView(getActivity());
		TextView tv=new TextView(getActivity());
		tv.setTextColor(getResources().getColor(R.color.black));
		tv.setTextSize(16f);
		v.addView(tv);
		tv.setText(mColorRes);
		return v;
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mColorRes", mColorRes);
	}
	
}
