package com.facebook.orca.common.http;

import com.facebook.common.util.NetAccessLogger;
import com.facebook.orca.inject.AbstractProvider;
import com.facebook.orca.prefs.OrcaSharedPreferences;

class OrcaHttpModule$NetAccessLoggerProvider extends AbstractProvider<NetAccessLogger>
{
  private OrcaHttpModule$NetAccessLoggerProvider(OrcaHttpModule paramOrcaHttpModule)
  {
  }

  public NetAccessLogger a()
  {
    return new NetAccessLogger((OrcaSharedPreferences)b(OrcaSharedPreferences.class));
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.orca.common.http.OrcaHttpModule.NetAccessLoggerProvider
 * JD-Core Version:    0.6.2
 */