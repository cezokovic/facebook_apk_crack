package com.facebook.orca.users;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class UserPhoneNumber$1
  implements Parcelable.Creator<UserPhoneNumber>
{
  public UserPhoneNumber a(Parcel paramParcel)
  {
    return new UserPhoneNumber(paramParcel, null);
  }

  public UserPhoneNumber[] a(int paramInt)
  {
    return new UserPhoneNumber[paramInt];
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.users.UserPhoneNumber.1
 * JD-Core Version:    0.6.0
 */