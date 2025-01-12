package io.obswebsocket.community.client.message.response.sceneitems;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public class GetSceneItemEnabledResponse extends RequestResponse<GetSceneItemEnabledResponse.Data> {
  public GetSceneItemEnabledResponse() {
    super(Request.Data.Type.GetSceneItemEnabled);
  }

  @Getter
  @ToString
  @SuperBuilder
  public static class Data {
    private Boolean sceneItemEnabled;
  }
}
