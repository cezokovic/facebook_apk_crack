package com.facebook.contacts.contactcard;

import android.view.View;
import android.view.View.OnClickListener;

class GroupMembersSectionView$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    ThreadMemberRow localThreadMemberRow = (ThreadMemberRow)paramView;
    GroupMembersSectionView.a(this.a, localThreadMemberRow.getParticipant());
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.contacts.contactcard.GroupMembersSectionView.2
 * JD-Core Version:    0.6.0
 */