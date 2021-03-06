package com.facebook.feed.data;

import android.os.Bundle;
import com.facebook.feed.protocol.FetchNewsFeedResult;
import com.facebook.orca.debug.BLog;
import com.facebook.orca.ops.OperationResultFutureCallback;
import com.facebook.orca.ops.ServiceException;
import com.facebook.orca.server.OperationResult;
import java.util.concurrent.CancellationException;

class NewsFeedFragmentDataLoader$1 extends OperationResultFutureCallback
{
  protected void a(ServiceException paramServiceException)
  {
    BLog.d(NewsFeedFragmentDataLoader.j(), "newer story fetch failed. ", paramServiceException);
    this.b.a(paramServiceException, AbstractDataLoader.FetchFeedDirection.BEFORE, this.a);
  }

  public void a(OperationResult paramOperationResult)
  {
    NewsFeedFragmentDataLoader.a(this.b, (FetchNewsFeedResult)paramOperationResult.h(), this.a, AbstractDataLoader.FetchFeedDirection.BEFORE);
  }

  protected void a(CancellationException paramCancellationException)
  {
    this.b.a(paramCancellationException, AbstractDataLoader.FetchFeedDirection.BEFORE, this.a);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.feed.data.NewsFeedFragmentDataLoader.1
 * JD-Core Version:    0.6.0
 */