package io.obswebsocket.community.client.message.request.record;

import io.obswebsocket.community.client.message.request.Request;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class PauseRecordRequest extends Request<Void> {

  @Builder
  private PauseRecordRequest() {
    super(Data.Type.PauseRecord, null);
  }
}
