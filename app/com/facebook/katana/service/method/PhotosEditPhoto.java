package com.facebook.katana.service.method;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.katana.Constants.URL;
import com.facebook.katana.provider.PhotosProvider;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Map;

public class PhotosEditPhoto extends ApiMethod
{
  public PhotosEditPhoto(Context paramContext, Intent paramIntent, String paramString1, String paramString2, String paramString3, ServiceOperationListener paramServiceOperationListener)
  {
    super(paramContext, paramIntent, "GET", "photos.setCaption", Constants.URL.b(paramContext), paramServiceOperationListener);
    this.e.put("session_key", paramString1);
    this.e.put("call_id", "" + System.currentTimeMillis());
    this.e.put("pid", paramString2);
    if (paramString3 != null)
    {
      if (paramString3.length() == 0)
        paramString3 = " ";
      this.e.put("caption", paramString3);
    }
  }

  protected void a(JsonParser paramJsonParser)
  {
    Uri localUri = Uri.withAppendedPath(PhotosProvider.b, (String)this.e.get("pid"));
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("caption", (String)this.e.get("caption"));
    this.o.getContentResolver().update(localUri, localContentValues, null, null);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.service.method.PhotosEditPhoto
 * JD-Core Version:    0.6.0
 */