package io.obswebsocket.community.client.message.response.general;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class CreateProfileResponse extends RequestResponse<Void> {
  public CreateProfileResponse() {
    super(Request.Data.Type.CreateProfile);
  }
}
