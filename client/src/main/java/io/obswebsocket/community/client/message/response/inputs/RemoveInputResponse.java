package io.obswebsocket.community.client.message.response.inputs;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class RemoveInputResponse extends RequestResponse<Void> {
  public RemoveInputResponse() {
    super(Request.Data.Type.RemoveInput);
  }
}
