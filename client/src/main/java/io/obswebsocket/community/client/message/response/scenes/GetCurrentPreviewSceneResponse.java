package io.obswebsocket.community.client.message.response.scenes;

import io.obswebsocket.community.client.message.request.Request;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class GetCurrentPreviewSceneResponse extends CurrentSceneResponse {
  public GetCurrentPreviewSceneResponse() {
    super(Request.Data.Type.GetCurrentPreviewScene);
  }
}
