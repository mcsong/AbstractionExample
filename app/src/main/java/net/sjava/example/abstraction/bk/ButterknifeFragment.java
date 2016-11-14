package net.sjava.example.abstraction.bk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.sjava.example.abstraction.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */

public class ButterknifeFragment extends Fragment {
	@BindView(R.id.fragment_exview_tv_01) TextView tv01;
	@BindView(R.id.fragment_exview_tv_02) TextView tv02;
	@BindView(R.id.fragment_exview_tv_03) TextView tv03;
	@BindView(R.id.fragment_exview_tv_04) TextView tv04;

	private Unbinder unbinder;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, parent, false);
		unbinder = ButterKnife.bind(this, view);
		return view;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		unbinder.unbind();
	}
}