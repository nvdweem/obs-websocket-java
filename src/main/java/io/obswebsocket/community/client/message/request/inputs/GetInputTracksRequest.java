package io.obswebsocket.community.client.message.request.inputs;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class GetInputTracksRequest extends InputRequest {

  private final Data requestData;

  @Builder
  private GetInputTracksRequest(String inputName) {
    super(Type.GetInputTracks);

    this.requestData = Data.builder().inputName(inputName).build();
  }
}
