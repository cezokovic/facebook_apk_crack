package com.facebook.appcenter.modules;

import android.content.Context;
import com.facebook.orca.inject.AbstractProvider;

class WorkflowModule$SystemServiceProvider<T> extends AbstractProvider<T>
{
  private final String b;

  WorkflowModule$SystemServiceProvider(WorkflowModule paramWorkflowModule, String paramString)
  {
    this.b = paramString;
  }

  public T b()
  {
    return WorkflowModule.a(this.a).getSystemService(this.b);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.appcenter.modules.WorkflowModule.SystemServiceProvider
 * JD-Core Version:    0.6.0
 */