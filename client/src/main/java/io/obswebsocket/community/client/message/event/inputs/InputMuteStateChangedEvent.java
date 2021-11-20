package io.obswebsocket.community.client.message.event.inputs;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public class InputMuteStateChangedEvent extends InputEvent {

  @SerializedName("d")
  private final Data messageData;

  protected InputMuteStateChangedEvent() {
    super(Type.InputMuteStateChanged, Intent.Inputs);

    InputEvent.Data superData = super.getMessageData();
    this.messageData = Data.builder().eventType(superData.getEventType())
        .eventIntent(superData.getEventIntent()).build();
  }

  @Getter
  @ToString(callSuper = true)
  public static class SpecificData extends InputEvent.SpecificData {

    private Boolean inputMuted;
  }

  @Getter
  @ToString(callSuper = true)
  @SuperBuilder
  public static class Data extends InputEvent.Data {

    protected SpecificData eventData;
  }
}
