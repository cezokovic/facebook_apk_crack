package com.facebook.katana.friendrequests;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.facebook.friends.model.PersonYouMayKnow;

class PersonYouMayKnowView$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    if (PersonYouMayKnowView.a(this.b) != null)
    {
      PersonYouMayKnowView.a(this.b).a(PersonYouMayKnowView.b(this.b).userId);
      PersonYouMayKnowView.b(this.b, this.a);
      PersonYouMayKnowView.c(this.b).setEnabled(false);
    }
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.friendrequests.PersonYouMayKnowView.2
 * JD-Core Version:    0.6.0
 */