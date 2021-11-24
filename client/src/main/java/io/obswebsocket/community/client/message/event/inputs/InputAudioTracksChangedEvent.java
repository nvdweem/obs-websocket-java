package io.obswebsocket.community.client.message.event.inputs;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class InputAudioTracksChangedEvent extends InputEvent {

  @SerializedName("d")
  private Data messageData;

  protected InputAudioTracksChangedEvent() {
    super(Type.InputAudioTracksChanged, Intent.Inputs);
  }

  @Getter
  @ToString(callSuper = true)
  public static class SpecificData extends InputEvent.SpecificData {

    private List<Integer> inputAudioTracks;
  }

  @Getter
  @ToString(callSuper = true)
  public static class Data extends InputEvent.Data {

    protected SpecificData eventData;
  }
}
