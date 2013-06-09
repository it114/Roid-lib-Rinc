package com.rincliu.library.app;

import com.rincliu.library.BuildConfig;
import com.rincliu.library.common.reference.push.RLPushHelper;
import com.rincliu.library.entity.RLDisplayInfo;
import android.app.Application;
import android.content.res.Configuration;

public class RLApplication extends Application{
	
	@Override
	public void onCreate(){
		super.onCreate();
		RLPushHelper.getInstance(this).init(BuildConfig.DEBUG);
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig){
		super.onConfigurationChanged(newConfig);
	}
	
	@Override
	public void onLowMemory(){
		super.onLowMemory();
	}
	
	@Override
	public void onTerminate(){
		super.onTerminate();
	}
	
	private RLDisplayInfo displayInfo;

	public RLDisplayInfo getDisplayInfo() {
		return displayInfo;
	}

	public void setDisplayInfo(RLDisplayInfo displayInfo) {
		this.displayInfo = displayInfo;
	}
}