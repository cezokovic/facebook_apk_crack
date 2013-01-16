package com.facebook.graphql;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class GraphQlQueryFriendListFeedConnection extends GraphQlQueryBaseCallable
{
  GraphQlQueryFriendListFeedConnection(List<? extends GraphQlQueryBaseFieldCall> paramList, List<? extends GraphQlQueryBaseField> paramList1, String paramString)
  {
    super(paramList, paramList1, paramString, false);
  }

  public GraphQlQueryFriendListFeedConnection a(List<GraphQlQueryFriendListFeedConnection.FriendListFeedConnectionField> paramList)
  {
    Preconditions.checkState(this.c.isEmpty(), "Can't add fields multiple times");
    return new GraphQlQueryFriendListFeedConnection(this.a, (List)Preconditions.checkNotNull(paramList), this.b);
  }

  public GraphQlQueryFriendListFeedConnection a(GraphQlQueryFriendListFeedConnection.FriendListFeedConnectionField[] paramArrayOfFriendListFeedConnectionField)
  {
    Preconditions.checkState(this.c.isEmpty());
    return a(ImmutableList.a(paramArrayOfFriendListFeedConnectionField));
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.graphql.GraphQlQueryFriendListFeedConnection
 * JD-Core Version:    0.6.2
 */