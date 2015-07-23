package com.example.administrator.day02s1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 15-7-14.
 * 事件的分发/拦截/处理
 * 分发的规则,当一个事件被一个空间处理之后,后续的事件都由该控件处理
 *
 */
public class Layout_2 extends FrameLayout {
    public String tag = "TAG2";
    public Layout_2(Context context) {

        super(context);
    }

    public Layout_2(Context context, AttributeSet attrs) {

        super(context, attrs);
    }

    public Layout_2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
/**
 * 触摸事件的分发
 * return分发是否完成
 */

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.v(tag,"dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 触摸事件的拦截
     * @param ev
     * @return 是否拦截子控件的触摸事件
     * 如果拦截了子控件的触摸事件,则后续的事件由此控件处理
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.v(tag,"onInterceptTouchEvent");
        View view = getChildAt(0);
        Rect rect = new Rect(view.getLeft(),view.getTop(),view.getRight(),view.getBottom());
        if(! rect.contains(((int) ev.getX()), ((int) ev.getY()))){
            return true;






        }
        return super.onInterceptTouchEvent(ev);
    }
/*
* 触摸事件的处理
* return 是否处理完成
*/
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v(tag,"onTouchEvent");
        return super.onTouchEvent(event);
    }
}
