package com.rincliu.library.widget.dialog;

import com.rincliu.library.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class RLLoadingDialog extends RLDialog{	
	private Context context;
	private TextView tv_msg;
	
	/**
	 * 
	 * @param context
	 */
	public RLLoadingDialog(Context context) {
		super(context);
		this.context=context;
		super.createView();
		super.setCanceledOnTouchOutside(false);
	}
	
	@Override
	protected View getView() {
		View view=LayoutInflater.from(context).inflate(R.layout.dialog_loading, null);
		tv_msg=(TextView) view.findViewById(R.id.tv_msg);
		return view;
	}
	
	/**
	 * 
	 * @param msg
	 */
	public void setMessage(String msg){
		tv_msg.setVisibility(View.VISIBLE);
		tv_msg.setText(msg);
	}
	
	/**
	 * 
	 * @param msgStrResId
	 */
	public void setMessage(int msgStrResId){
		setMessage(context.getString(msgStrResId));
	}
}