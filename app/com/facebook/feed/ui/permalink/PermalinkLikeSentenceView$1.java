package com.facebook.feed.ui.permalink;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.content.SecureContextHelper;
import com.facebook.feed.intent.IFeedIntentBuilder;

class PermalinkLikeSentenceView$1
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    Intent localIntent = PermalinkLikeSentenceView.b(this.a).b(PermalinkLikeSentenceView.a(this.a));
    PermalinkLikeSentenceView.d(this.a).a(localIntent, PermalinkLikeSentenceView.c(this.a));
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.feed.ui.permalink.PermalinkLikeSentenceView.1
 * JD-Core Version:    0.6.0
 */