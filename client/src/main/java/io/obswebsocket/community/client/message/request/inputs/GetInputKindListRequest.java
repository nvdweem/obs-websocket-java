package io.obswebsocket.community.client.message.request.inputs;

import io.obswebsocket.community.client.message.request.Request;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class GetInputKindListRequest extends Request<GetInputKindListRequest.Data> {
  @Builder
  private GetInputKindListRequest(Boolean unversioned) {
    super(Request.Data.Type.GetInputKindList, Data.builder().unversioned(unversioned).build());
  }

  @Getter
  @ToString
  @Builder
  static class Data {
    private final Boolean unversioned;
  }
}
