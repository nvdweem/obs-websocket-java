package io.obswebsocket.community.client.message.event.outputs;

import com.google.gson.annotations.SerializedName;
import io.obswebsocket.community.client.message.event.Event;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
public class ReplayBufferSavedEvent extends Event {

  @SerializedName("d")
  private final Data messageData;

  protected ReplayBufferSavedEvent() {
    super(Type.ReplayBufferSaved, Intent.Outputs);

    Event.Data superData = super.getMessageData();
    this.messageData = Data.builder().eventType(superData.getEventType())
        .eventIntent(superData.getEventIntent()).build();
  }

  @Getter
  @ToString
  public static class SpecificData {

    private String savedReplayPath;
  }

  @Getter
  @ToString(callSuper = true)
  @SuperBuilder
  public static class Data extends Event.Data {

    protected SpecificData eventData;
  }
}
