package com.facebook.orca.background;

import android.support.v4.content.LocalBroadcastManager;
import com.facebook.orca.annotations.FromApplication;
import com.facebook.orca.auth.MeUserAuthDataStore;
import com.facebook.orca.cache.DataCache;
import com.facebook.orca.common.util.Clock;
import com.facebook.orca.inject.AbstractProvider;
import com.facebook.orca.ops.OrcaServiceOperationFactory;

class MessagesBackgroundModule$FetchThreadsIntoMemoryCacheBackgroundTaskProvider extends AbstractProvider<FetchThreadsIntoMemoryCacheBackgroundTask>
{
  private MessagesBackgroundModule$FetchThreadsIntoMemoryCacheBackgroundTaskProvider(MessagesBackgroundModule paramMessagesBackgroundModule)
  {
  }

  public FetchThreadsIntoMemoryCacheBackgroundTask a()
  {
    return new FetchThreadsIntoMemoryCacheBackgroundTask((MeUserAuthDataStore)b(MeUserAuthDataStore.class), (DataCache)b(DataCache.class), (OrcaServiceOperationFactory)b(OrcaServiceOperationFactory.class, FromApplication.class), (LocalBroadcastManager)b(LocalBroadcastManager.class), (Clock)b(Clock.class));
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.background.MessagesBackgroundModule.FetchThreadsIntoMemoryCacheBackgroundTaskProvider
 * JD-Core Version:    0.6.0
 */