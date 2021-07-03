package io.obswebsocket.community.client.message.response.config;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SetCurrentSceneCollectionResponse extends RequestResponse {

  public SetCurrentSceneCollectionResponse() {
    super(Request.Type.SetCurrentSceneCollection);
  }
}