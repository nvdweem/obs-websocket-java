package io.obswebsocket.community.client.message.response.transitions;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SetCurrentTransitionResponse extends RequestResponse<Void> {
  public SetCurrentTransitionResponse() {
    super(Request.Data.Type.SetCurrentTransition);
  }
}
