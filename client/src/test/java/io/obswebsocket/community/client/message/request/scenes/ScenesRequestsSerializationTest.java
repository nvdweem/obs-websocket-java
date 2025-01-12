package io.obswebsocket.community.client.message.request.scenes;

import org.junit.jupiter.api.Test;

import io.obswebsocket.community.client.message.AbstractSerializationTest;

public class ScenesRequestsSerializationTest extends AbstractSerializationTest {

  @Test
  void createSceneRequest() {
    CreateSceneRequest createSceneRequest = CreateSceneRequest.builder()
                                                              .sceneName("Scene name")
                                                              .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'CreateScene',\n" +
            "\t'requestId': " + createSceneRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, createSceneRequest);
  }

  @Test
  void deleteSceneTransitionOverrideRequest() {
    DeleteSceneTransitionOverrideRequest deleteSceneTransitionOverrideRequest = DeleteSceneTransitionOverrideRequest
            .builder()
            .sceneName("Scene name")
            .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'DeleteSceneTransitionOverride',\n" +
            "\t'requestId': " + deleteSceneTransitionOverrideRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, deleteSceneTransitionOverrideRequest);
  }

  @Test
  void getCurrentPreviewSceneRequest() {
    GetCurrentPreviewSceneRequest getCurrentPreviewSceneRequest = GetCurrentPreviewSceneRequest
            .builder().build();

    String json = "{'d': {\n" +
            "\t'requestType': 'GetCurrentPreviewScene',\n" +
            "\t'requestId': " + getCurrentPreviewSceneRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, getCurrentPreviewSceneRequest);
  }

  @Test
  void getCurrentProgramSceneRequest() {
    GetCurrentProgramSceneRequest getCurrentProgramSceneRequest = GetCurrentProgramSceneRequest
            .builder().build();

    String json = "{'d': {\n" +
            "\t'requestType': 'GetCurrentProgramScene',\n" +
            "\t'requestId': " + getCurrentProgramSceneRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, getCurrentProgramSceneRequest);
  }

  @Test
  void getSceneListRequest() {
    GetSceneListRequest getSceneListRequest = GetSceneListRequest.builder().build();

    String json = "{'d': {\n" +
            "\t'requestType': 'GetSceneList',\n" +
            "\t'requestId': " + getSceneListRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, getSceneListRequest);
  }

  @Test
  void getSceneTransitionOverrideRequest() {
    GetSceneTransitionOverrideRequest getSceneTransitionOverrideRequest = GetSceneTransitionOverrideRequest
            .builder()
            .sceneName("Scene name")
            .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'GetSceneTransitionOverride',\n" +
            "\t'requestId': " + getSceneTransitionOverrideRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, getSceneTransitionOverrideRequest);
  }

  @Test
  void removeSceneRequest() {
    RemoveSceneRequest removeSceneRequest = RemoveSceneRequest.builder()
                                                              .sceneName("Scene name")
                                                              .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'RemoveScene',\n" +
            "\t'requestId': " + removeSceneRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, removeSceneRequest);
  }

  @Test
  void setCurrentPreviewSceneRequest() {
    SetCurrentPreviewSceneRequest setCurrentPreviewSceneRequest = SetCurrentPreviewSceneRequest
            .builder()
            .sceneName("Scene name")
            .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'SetCurrentPreviewScene',\n" +
            "\t'requestId': " + setCurrentPreviewSceneRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, setCurrentPreviewSceneRequest);
  }

  @Test
  void setCurrentProgramSceneRequest() {
    SetCurrentProgramSceneRequest setCurrentProgramSceneRequest = SetCurrentProgramSceneRequest
            .builder()
            .sceneName("Scene name")
            .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'SetCurrentProgramScene',\n" +
            "\t'requestId': " + setCurrentProgramSceneRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, setCurrentProgramSceneRequest);
  }

  @Test
  void setSceneIndexRequest() {
    SetSceneIndexRequest setSceneIndexRequest = SetSceneIndexRequest.builder()
                                                                    .sceneName("Scene name")
                                                                    .sceneIndex(0)
                                                                    .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'sceneName': 'Scene name',\n" +
            "\t\t'sceneIndex': 0\n" +
            "\t},\n" +
            "\t'requestType': 'SetSceneIndex',\n" +
            "\t'requestId': " + setSceneIndexRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, setSceneIndexRequest);
  }

  @Test
  void setSceneNameRequest() {
    SetSceneNameRequest setSceneNameRequest = SetSceneNameRequest.builder()
                                                                 .sceneName("Scene name")
                                                                 .newSceneName("New Scene name")
                                                                 .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'newSceneName': 'New Scene name',\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'SetSceneName',\n" +
            "\t'requestId': " + setSceneNameRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, setSceneNameRequest);
  }

  @Test
  void setSceneTransitionOverrideRequest() {
    SetSceneTransitionOverrideRequest setSceneTransitionOverrideRequest = SetSceneTransitionOverrideRequest
            .builder()
            .sceneName("Scene name")
            .transitionName("Transition Name")
            .transitionDuration(3)
            .build();

    String json = "{'d': {\n" +
            "\t'requestData': {\n" +
            "\t\t'transitionName': 'Transition Name',\n" +
            "\t\t'transitionDuration': 3,\n" +
            "\t\t'sceneName': 'Scene name'\n" +
            "\t},\n" +
            "\t'requestType': 'SetSceneTransitionOverride',\n" +
            "\t'requestId': " + setSceneTransitionOverrideRequest.getRequestId() + "},\n" +
            "\t'op': 6\n" +
            "}";

    assertSerializationAndDeserialization(json, setSceneTransitionOverrideRequest);
  }
}
