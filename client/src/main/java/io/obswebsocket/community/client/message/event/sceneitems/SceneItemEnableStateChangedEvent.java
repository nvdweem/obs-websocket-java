package io.obswebsocket.community.client.message.event.sceneitems;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SceneItemEnableStateChangedEvent extends SceneItemEvent<SceneItemEnableStateChangedEvent.SpecificData> {
  protected SceneItemEnableStateChangedEvent() {
    super(Intent.SceneItems);
  }

  @Getter
  @ToString(callSuper = true)
  public static class SpecificData extends SceneItemEvent.SpecificData {
    private Integer sceneItemId;
    private Boolean sceneItemEnabled;
  }
}
