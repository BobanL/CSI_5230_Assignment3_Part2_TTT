package com.example.boban.assignment3_part2;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;


public class TTTButton extends AppCompatButton implements Observer{
	int index;

	public TTTButton(int i, Context c){
        super(c);
        index = i;
    }

    public TTTButton(Context C, AttributeSet attributeSet){
	    super(C, attributeSet);
    }

	public void update(String s) {
		this.setText(s);
	}
	public int getIndex() {
		return index;
	}

}
