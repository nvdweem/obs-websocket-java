package net.twasi.obsremotejava.message.event.sceneitems;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SceneItemLockStateChangedEvent extends SceneItemEvent {
    private Data eventData;

    protected SceneItemLockStateChangedEvent() {
        super(Type.SceneItemLockStateChanged, Category.SceneItems);
    }

    @Getter
    @ToString(callSuper = true)
    public static class Data extends SceneItemEvent.Data {
        private String sceneItemId;
        private Boolean sceneItemLocked;
    }
}