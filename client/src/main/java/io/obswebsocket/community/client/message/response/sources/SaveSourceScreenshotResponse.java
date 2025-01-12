package io.obswebsocket.community.client.message.response.sources;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SaveSourceScreenshotResponse extends RequestResponse<Void> {
  public SaveSourceScreenshotResponse() {
    super(Request.Data.Type.SaveSourceScreenshot);
  }
}
