package io.obswebsocket.community.client.message.response.record;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class PauseRecordResponse extends RequestResponse<Void> {
  public PauseRecordResponse() {
    super(Request.Data.Type.PauseRecord);
  }
}
