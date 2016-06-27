package vip.sithome.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by SitHome on 16/6/21.
 * 跟随手指的小球自定义View
 */

public class FollowPointCircleView extends View {
    public float currentX = 40;
    public float currentY= 50;

    Paint paint = new Paint();

    public FollowPointCircleView(Context context) {
        super(context);
    }

    public FollowPointCircleView(Context context , AttributeSet set){
        super(context,set);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,18,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX = event.getX();
        currentY = event.getY();
        invalidate();
        return true;
    }
}
