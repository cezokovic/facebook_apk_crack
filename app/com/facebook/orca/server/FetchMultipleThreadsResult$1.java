package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class FetchMultipleThreadsResult$1
  implements Parcelable.Creator<FetchMultipleThreadsResult>
{
  public FetchMultipleThreadsResult a(Parcel paramParcel)
  {
    return new FetchMultipleThreadsResult(paramParcel, null);
  }

  public FetchMultipleThreadsResult[] a(int paramInt)
  {
    return new FetchMultipleThreadsResult[paramInt];
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.server.FetchMultipleThreadsResult.1
 * JD-Core Version:    0.6.0
 */