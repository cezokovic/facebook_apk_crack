package com.facebook.orca.push.mqtt;

import com.facebook.orca.prefs.OrcaSharedPreferences;
import com.facebook.orca.prefs.OrcaSharedPreferences.OnSharedPreferenceChangeListener;
import com.facebook.orca.prefs.PrefKey;

class MqttForegroundStateSender$2
  implements OrcaSharedPreferences.OnSharedPreferenceChangeListener
{
  public void a(OrcaSharedPreferences paramOrcaSharedPreferences, PrefKey paramPrefKey)
  {
    MqttForegroundStateSender.a(this.a, paramPrefKey);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.push.mqtt.MqttForegroundStateSender.2
 * JD-Core Version:    0.6.0
 */