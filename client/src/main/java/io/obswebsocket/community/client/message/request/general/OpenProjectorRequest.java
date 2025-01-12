package io.obswebsocket.community.client.message.request.general;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.model.Projector;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class OpenProjectorRequest extends Request<OpenProjectorRequest.Data> {
  @Builder
  private OpenProjectorRequest(Projector.Type projectorType, Integer projectorMonitor,
          String projectorGeometry, String sourceName) {
    super(Request.Data.Type.OpenProjector, Data.builder().projectorType(projectorType)
                                               .projectorMonitor(projectorMonitor).projectorGeometry(projectorGeometry)
                                               .sourceName(sourceName).build());
  }

  @Getter
  @ToString
  @Builder
  static class Data {

    @NonNull
    private final Projector.Type projectorType;
    @NonNull
    private final Integer projectorMonitor;
    @NonNull
    private final String projectorGeometry;
    private final String sourceName;
  }
}
