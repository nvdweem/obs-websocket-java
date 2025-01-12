package io.obswebsocket.community.client.message.request;

import com.google.gson.annotations.SerializedName;
import io.obswebsocket.community.client.message.Message;
import io.obswebsocket.community.client.message.request.config.CreateProfileRequest;
import io.obswebsocket.community.client.message.request.config.CreateSceneCollectionRequest;
import io.obswebsocket.community.client.message.request.config.GetPersistentDataRequest;
import io.obswebsocket.community.client.message.request.config.GetProfileListRequest;
import io.obswebsocket.community.client.message.request.config.GetProfileParameterRequest;
import io.obswebsocket.community.client.message.request.config.GetSceneCollectionListRequest;
import io.obswebsocket.community.client.message.request.config.GetVideoSettingsRequest;
import io.obswebsocket.community.client.message.request.config.RemoveProfileRequest;
import io.obswebsocket.community.client.message.request.config.RemoveSceneCollectionRequest;
import io.obswebsocket.community.client.message.request.config.SetCurrentProfileRequest;
import io.obswebsocket.community.client.message.request.config.SetCurrentSceneCollectionRequest;
import io.obswebsocket.community.client.message.request.config.SetPersistentDataRequest;
import io.obswebsocket.community.client.message.request.config.SetProfileParameterRequest;
import io.obswebsocket.community.client.message.request.config.SetVideoSettingsRequest;
import io.obswebsocket.community.client.message.request.filters.CreateSourceFilterRequest;
import io.obswebsocket.community.client.message.request.filters.GetSourceFilterListRequest;
import io.obswebsocket.community.client.message.request.filters.GetSourceFilterRequest;
import io.obswebsocket.community.client.message.request.filters.RemoveSourceFilterRequest;
import io.obswebsocket.community.client.message.request.filters.SetSourceFilterEnabledRequest;
import io.obswebsocket.community.client.message.request.filters.SetSourceFilterIndexRequest;
import io.obswebsocket.community.client.message.request.filters.SetSourceFilterSettingsRequest;
import io.obswebsocket.community.client.message.request.general.BroadcastCustomEventRequest;
import io.obswebsocket.community.client.message.request.general.CloseProjectorRequest;
import io.obswebsocket.community.client.message.request.general.GetHotkeyListRequest;
import io.obswebsocket.community.client.message.request.general.GetProjectorListRequest;
import io.obswebsocket.community.client.message.request.general.GetStatsRequest;
import io.obswebsocket.community.client.message.request.general.GetStudioModeEnabledRequest;
import io.obswebsocket.community.client.message.request.general.GetSystemStatsRequest;
import io.obswebsocket.community.client.message.request.general.GetVersionRequest;
import io.obswebsocket.community.client.message.request.general.OpenProjectorRequest;
import io.obswebsocket.community.client.message.request.general.SetStudioModeEnabledRequest;
import io.obswebsocket.community.client.message.request.general.SleepRequest;
import io.obswebsocket.community.client.message.request.general.TriggerHotkeyByKeySequenceRequest;
import io.obswebsocket.community.client.message.request.general.TriggerHotkeyByNameRequest;
import io.obswebsocket.community.client.message.request.inputs.CreateInputRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputAudioMonitorTypeRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputAudioSyncOffsetRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputAudioTracksRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputDefaultSettingsRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputKindListRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputListRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputMuteRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputPropertiesListPropertyItemsRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputSettingsRequest;
import io.obswebsocket.community.client.message.request.inputs.GetInputVolumeRequest;
import io.obswebsocket.community.client.message.request.inputs.GetSpecialInputNamesRequest;
import io.obswebsocket.community.client.message.request.inputs.PressInputPropertiesButtonRequest;
import io.obswebsocket.community.client.message.request.inputs.RemoveInputRequest;
import io.obswebsocket.community.client.message.request.inputs.SetInputAudioMonitorTypeRequest;
import io.obswebsocket.community.client.message.request.inputs.SetInputAudioSyncOffsetRequest;
import io.obswebsocket.community.client.message.request.inputs.SetInputMuteRequest;
import io.obswebsocket.community.client.message.request.inputs.SetInputNameRequest;
import io.obswebsocket.community.client.message.request.inputs.SetInputSettingsRequest;
import io.obswebsocket.community.client.message.request.inputs.SetInputVolumeRequest;
import io.obswebsocket.community.client.message.request.inputs.ToggleInputMuteRequest;
import io.obswebsocket.community.client.message.request.mediainputs.GetMediaInputStatusRequest;
import io.obswebsocket.community.client.message.request.mediainputs.NextMediaInputPlaylistItemRequest;
import io.obswebsocket.community.client.message.request.mediainputs.OffsetMediaInputTimecodeRequest;
import io.obswebsocket.community.client.message.request.mediainputs.PreviousMediaInputPlaylistItemRequest;
import io.obswebsocket.community.client.message.request.mediainputs.RestartMediaInputRequest;
import io.obswebsocket.community.client.message.request.mediainputs.SetMediaInputPauseStateRequest;
import io.obswebsocket.community.client.message.request.mediainputs.SetMediaInputTimecodeRequest;
import io.obswebsocket.community.client.message.request.mediainputs.StopMediaInputRequest;
import io.obswebsocket.community.client.message.request.outputs.GetLastReplayBufferReplayRequest;
import io.obswebsocket.community.client.message.request.outputs.GetOutputListRequest;
import io.obswebsocket.community.client.message.request.outputs.GetReplayBufferStatusRequest;
import io.obswebsocket.community.client.message.request.outputs.SaveReplayBufferRequest;
import io.obswebsocket.community.client.message.request.outputs.StartOutputRequest;
import io.obswebsocket.community.client.message.request.outputs.StartReplayBufferRequest;
import io.obswebsocket.community.client.message.request.outputs.StopOutputRequest;
import io.obswebsocket.community.client.message.request.outputs.StopReplayBufferRequest;
import io.obswebsocket.community.client.message.request.outputs.ToggleOutputRequest;
import io.obswebsocket.community.client.message.request.outputs.ToggleReplayBufferRequest;
import io.obswebsocket.community.client.message.request.record.GetRecordDirectoryRequest;
import io.obswebsocket.community.client.message.request.record.GetRecordFilenameFormattingRequest;
import io.obswebsocket.community.client.message.request.record.GetRecordStatusRequest;
import io.obswebsocket.community.client.message.request.record.PauseRecordRequest;
import io.obswebsocket.community.client.message.request.record.ResumeRecordRequest;
import io.obswebsocket.community.client.message.request.record.SetRecordDirectoryRequest;
import io.obswebsocket.community.client.message.request.record.SetRecordFilenameFormattingRequest;
import io.obswebsocket.community.client.message.request.record.StartRecordRequest;
import io.obswebsocket.community.client.message.request.record.StopRecordRequest;
import io.obswebsocket.community.client.message.request.record.ToggleRecordPauseRequest;
import io.obswebsocket.community.client.message.request.record.ToggleRecordRequest;
import io.obswebsocket.community.client.message.request.sceneitems.CreateSceneItemRequest;
import io.obswebsocket.community.client.message.request.sceneitems.DuplicateSceneItemRequest;
import io.obswebsocket.community.client.message.request.sceneitems.GetSceneItemColorRequest;
import io.obswebsocket.community.client.message.request.sceneitems.GetSceneItemEnabledRequest;
import io.obswebsocket.community.client.message.request.sceneitems.GetSceneItemListRequest;
import io.obswebsocket.community.client.message.request.sceneitems.GetSceneItemLockedRequest;
import io.obswebsocket.community.client.message.request.sceneitems.RemoveSceneItemRequest;
import io.obswebsocket.community.client.message.request.sceneitems.SetSceneItemEnabledRequest;
import io.obswebsocket.community.client.message.request.sceneitems.SetSceneItemIndexRequest;
import io.obswebsocket.community.client.message.request.sceneitems.SetSceneItemLockedRequest;
import io.obswebsocket.community.client.message.request.scenes.CreateSceneRequest;
import io.obswebsocket.community.client.message.request.scenes.DeleteSceneTransitionOverrideRequest;
import io.obswebsocket.community.client.message.request.scenes.GetCurrentPreviewSceneRequest;
import io.obswebsocket.community.client.message.request.scenes.GetCurrentProgramSceneRequest;
import io.obswebsocket.community.client.message.request.scenes.GetSceneListRequest;
import io.obswebsocket.community.client.message.request.scenes.GetSceneTransitionOverrideRequest;
import io.obswebsocket.community.client.message.request.scenes.RemoveSceneRequest;
import io.obswebsocket.community.client.message.request.scenes.SetCurrentPreviewSceneRequest;
import io.obswebsocket.community.client.message.request.scenes.SetCurrentProgramSceneRequest;
import io.obswebsocket.community.client.message.request.scenes.SetSceneIndexRequest;
import io.obswebsocket.community.client.message.request.scenes.SetSceneNameRequest;
import io.obswebsocket.community.client.message.request.scenes.SetSceneTransitionOverrideRequest;
import io.obswebsocket.community.client.message.request.sources.GetSourceActiveRequest;
import io.obswebsocket.community.client.message.request.sources.GetSourceScreenshotRequest;
import io.obswebsocket.community.client.message.request.sources.SaveSourceScreenshotRequest;
import io.obswebsocket.community.client.message.request.stream.GetStreamServiceSettingsRequest;
import io.obswebsocket.community.client.message.request.stream.GetStreamStatusRequest;
import io.obswebsocket.community.client.message.request.stream.SendStreamCaptionRequest;
import io.obswebsocket.community.client.message.request.stream.SetStreamServiceSettingsRequest;
import io.obswebsocket.community.client.message.request.stream.StartStreamRequest;
import io.obswebsocket.community.client.message.request.stream.StopStreamRequest;
import io.obswebsocket.community.client.message.request.stream.ToggleStreamRequest;
import io.obswebsocket.community.client.message.request.transitions.GetCurrentTransitionRequest;
import io.obswebsocket.community.client.message.request.transitions.GetTransitionListRequest;
import io.obswebsocket.community.client.message.request.transitions.GetTransitionSettingsRequest;
import io.obswebsocket.community.client.message.request.transitions.ReleaseTbarRequest;
import io.obswebsocket.community.client.message.request.transitions.SetCurrentTransitionDurationRequest;
import io.obswebsocket.community.client.message.request.transitions.SetCurrentTransitionRequest;
import io.obswebsocket.community.client.message.request.transitions.SetTbarPositionRequest;
import io.obswebsocket.community.client.message.request.transitions.SetTransitionSettingsRequest;
import io.obswebsocket.community.client.message.request.transitions.TriggerStudioModeTransitionRequest;
import io.obswebsocket.community.client.message.response.RequestResponse;
import io.obswebsocket.community.client.message.response.config.CreateSceneCollectionResponse;
import io.obswebsocket.community.client.message.response.config.GetPersistentDataResponse;
import io.obswebsocket.community.client.message.response.config.GetProfileListResponse;
import io.obswebsocket.community.client.message.response.config.GetProfileParameterResponse;
import io.obswebsocket.community.client.message.response.config.GetSceneCollectionListResponse;
import io.obswebsocket.community.client.message.response.config.GetVideoSettingsResponse;
import io.obswebsocket.community.client.message.response.config.RemoveSceneCollectionResponse;
import io.obswebsocket.community.client.message.response.config.SetCurrentSceneCollectionResponse;
import io.obswebsocket.community.client.message.response.config.SetPersistentDataResponse;
import io.obswebsocket.community.client.message.response.config.SetProfileParameterResponse;
import io.obswebsocket.community.client.message.response.filters.CreateSourceFilterResponse;
import io.obswebsocket.community.client.message.response.filters.GetSourceFilterListResponse;
import io.obswebsocket.community.client.message.response.filters.GetSourceFilterResponse;
import io.obswebsocket.community.client.message.response.filters.RemoveSourceFilterResponse;
import io.obswebsocket.community.client.message.response.filters.SetSourceFilterEnabledResponse;
import io.obswebsocket.community.client.message.response.filters.SetSourceFilterIndexResponse;
import io.obswebsocket.community.client.message.response.filters.SetSourceFilterSettingsResponse;
import io.obswebsocket.community.client.message.response.general.BroadcastCustomEventResponse;
import io.obswebsocket.community.client.message.response.general.CloseProjectorResponse;
import io.obswebsocket.community.client.message.response.general.CreateProfileResponse;
import io.obswebsocket.community.client.message.response.general.GetHotkeyListResponse;
import io.obswebsocket.community.client.message.response.general.GetProjectorListResponse;
import io.obswebsocket.community.client.message.response.general.GetStudioModeEnabledResponse;
import io.obswebsocket.community.client.message.response.general.GetSystemStatsResponse;
import io.obswebsocket.community.client.message.response.general.GetVersionResponse;
import io.obswebsocket.community.client.message.response.general.OpenProjectorResponse;
import io.obswebsocket.community.client.message.response.general.RemoveProfileResponse;
import io.obswebsocket.community.client.message.response.general.SetCurrentProfileResponse;
import io.obswebsocket.community.client.message.response.general.SetStudioModeEnabledResponse;
import io.obswebsocket.community.client.message.response.general.SetVideoSettingsResponse;
import io.obswebsocket.community.client.message.response.general.SleepResponse;
import io.obswebsocket.community.client.message.response.general.TriggerHotkeyByKeySequenceResponse;
import io.obswebsocket.community.client.message.response.general.TriggerHotkeyByNameResponse;
import io.obswebsocket.community.client.message.response.inputs.CreateInputResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputAudioMonitorTypeResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputAudioSyncOffsetResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputAudioTracksResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputDefaultSettingsResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputKindListResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputListResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputMuteResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputPropertiesListPropertyItemsResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputSettingsResponse;
import io.obswebsocket.community.client.message.response.inputs.GetInputVolumeResponse;
import io.obswebsocket.community.client.message.response.inputs.GetSpecialInputNamesResponse;
import io.obswebsocket.community.client.message.response.inputs.PressInputPropertiesButtonResponse;
import io.obswebsocket.community.client.message.response.inputs.RemoveInputResponse;
import io.obswebsocket.community.client.message.response.inputs.SetInputAudioMonitorTypeResponse;
import io.obswebsocket.community.client.message.response.inputs.SetInputAudioSyncOffsetResponse;
import io.obswebsocket.community.client.message.response.inputs.SetInputMuteResponse;
import io.obswebsocket.community.client.message.response.inputs.SetInputNameResponse;
import io.obswebsocket.community.client.message.response.inputs.SetInputSettingsResponse;
import io.obswebsocket.community.client.message.response.inputs.SetInputVolumeResponse;
import io.obswebsocket.community.client.message.response.inputs.ToggleInputMuteResponse;
import io.obswebsocket.community.client.message.response.mediainputs.GetMediaInputStatusResponse;
import io.obswebsocket.community.client.message.response.mediainputs.NextMediaInputPlaylistItemResponse;
import io.obswebsocket.community.client.message.response.mediainputs.OffsetMediaInputTimecodeResponse;
import io.obswebsocket.community.client.message.response.mediainputs.PreviousMediaInputPlaylistItemResponse;
import io.obswebsocket.community.client.message.response.mediainputs.RestartMediaInputResponse;
import io.obswebsocket.community.client.message.response.mediainputs.SetMediaInputPauseStateResponse;
import io.obswebsocket.community.client.message.response.mediainputs.SetMediaInputTimecodeResponse;
import io.obswebsocket.community.client.message.response.mediainputs.StopMediaInputResponse;
import io.obswebsocket.community.client.message.response.outputs.GetLastReplayBufferReplayResponse;
import io.obswebsocket.community.client.message.response.outputs.GetOutputListResponse;
import io.obswebsocket.community.client.message.response.outputs.GetReplayBufferStatusResponse;
import io.obswebsocket.community.client.message.response.outputs.SaveReplayBufferResponse;
import io.obswebsocket.community.client.message.response.outputs.StartOutputResponse;
import io.obswebsocket.community.client.message.response.outputs.StartReplayBufferResponse;
import io.obswebsocket.community.client.message.response.outputs.StopOutputResponse;
import io.obswebsocket.community.client.message.response.outputs.StopReplayBufferResponse;
import io.obswebsocket.community.client.message.response.outputs.ToggleOutputResponse;
import io.obswebsocket.community.client.message.response.outputs.ToggleReplayBufferResponse;
import io.obswebsocket.community.client.message.response.record.GetRecordDirectoryResponse;
import io.obswebsocket.community.client.message.response.record.GetRecordFilenameFormattingResponse;
import io.obswebsocket.community.client.message.response.record.GetRecordStatusResponse;
import io.obswebsocket.community.client.message.response.record.PauseRecordResponse;
import io.obswebsocket.community.client.message.response.record.ResumeRecordResponse;
import io.obswebsocket.community.client.message.response.record.SetRecordDirectoryResponse;
import io.obswebsocket.community.client.message.response.record.SetRecordFilenameFormattingResponse;
import io.obswebsocket.community.client.message.response.record.StartRecordResponse;
import io.obswebsocket.community.client.message.response.record.StopRecordResponse;
import io.obswebsocket.community.client.message.response.record.ToggleRecordPauseResponse;
import io.obswebsocket.community.client.message.response.record.ToggleRecordResponse;
import io.obswebsocket.community.client.message.response.sceneitems.CreateSceneItemResponse;
import io.obswebsocket.community.client.message.response.sceneitems.DuplicateSceneItemResponse;
import io.obswebsocket.community.client.message.response.sceneitems.GetSceneItemColorResponse;
import io.obswebsocket.community.client.message.response.sceneitems.GetSceneItemEnabledResponse;
import io.obswebsocket.community.client.message.response.sceneitems.GetSceneItemListResponse;
import io.obswebsocket.community.client.message.response.sceneitems.GetSceneItemLockedResponse;
import io.obswebsocket.community.client.message.response.sceneitems.RemoveSceneItemResponse;
import io.obswebsocket.community.client.message.response.sceneitems.SetSceneItemEnabledResponse;
import io.obswebsocket.community.client.message.response.sceneitems.SetSceneItemIndexResponse;
import io.obswebsocket.community.client.message.response.sceneitems.SetSceneItemLockedResponse;
import io.obswebsocket.community.client.message.response.scenes.CreateSceneResponse;
import io.obswebsocket.community.client.message.response.scenes.DeleteSceneTransitionOverrideResponse;
import io.obswebsocket.community.client.message.response.scenes.GetCurrentPreviewSceneResponse;
import io.obswebsocket.community.client.message.response.scenes.GetCurrentProgramSceneResponse;
import io.obswebsocket.community.client.message.response.scenes.GetSceneListResponse;
import io.obswebsocket.community.client.message.response.scenes.GetSceneTransitionOverrideResponse;
import io.obswebsocket.community.client.message.response.scenes.RemoveSceneResponse;
import io.obswebsocket.community.client.message.response.scenes.SetCurrentPreviewSceneResponse;
import io.obswebsocket.community.client.message.response.scenes.SetCurrentProgramSceneResponse;
import io.obswebsocket.community.client.message.response.scenes.SetSceneIndexResponse;
import io.obswebsocket.community.client.message.response.scenes.SetSceneNameResponse;
import io.obswebsocket.community.client.message.response.scenes.SetSceneTransitionOverrideResponse;
import io.obswebsocket.community.client.message.response.sources.GetSourceActiveResponse;
import io.obswebsocket.community.client.message.response.sources.GetSourceScreenshotResponse;
import io.obswebsocket.community.client.message.response.sources.SaveSourceScreenshotResponse;
import io.obswebsocket.community.client.message.response.stream.GetStreamServiceSettingsResponse;
import io.obswebsocket.community.client.message.response.stream.GetStreamStatusResponse;
import io.obswebsocket.community.client.message.response.stream.SendStreamCaptionResponse;
import io.obswebsocket.community.client.message.response.stream.SetStreamServiceSettingsResponse;
import io.obswebsocket.community.client.message.response.stream.StartStreamResponse;
import io.obswebsocket.community.client.message.response.stream.StopStreamResponse;
import io.obswebsocket.community.client.message.response.stream.ToggleStreamResponse;
import io.obswebsocket.community.client.message.response.transitions.GetCurrentTransitionResponse;
import io.obswebsocket.community.client.message.response.transitions.GetTransitionListResponse;
import io.obswebsocket.community.client.message.response.transitions.GetTransitionSettingsResponse;
import io.obswebsocket.community.client.message.response.transitions.ReleaseTbarResponse;
import io.obswebsocket.community.client.message.response.transitions.SetCurrentTransitionDurationResponse;
import io.obswebsocket.community.client.message.response.transitions.SetCurrentTransitionResponse;
import io.obswebsocket.community.client.message.response.transitions.SetTbarPositionResponse;
import io.obswebsocket.community.client.message.response.transitions.SetTransitionSettingsResponse;
import io.obswebsocket.community.client.message.response.transitions.TriggerStudioModeTransitionResponse;
import java.util.UUID;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public abstract class Request<T> extends Message {

  @SerializedName("d")
  private RequestData<T> data;

  protected Request(Data.Type type, T requestData) {
    super(OperationCode.Request);
    this.data = RequestData.<T>builder().requestType(type).requestId(UUID.randomUUID().toString()).requestData(requestData).build();
  }

  public String getRequestId() {
    return this.data.requestId;
  }

  public Data.Type getRequestType() {
    return this.data.requestType;
  }

  @SuperBuilder
  @Getter
  @ToString
  public static class RequestData<T> extends Data {

    protected T requestData;
  }

  @SuperBuilder(builderMethodName = "baseBuilder")
  @Getter
  @ToString
  public static class Data {
    protected Type requestType;
    protected String requestId;

    @Getter
    public enum Type {
      // General
      GetVersion(GetVersionRequest.class, GetVersionResponse.class),
      BroadcastCustomEvent(BroadcastCustomEventRequest.class, BroadcastCustomEventResponse.class),
      GetSystemStats(GetSystemStatsRequest.class, GetSystemStatsResponse.class),
      GetHotkeyList(GetHotkeyListRequest.class, GetHotkeyListResponse.class),
      TriggerHotkeyByName(TriggerHotkeyByNameRequest.class, TriggerHotkeyByNameResponse.class),
      TriggerHotkeyByKeySequence(TriggerHotkeyByKeySequenceRequest.class,
              TriggerHotkeyByKeySequenceResponse.class),
      GetProjectorList(GetProjectorListRequest.class, GetProjectorListResponse.class),
      GetStudioModeEnabled(GetStudioModeEnabledRequest.class, GetStudioModeEnabledResponse.class),
      SetStudioModeEnabled(SetStudioModeEnabledRequest.class, SetStudioModeEnabledResponse.class),
      Sleep(SleepRequest.class, SleepResponse.class),
      OpenProjector(OpenProjectorRequest.class, OpenProjectorResponse.class),
      CloseProjector(CloseProjectorRequest.class, CloseProjectorResponse.class),
      GetStats(GetStatsRequest.class, GetSystemStatsResponse.class),

      // Config
      GetPersistentData(GetPersistentDataRequest.class,
              GetPersistentDataResponse.class),
      SetPersistentData(SetPersistentDataRequest.class,
              SetPersistentDataResponse.class),
      GetSceneCollectionList(GetSceneCollectionListRequest.class,
              GetSceneCollectionListResponse.class),
      SetCurrentSceneCollection(SetCurrentSceneCollectionRequest.class,
              SetCurrentSceneCollectionResponse.class),
      CreateSceneCollection(CreateSceneCollectionRequest.class, CreateSceneCollectionResponse.class),
      RemoveSceneCollection(RemoveSceneCollectionRequest.class, RemoveSceneCollectionResponse.class),
      GetProfileList(GetProfileListRequest.class, GetProfileListResponse.class),
      GetProfileParameter(GetProfileParameterRequest.class, GetProfileParameterResponse.class),
      SetProfileParameter(SetProfileParameterRequest.class, SetProfileParameterResponse.class),
      GetVideoSettings(GetVideoSettingsRequest.class, GetVideoSettingsResponse.class),
      SetCurrentProfile(SetCurrentProfileRequest.class, SetCurrentProfileResponse.class),
      CreateProfile(CreateProfileRequest.class, CreateProfileResponse.class),
      RemoveProfile(RemoveProfileRequest.class, RemoveProfileResponse.class),
      SetVideoSettings(SetVideoSettingsRequest.class, SetVideoSettingsResponse.class),

      // Scenes
      GetSceneList(GetSceneListRequest.class, GetSceneListResponse.class),
      GetCurrentProgramScene(GetCurrentProgramSceneRequest.class,
              GetCurrentProgramSceneResponse.class),
      SetCurrentProgramScene(SetCurrentProgramSceneRequest.class,
              SetCurrentProgramSceneResponse.class),
      GetCurrentPreviewScene(GetCurrentPreviewSceneRequest.class,
              GetCurrentPreviewSceneResponse.class),
      SetCurrentPreviewScene(SetCurrentPreviewSceneRequest.class,
              SetCurrentPreviewSceneResponse.class),
      CreateScene(CreateSceneRequest.class, CreateSceneResponse.class),
      SetSceneIndex(SetSceneIndexRequest.class, SetSceneIndexResponse.class),
      SetSceneName(SetSceneNameRequest.class, SetSceneNameResponse.class),
      RemoveScene(RemoveSceneRequest.class, RemoveSceneResponse.class),
      GetSceneTransitionOverride(GetSceneTransitionOverrideRequest.class,
              GetSceneTransitionOverrideResponse.class),
      SetSceneTransitionOverride(SetSceneTransitionOverrideRequest.class,
              SetSceneTransitionOverrideResponse.class),
      DeleteSceneTransitionOverride(DeleteSceneTransitionOverrideRequest.class,
              DeleteSceneTransitionOverrideResponse.class),

      // Sources
      GetSourceActive(GetSourceActiveRequest.class, GetSourceActiveResponse.class),
      GetSourceScreenshot(GetSourceScreenshotRequest.class, GetSourceScreenshotResponse.class),
      SaveSourceScreenshot(SaveSourceScreenshotRequest.class, SaveSourceScreenshotResponse.class),

      // Inputs
      GetInputList(GetInputListRequest.class, GetInputListResponse.class),
      GetInputKindList(GetInputKindListRequest.class, GetInputKindListResponse.class),
      GetInputDefaultSettings(GetInputDefaultSettingsRequest.class,
              GetInputDefaultSettingsResponse.class),
      GetInputSettings(GetInputSettingsRequest.class, GetInputSettingsResponse.class),
      SetInputSettings(SetInputSettingsRequest.class, SetInputSettingsResponse.class),
      GetInputMute(GetInputMuteRequest.class, GetInputMuteResponse.class),
      SetInputMute(SetInputMuteRequest.class, SetInputMuteResponse.class),
      ToggleInputMute(ToggleInputMuteRequest.class, ToggleInputMuteResponse.class),
      GetInputVolume(GetInputVolumeRequest.class, GetInputVolumeResponse.class),
      GetSpecialInputNames(GetSpecialInputNamesRequest.class, GetSpecialInputNamesResponse.class),
      SetInputName(SetInputNameRequest.class, SetInputNameResponse.class),
      SetInputVolume(SetInputVolumeRequest.class, SetInputVolumeResponse.class),
      CreateInput(CreateInputRequest.class, CreateInputResponse.class),
      RemoveInput(RemoveInputRequest.class, RemoveInputResponse.class),
      GetInputAudioTracks(GetInputAudioTracksRequest.class, GetInputAudioTracksResponse.class),
      GetInputAudioMonitorType(GetInputAudioMonitorTypeRequest.class,
              GetInputAudioMonitorTypeResponse.class),
      SetInputAudioMonitorType(SetInputAudioMonitorTypeRequest.class,
              SetInputAudioMonitorTypeResponse.class),
      GetInputAudioSyncOffset(GetInputAudioSyncOffsetRequest.class,
              GetInputAudioSyncOffsetResponse.class),
      SetInputAudioSyncOffset(SetInputAudioSyncOffsetRequest.class,
              SetInputAudioSyncOffsetResponse.class),
      GetInputPropertiesListPropertyItems(GetInputPropertiesListPropertyItemsRequest.class,
              GetInputPropertiesListPropertyItemsResponse.class),
      PressInputPropertiesButton(PressInputPropertiesButtonRequest.class,
              PressInputPropertiesButtonResponse.class),

      // Stream
      GetStreamStatus(GetStreamStatusRequest.class, GetStreamStatusResponse.class),
      ToggleStream(ToggleStreamRequest.class, ToggleStreamResponse.class),
      StartStream(StartStreamRequest.class, StartStreamResponse.class),
      StopStream(StopStreamRequest.class, StopStreamResponse.class),
      SendStreamCaption(SendStreamCaptionRequest.class, SendStreamCaptionResponse.class),
      GetStreamServiceSettings(GetStreamServiceSettingsRequest.class,
              GetStreamServiceSettingsResponse.class),
      SetStreamServiceSettings(SetStreamServiceSettingsRequest.class,
              SetStreamServiceSettingsResponse.class),

      // Transitions
      GetTransitionList(GetTransitionListRequest.class, GetTransitionListResponse.class),
      GetCurrentTransition(GetCurrentTransitionRequest.class, GetCurrentTransitionResponse.class),
      SetCurrentTransition(SetCurrentTransitionRequest.class, SetCurrentTransitionResponse.class),
      SetCurrentTransitionDuration(SetCurrentTransitionDurationRequest.class,
              SetCurrentTransitionDurationResponse.class),
      GetTransitionSettings(GetTransitionSettingsRequest.class, GetTransitionSettingsResponse.class),
      SetTransitionSettings(SetTransitionSettingsRequest.class, SetTransitionSettingsResponse.class),
      ReleaseTbar(ReleaseTbarRequest.class, ReleaseTbarResponse.class),
      SetTbarPosition(SetTbarPositionRequest.class, SetTbarPositionResponse.class),
      TriggerStudioModeTransition(TriggerStudioModeTransitionRequest.class,
              TriggerStudioModeTransitionResponse.class),

      // Filters
      GetSourceFilterList(GetSourceFilterListRequest.class, GetSourceFilterListResponse.class),
      GetSourceFilter(GetSourceFilterRequest.class, GetSourceFilterResponse.class),
      SetSourceFilterIndex(SetSourceFilterIndexRequest.class, SetSourceFilterIndexResponse.class),
      SetSourceFilterSettings(SetSourceFilterSettingsRequest.class,
              SetSourceFilterSettingsResponse.class),
      SetSourceFilterEnabled(SetSourceFilterEnabledRequest.class,
              SetSourceFilterEnabledResponse.class),
      CreateSourceFilter(CreateSourceFilterRequest.class, CreateSourceFilterResponse.class),
      RemoveSourceFilter(RemoveSourceFilterRequest.class, RemoveSourceFilterResponse.class),

      // Scene Items
      GetSceneItemList(GetSceneItemListRequest.class, GetSceneItemListResponse.class),
      GetSceneItemEnabled(GetSceneItemEnabledRequest.class, GetSceneItemEnabledResponse.class),
      SetSceneItemEnabled(SetSceneItemEnabledRequest.class, SetSceneItemEnabledResponse.class),
      GetSceneItemLocked(GetSceneItemLockedRequest.class, GetSceneItemLockedResponse.class),
      SetSceneItemLocked(SetSceneItemLockedRequest.class, SetSceneItemLockedResponse.class),
      GetSceneItemColor(GetSceneItemColorRequest.class, GetSceneItemColorResponse.class),
      SetSceneItemIndex(SetSceneItemIndexRequest.class, SetSceneItemIndexResponse.class),
      CreateSceneItem(CreateSceneItemRequest.class, CreateSceneItemResponse.class),
      RemoveSceneItem(RemoveSceneItemRequest.class, RemoveSceneItemResponse.class),
      DuplicateSceneItem(DuplicateSceneItemRequest.class, DuplicateSceneItemResponse.class),

      // Outputs
      GetReplayBufferStatus(GetReplayBufferStatusRequest.class, GetReplayBufferStatusResponse.class),
      ToggleReplayBuffer(ToggleReplayBufferRequest.class, ToggleReplayBufferResponse.class),
      StartReplayBuffer(StartReplayBufferRequest.class, StartReplayBufferResponse.class),
      StopReplayBuffer(StopReplayBufferRequest.class, StopReplayBufferResponse.class),
      SaveReplayBuffer(SaveReplayBufferRequest.class, SaveReplayBufferResponse.class),
      GetLastReplayBufferReplay(GetLastReplayBufferReplayRequest.class,
              GetLastReplayBufferReplayResponse.class),
      GetOutputList(GetOutputListRequest.class, GetOutputListResponse.class),
      ToggleOutput(ToggleOutputRequest.class, ToggleOutputResponse.class),
      StartOutput(StartOutputRequest.class, StartOutputResponse.class),
      StopOutput(StopOutputRequest.class, StopOutputResponse.class),

      // Record
      GetRecordStatus(GetRecordStatusRequest.class, GetRecordStatusResponse.class),
      ToggleRecord(ToggleRecordRequest.class, ToggleRecordResponse.class),
      StartRecord(StartRecordRequest.class, StartRecordResponse.class),
      StopRecord(StopRecordRequest.class, StopRecordResponse.class),
      ToggleRecordPause(ToggleRecordPauseRequest.class, ToggleRecordPauseResponse.class),
      PauseRecord(PauseRecordRequest.class, PauseRecordResponse.class),
      ResumeRecord(ResumeRecordRequest.class, ResumeRecordResponse.class),
      GetRecordDirectory(GetRecordDirectoryRequest.class, GetRecordDirectoryResponse.class),
      SetRecordDirectory(SetRecordDirectoryRequest.class, SetRecordDirectoryResponse.class),
      GetRecordFilenameFormatting(GetRecordFilenameFormattingRequest.class,
              GetRecordFilenameFormattingResponse.class),
      SetRecordFilenameFormatting(SetRecordFilenameFormattingRequest.class,
              SetRecordFilenameFormattingResponse.class),

      // Media Inputs
      GetMediaInputStatus(GetMediaInputStatusRequest.class, GetMediaInputStatusResponse.class),
      OffsetMediaInputTimecode(OffsetMediaInputTimecodeRequest.class,
              OffsetMediaInputTimecodeResponse.class),
      SetMediaInputTimecode(SetMediaInputTimecodeRequest.class, SetMediaInputTimecodeResponse.class),
      SetMediaInputPauseState(SetMediaInputPauseStateRequest.class,
              SetMediaInputPauseStateResponse.class),
      StopMediaInput(StopMediaInputRequest.class, StopMediaInputResponse.class),
      RestartMediaInput(RestartMediaInputRequest.class, RestartMediaInputResponse.class),
      NextMediaInputPlaylistItem(NextMediaInputPlaylistItemRequest.class,
              NextMediaInputPlaylistItemResponse.class),
      PreviousMediaInputPlaylistItem(PreviousMediaInputPlaylistItemRequest.class,
              PreviousMediaInputPlaylistItemResponse.class),
      ;

      private final Class<? extends Request> requestClass;
      private final Class<? extends RequestResponse> requestResponseClass;

      Type(Class<? extends Request> requestClass,
              Class<? extends RequestResponse> requestResponseClass) {
        this.requestClass = requestClass;
        this.requestResponseClass = requestResponseClass;
      }
    }
  }

}
