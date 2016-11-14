package net.sjava.example.abstraction.abbk;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */

public abstract class AbsBaseFragment extends Fragment {

	Unbinder mUnbinder;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(getLayoutId(), container, false);
		mUnbinder = ButterKnife.bind(this, view);
		return view;
	}

	@LayoutRes
	public abstract int getLayoutId();

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mUnbinder.unbind();
	}
}