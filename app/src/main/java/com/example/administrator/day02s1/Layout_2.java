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
 * �¼��ķַ�/����/����
 * �ַ��Ĺ���,��һ���¼���һ���ռ䴦��֮��,�������¼����ɸÿؼ�����
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
 * �����¼��ķַ�
 * return�ַ��Ƿ����
 */

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.v(tag,"dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * �����¼�������
     * @param ev
     * @return �Ƿ������ӿؼ��Ĵ����¼�
     * ����������ӿؼ��Ĵ����¼�,��������¼��ɴ˿ؼ�����
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
* �����¼��Ĵ���
* return �Ƿ������
*/
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v(tag,"onTouchEvent");
        return super.onTouchEvent(event);
    }
}
