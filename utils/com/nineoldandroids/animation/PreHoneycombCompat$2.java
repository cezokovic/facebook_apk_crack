package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat$2 extends FloatProperty<View>
{
  PreHoneycombCompat$2(String paramString)
  {
    super(paramString);
  }

  public Float a(View paramView)
  {
    return Float.valueOf(AnimatorProxy.a(paramView).getPivotX());
  }

  public void a(View paramView, float paramFloat)
  {
    AnimatorProxy.a(paramView).setPivotX(paramFloat);
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.nineoldandroids.animation.PreHoneycombCompat.2
 * JD-Core Version:    0.6.2
 */