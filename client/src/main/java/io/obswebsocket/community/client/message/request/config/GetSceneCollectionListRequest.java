package io.obswebsocket.community.client.message.request.config;

import io.obswebsocket.community.client.message.request.Request;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class GetSceneCollectionListRequest extends Request<Void> {
  @Builder
  private GetSceneCollectionListRequest() {
    super(Data.Type.GetSceneCollectionList, null);
  }
}
