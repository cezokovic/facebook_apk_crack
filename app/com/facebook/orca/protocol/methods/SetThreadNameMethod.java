package com.facebook.orca.protocol.methods;

import com.facebook.orca.protocol.base.ApiMethod;
import com.facebook.orca.protocol.base.ApiRequest;
import com.facebook.orca.protocol.base.ApiResponse;
import com.facebook.orca.protocol.base.ApiResponseType;
import com.facebook.orca.server.ModifyThreadParams;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class SetThreadNameMethod
  implements ApiMethod<ModifyThreadParams, Void>
{
  public ApiRequest a(ModifyThreadParams paramModifyThreadParams)
  {
    ArrayList localArrayList = Lists.a();
    localArrayList.add(new BasicNameValuePair("format", "json"));
    localArrayList.add(new BasicNameValuePair("tid", paramModifyThreadParams.a()));
    localArrayList.add(new BasicNameValuePair("name", paramModifyThreadParams.c()));
    return new ApiRequest("setThreadName", "POST", "method/messaging.setthreadname", localArrayList, ApiResponseType.STRING);
  }

  public Void a(ModifyThreadParams paramModifyThreadParams, ApiResponse paramApiResponse)
  {
    paramApiResponse.g();
    return null;
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.protocol.methods.SetThreadNameMethod
 * JD-Core Version:    0.6.0
 */