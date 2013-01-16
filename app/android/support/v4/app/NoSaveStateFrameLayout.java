package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class NoSaveStateFrameLayout extends FrameLayout
{
  public NoSaveStateFrameLayout(Context paramContext)
  {
    super(paramContext);
  }

  static ViewGroup a(View paramView)
  {
    NoSaveStateFrameLayout localNoSaveStateFrameLayout = new NoSaveStateFrameLayout(paramView.getContext());
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null)
      localNoSaveStateFrameLayout.setLayoutParams(localLayoutParams);
    paramView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localNoSaveStateFrameLayout.addView(paramView);
    return localNoSaveStateFrameLayout;
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     android.support.v4.app.NoSaveStateFrameLayout
 * JD-Core Version:    0.6.0
 */