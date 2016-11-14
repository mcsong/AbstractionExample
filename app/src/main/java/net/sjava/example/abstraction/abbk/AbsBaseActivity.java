package net.sjava.example.abstraction.abbk;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */
public abstract class AbsBaseActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(getLayoutId());
		ButterKnife.bind(this);
	}

	@LayoutRes
	public abstract int getLayoutId();
}
