package net.sjava.example.abstraction.bk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.sjava.example.abstraction.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */

public class ButterknifeActivity extends AppCompatActivity {

	@BindView(R.id.activity_main_tv_01) TextView tv01;
	@BindView(R.id.activity_main_tv_02) TextView tv02;
	@BindView(R.id.activity_main_tv_03) TextView tv03;
	@BindView(R.id.activity_main_tv_04) TextView tv04;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
	}
}