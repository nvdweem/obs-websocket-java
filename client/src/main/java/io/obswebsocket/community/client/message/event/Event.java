package io.obswebsocket.community.client.message.event;

import com.google.gson.annotations.SerializedName;
import io.obswebsocket.community.client.message.Message;
import io.obswebsocket.community.client.message.event.config.CurrentProfileChangedEvent;
import io.obswebsocket.community.client.message.event.config.CurrentSceneCollectionChangedEvent;
import io.obswebsocket.community.client.message.event.config.ProfileListChangedEvent;
import io.obswebsocket.community.client.message.event.config.SceneCollectionListChangedEvent;
import io.obswebsocket.community.client.message.event.filters.FilterCreatedEvent;
import io.obswebsocket.community.client.message.event.filters.FilterNameChangedEvent;
import io.obswebsocket.community.client.message.event.filters.FilterRemovedEvent;
import io.obswebsocket.community.client.message.event.filters.SourceFilterAddedEvent;
import io.obswebsocket.community.client.message.event.filters.SourceFilterListReindexedEvent;
import io.obswebsocket.community.client.message.event.filters.SourceFilterRemovedEvent;
import io.obswebsocket.community.client.message.event.general.ExitStartedEvent;
import io.obswebsocket.community.client.message.event.general.StudioModeStateChangedEvent;
import io.obswebsocket.community.client.message.event.highvolume.InputActiveStateChangedEvent;
import io.obswebsocket.community.client.message.event.highvolume.InputShowStateChangedEvent;
import io.obswebsocket.community.client.message.event.highvolume.InputVolumeMetersEvent;
import io.obswebsocket.community.client.message.event.inputs.InputAudioSyncOffsetChangedEvent;
import io.obswebsocket.community.client.message.event.inputs.InputAudioTracksChangedEvent;
import io.obswebsocket.community.client.message.event.inputs.InputCreatedEvent;
import io.obswebsocket.community.client.message.event.inputs.InputMuteStateChangedEvent;
import io.obswebsocket.community.client.message.event.inputs.InputNameChangedEvent;
import io.obswebsocket.community.client.message.event.inputs.InputRemovedEvent;
import io.obswebsocket.community.client.message.event.inputs.InputVolumeChangedEvent;
import io.obswebsocket.community.client.message.event.mediainputs.MediaInputActionTriggeredEvent;
import io.obswebsocket.community.client.message.event.mediainputs.MediaInputPlaybackEndedEvent;
import io.obswebsocket.community.client.message.event.mediainputs.MediaInputPlaybackStartedEvent;
import io.obswebsocket.community.client.message.event.outputs.RecordStateChangedEvent;
import io.obswebsocket.community.client.message.event.outputs.ReplayBufferSavedEvent;
import io.obswebsocket.community.client.message.event.outputs.ReplayBufferStateChangedEvent;
import io.obswebsocket.community.client.message.event.outputs.StreamStateChangedEvent;
import io.obswebsocket.community.client.message.event.outputs.VirtualcamStateChangedEvent;
import io.obswebsocket.community.client.message.event.sceneitems.SceneItemCreatedEvent;
import io.obswebsocket.community.client.message.event.sceneitems.SceneItemEnableStateChangedEvent;
import io.obswebsocket.community.client.message.event.sceneitems.SceneItemListReindexedEvent;
import io.obswebsocket.community.client.message.event.sceneitems.SceneItemLockStateChangedEvent;
import io.obswebsocket.community.client.message.event.sceneitems.SceneItemRemovedEvent;
import io.obswebsocket.community.client.message.event.scenes.CurrentPreviewSceneChangedEvent;
import io.obswebsocket.community.client.message.event.scenes.CurrentProgramSceneChangedEvent;
import io.obswebsocket.community.client.message.event.scenes.SceneCreatedEvent;
import io.obswebsocket.community.client.message.event.scenes.SceneListChangedEvent;
import io.obswebsocket.community.client.message.event.scenes.SceneNameChangedEvent;
import io.obswebsocket.community.client.message.event.scenes.SceneRemovedEvent;
import io.obswebsocket.community.client.message.event.transitions.CurrentTransitionChangedEvent;
import io.obswebsocket.community.client.message.event.transitions.TransitionCreatedEvent;
import io.obswebsocket.community.client.message.event.transitions.TransitionEndedEvent;
import io.obswebsocket.community.client.message.event.transitions.TransitionNameChangedEvent;
import io.obswebsocket.community.client.message.event.transitions.TransitionRemovedEvent;
import io.obswebsocket.community.client.message.event.transitions.TransitionStartedEvent;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public abstract class Event<T> extends Message {
  @SerializedName("d")
  private Data<T> messageData;

  protected Event(Intent eventIntent) {
    this(eventIntent, null);
  }

  protected Event(Intent eventIntent, T messageData) {
    super(OperationCode.Event);
    this.messageData = Data.<T>builder().eventType(Type.from(getClass())).eventIntent(eventIntent).eventData(messageData).build();
  }

  @Getter
  public enum Type {
    // General
    ExitStarted(ExitStartedEvent.class),
    StudioModeStateChanged(StudioModeStateChangedEvent.class),
    CustomEvent(io.obswebsocket.community.client.message.event.general.CustomEvent.class),

    // Config
    CurrentSceneCollectionChanged(CurrentSceneCollectionChangedEvent.class),
    CurrentProfileChanged(CurrentProfileChangedEvent.class),
    SceneCollectionListChanged(SceneCollectionListChangedEvent.class),
    ProfileListChanged(ProfileListChangedEvent.class),

    // Scenes
    SceneCreated(SceneCreatedEvent.class),
    SceneRemoved(SceneRemovedEvent.class),
    SceneNameChanged(SceneNameChangedEvent.class),
    CurrentProgramSceneChanged(CurrentProgramSceneChangedEvent.class),
    CurrentPreviewSceneChanged(CurrentPreviewSceneChangedEvent.class),
    SceneListChanged(SceneListChangedEvent.class),

    // Inputs
    InputCreated(InputCreatedEvent.class),
    InputRemoved(InputRemovedEvent.class),
    InputNameChanged(InputNameChangedEvent.class),
    InputMuteStateChanged(InputMuteStateChangedEvent.class),
    InputVolumeChanged(InputVolumeChangedEvent.class),
    InputAudioSyncOffsetChanged(InputAudioSyncOffsetChangedEvent.class),
    InputAudioTracksChanged(InputAudioTracksChangedEvent.class),

    // Transitions
    TransitionCreated(TransitionCreatedEvent.class),
    TransitionRemoved(TransitionRemovedEvent.class),
    TransitionNameChanged(TransitionNameChangedEvent.class),
    CurrentTransitionChanged(CurrentTransitionChangedEvent.class),
    TransitionStarted(TransitionStartedEvent.class),
    TransitionEnded(TransitionEndedEvent.class),

    // Filters
    FilterCreated(FilterCreatedEvent.class),
    FilterRemoved(FilterRemovedEvent.class),
    FilterNameChanged(FilterNameChangedEvent.class),
    SourceFilterAdded(SourceFilterAddedEvent.class),
    SourceFilterRemoved(SourceFilterRemovedEvent.class),
    SourceFilterListReindexed(SourceFilterListReindexedEvent.class),

    // Outputs
    StreamStateChanged(StreamStateChangedEvent.class),
    RecordStateChanged(RecordStateChangedEvent.class),
    ReplayBufferStateChanged(ReplayBufferStateChangedEvent.class),
    VirtualcamStateChanged(VirtualcamStateChangedEvent.class),
    ReplayBufferSaved(ReplayBufferSavedEvent.class),

    // Scene Items,
    SceneItemCreated(SceneItemCreatedEvent.class),
    SceneItemRemoved(SceneItemRemovedEvent.class),
    SceneItemListReindexed(SceneItemListReindexedEvent.class),
    SceneItemEnableStateChanged(SceneItemEnableStateChangedEvent.class),
    SceneItemLockStateChanged(SceneItemLockStateChangedEvent.class),

    // Media Inputs
    MediaInputPlaybackStarted(MediaInputPlaybackStartedEvent.class),
    MediaInputPlaybackEnded(MediaInputPlaybackEndedEvent.class),
    MediaInputActionTriggered(MediaInputActionTriggeredEvent.class),

    // High-Volume
    InputVolumeMeters(InputVolumeMetersEvent.class),
    InputActiveStateChanged(InputActiveStateChangedEvent.class),
    InputShowStateChanged(InputShowStateChangedEvent.class),
    ;

    private final Class<? extends Event> eventClass;

    Type(Class<? extends Event> eventClass) {
      this.eventClass = eventClass;
    }

    private static Type from(Class<? extends Event> eventClass) {
      for (Type type : values()) {
        if (type.eventClass.equals(eventClass)) {
          return type;
        }
      }
      return null;
    }
  }

  @Getter
  public enum Intent {
    /**
     * Set subscriptions to 0 to disable all events
     */
    None(0),
    /**
     * Receive events in the `General` category
     */
    General(1),
    /**
     * Receive events in the `Config` category
     */
    Config(1 << 1),
    /**
     * Receive events in the `Scenes` category
     */
    Scenes(1 << 2),
    /**
     * Receive events in the `Inputs` category
     */
    Inputs(1 << 3),
    /**
     * Receive events in the `Transitions` category
     */
    Transitions(1 << 4),
    /**
     * Receive events in the `Filters` category
     */
    Filters(1 << 5),
    /**
     * Receive events in the `Outputs` category
     */
    Outputs(1 << 6),
    /**
     * Receive events in the `Scene Items` category
     */
    SceneItems(1 << 7),
    /**
     * Receive events in the `MediaInputs` category
     */
    MediaInputs(1 << 8),
    /**
     * Receive all event categories (default subscription setting)
     */
    All(General.value | Config.value | Scenes.value | Inputs.value | Transitions.value
            | Filters.value | Outputs.value | SceneItems.value | MediaInputs.value),
    /**
     * InputVolumeMeters event (high-volume)
     */
    InputVolumeMeters(1 << 9),
    /**
     * InputActiveStateChanged event (high-volume)
     */
    InputActiveStateChanged(1 << 10),
    /**
     * InputShowStateChanged event (high-volume)
     */
    InputShowStateChanged(1 << 11),
    ;

    private final int value;

    Intent(int value) {
      this.value = value;
    }
  }

  @Getter
  @ToString
  @SuperBuilder
  public static class Data<T> {
    private Type eventType;
    private Intent eventIntent;
    private T eventData;
  }
}
