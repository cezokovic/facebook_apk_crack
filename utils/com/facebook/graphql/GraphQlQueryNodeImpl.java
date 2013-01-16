package com.facebook.graphql;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public final class GraphQlQueryNodeImpl extends GraphQlQueryBaseObjectImpl
  implements GraphQlQueryNode
{
  GraphQlQueryNodeImpl(List<? extends GraphQlQueryBaseField> paramList, String paramString)
  {
    super((List)Preconditions.checkNotNull(paramList), paramString, true);
  }

  public GraphQlQueryNodeImpl a(GraphQlQueryFieldNode paramGraphQlQueryFieldNode)
  {
    return a(new GraphQlQueryFieldNode[] { paramGraphQlQueryFieldNode });
  }

  public GraphQlQueryNodeImpl a(List<GraphQlQueryFieldNode> paramList)
  {
    return new GraphQlQueryNodeImpl(ImmutableList.e().b((Iterable)Preconditions.checkNotNull(this.c)).b(paramList).b(), this.b);
  }

  public GraphQlQueryNodeImpl a(GraphQlQueryFieldNode[] paramArrayOfGraphQlQueryFieldNode)
  {
    return a(ImmutableList.a(paramArrayOfGraphQlQueryFieldNode));
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.graphql.GraphQlQueryNodeImpl
 * JD-Core Version:    0.6.2
 */