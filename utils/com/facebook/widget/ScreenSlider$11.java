package com.facebook.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.orca.ui.touch.DragMotionDetector;

class ScreenSlider$11
  implements View.OnTouchListener
{
  ScreenSlider$11(ScreenSlider paramScreenSlider)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    ScreenSlider.g(this.a).a(paramMotionEvent);
    return true;
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.widget.ScreenSlider.11
 * JD-Core Version:    0.6.2
 */