package com.facebook.graphql;

import com.google.common.base.Preconditions;
import java.util.List;

public final class GraphQlQueryPage extends GraphQlQueryBaseObjectImpl
  implements GraphQlQueryActor, GraphQlQueryEntity, GraphQlQueryNode, GraphQlQueryPlace, GraphQlQueryProfile
{
  GraphQlQueryPage(List<? extends GraphQlQueryBaseField> paramList, String paramString)
  {
    super((List)Preconditions.checkNotNull(paramList), paramString, true);
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.graphql.GraphQlQueryPage
 * JD-Core Version:    0.6.2
 */