package com.facebook.orca.sms;

import com.facebook.content.SecureBroadcastReceiver;

public class MmsTransactionStateBroadcastReceiver extends SecureBroadcastReceiver
{
  public MmsTransactionStateBroadcastReceiver()
  {
    super("android.intent.action.TRANSACTION_COMPLETED_ACTION", new MmsTransactionCompletedAction());
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.sms.MmsTransactionStateBroadcastReceiver
 * JD-Core Version:    0.6.0
 */