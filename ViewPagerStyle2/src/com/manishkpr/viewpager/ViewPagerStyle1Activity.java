package com.manishkpr.viewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.Button;



public class ViewPagerStyle1Activity extends FragmentActivity {
	private ViewPager _mViewPager;
	private ViewPagerAdapter _adapter;
	private Button _btn1,_btn2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setUpView();
        setTab();
    }
    private void setUpView(){    	
   	 _mViewPager = (ViewPager) findViewById(R.id.viewPager);
     _adapter = new ViewPagerAdapter(getApplicationContext(),getSupportFragmentManager());
     _mViewPager.setAdapter(_adapter);
	 _mViewPager.setCurrentItem(0);
	 initButton();
    }
    private void setTab(){
			_mViewPager.setOnPageChangeListener(new OnPageChangeListener(){
			    		
						@Override
						public void onPageScrollStateChanged(int position) {}
						@Override
						public void onPageScrolled(int arg0, float arg1, int arg2) {}
						@Override
						public void onPageSelected(int position) {
							// TODO Auto-generated method stub
							btnAction(position);
						}
						
					});

    }
    private void btnAction(int action){
    	switch(action){
    	  case 0: setButton(_btn1,"1",40,40); setButton(_btn2,"",20,20);break;
    	  
    	  case 1: setButton(_btn2,"2",40,40); setButton(_btn1,"",20,20); break;
    	}
    }
    private void initButton(){
    	_btn1=(Button)findViewById(R.id.btn1);
    	_btn2=(Button)findViewById(R.id.btn2);
    	setButton(_btn1,"1",40,40);
    	setButton(_btn2,"",20,20);
    }
    private void setButton(Button btn,String text,int h, int w){
    	btn.setWidth(w);
    	btn.setHeight(h);
    	btn.setText(text);
    }
}