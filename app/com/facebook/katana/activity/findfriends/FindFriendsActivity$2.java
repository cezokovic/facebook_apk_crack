package com.facebook.katana.activity.findfriends;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

class FindFriendsActivity$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    FindFriendsActivity.b(this.a, true);
    FindFriendsActivity.c(this.a).a(false);
    ((TextView)this.a.findViewById(2131296852)).setText(FindFriendsActivity.b(this.a));
    ((Button)this.a.findViewById(2131296853)).setVisibility(8);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.activity.findfriends.FindFriendsActivity.2
 * JD-Core Version:    0.6.0
 */