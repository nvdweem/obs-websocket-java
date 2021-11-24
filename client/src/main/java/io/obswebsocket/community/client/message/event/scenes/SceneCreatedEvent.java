package io.obswebsocket.community.client.message.event.scenes;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SceneCreatedEvent extends SceneEvent {

  @SerializedName("d")
  private Data messageData;

  protected SceneCreatedEvent() {
    super(Type.SceneCreated, Intent.Scenes);
  }

  @Getter
  @ToString(callSuper = true)
  public static class SpecificData extends SceneEvent.SpecificData {

    private Boolean isGroup;
  }

  @Getter
  @ToString(callSuper = true)
  public static class Data extends SceneEvent.Data {

    protected SpecificData eventData;
  }
}
