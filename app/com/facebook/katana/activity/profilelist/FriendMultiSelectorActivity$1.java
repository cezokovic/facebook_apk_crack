package com.facebook.katana.activity.profilelist;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Filter;
import android.widget.ImageView;
import com.facebook.katana.ui.SectionedListView;

class FriendMultiSelectorActivity$1
  implements TextWatcher
{
  public void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.length() > 0);
    for (int i = 17301594; ; i = 2130838326)
    {
      this.a.y.setImageResource(i);
      return;
    }
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = paramCharSequence.toString().trim();
    this.a.A = str;
    ((SelectableProfileListNaiveCursorAdapter)this.a.B).k.filter(this.a.A);
    ((SectionedListView)this.a.m()).setFastScrollEnabled(false);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.activity.profilelist.FriendMultiSelectorActivity.1
 * JD-Core Version:    0.6.0
 */