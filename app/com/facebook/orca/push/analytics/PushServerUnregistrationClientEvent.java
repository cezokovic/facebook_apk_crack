package com.facebook.orca.push.analytics;

import com.facebook.analytics.HoneyClientEvent;
import com.facebook.analytics.ReliabilityAnalyticsClientEvent;

public class PushServerUnregistrationClientEvent
{
  public static HoneyClientEvent a(String paramString1, String paramString2)
  {
    return ReliabilityAnalyticsClientEvent.a("push_unreg_server", paramString1, null, "registration_id", paramString2);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.push.analytics.PushServerUnregistrationClientEvent
 * JD-Core Version:    0.6.0
 */