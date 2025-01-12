package io.obswebsocket.community.client.message.response.outputs;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public class GetLastReplayBufferReplayResponse extends RequestResponse<GetLastReplayBufferReplayResponse.Data> {
  public GetLastReplayBufferReplayResponse() {
    super(Request.Data.Type.GetLastReplayBufferReplay);
  }

  @Getter
  @ToString
  @SuperBuilder
  public static class Data {
    private String savedReplayPath;
  }
}
