package net.sjava.example.abstraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mcsong@gmail.com on 2016-11-14.
 */
public class MainActivity extends AppCompatActivity {

	private TextView tv01;
	private TextView tv02;
	private TextView tv03;
	private TextView tv04;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv01 = (TextView) findViewById(R.id.activity_main_tv_01);
		tv02 = (TextView) findViewById(R.id.activity_main_tv_02);
		tv03 = (TextView) findViewById(R.id.activity_main_tv_03);
		tv04 = (TextView) findViewById(R.id.activity_main_tv_04);
	}
}