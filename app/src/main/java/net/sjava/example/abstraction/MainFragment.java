package net.sjava.example.abstraction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */

public class MainFragment extends Fragment {

	private TextView tv01;
	private TextView tv02;
	private TextView tv03;
	private TextView tv04;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, parent, false);

		tv01 = (TextView)view.findViewById(R.id.fragment_exview_tv_01);
		tv02 = (TextView)view.findViewById(R.id.fragment_exview_tv_02);
		tv03 = (TextView)view.findViewById(R.id.fragment_exview_tv_03);
		tv04 = (TextView)view.findViewById(R.id.fragment_exview_tv_04);

		return view;
	}

}