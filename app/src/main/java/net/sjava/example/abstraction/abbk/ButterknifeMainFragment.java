package net.sjava.example.abstraction.abbk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.sjava.example.abstraction.R;

import butterknife.BindView;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */

public class ButterknifeMainFragment extends Fragment {
	@BindView(R.id.fragment_exview_tv_01) TextView tv01;
	@BindView(R.id.fragment_exview_tv_02) TextView tv02;
	@BindView(R.id.fragment_exview_tv_03) TextView tv03;
	@BindView(R.id.fragment_exview_tv_04) TextView tv04;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		return super.onCreateView(inflater, parent, savedInstanceState);
	}
}