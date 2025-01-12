package io.obswebsocket.community.client.message.response.sceneitems;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class RemoveSceneItemResponse extends RequestResponse<Void> {
  public RemoveSceneItemResponse() {
    super(Request.Data.Type.RemoveSceneItem);
  }
}
