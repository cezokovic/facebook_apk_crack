package com.facebook.orca.threadlist;

import com.facebook.orca.cache.SpamThreadManager;
import com.facebook.orca.threads.ThreadSummary;
import com.google.common.base.Predicate;

class ThreadListAdapter$2
  implements Predicate<ThreadSummary>
{
  public boolean a(ThreadSummary paramThreadSummary)
  {
    return ThreadListAdapter.b(this.a).a(paramThreadSummary.a());
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.threadlist.ThreadListAdapter.2
 * JD-Core Version:    0.6.0
 */