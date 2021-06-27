package io.obswebsocket.community.client.test.translator.requestSerializationTests;

import io.obswebsocket.community.client.message.request.record.*;
import io.obswebsocket.community.client.test.translator.AbstractSerializationTest;
import org.junit.jupiter.api.Test;

public class RecordRequestsSerializationTest extends AbstractSerializationTest {
    @Test
    void getRecordStatusRequest() {
        GetRecordStatusRequest getRecordStatusRequest = GetRecordStatusRequest.builder()
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'GetRecordStatus',\n" +
                "\t'requestId': " + getRecordStatusRequest.getRequestId() + "\n" +
                "}";

        assertSerializationAndDeserialization(json, getRecordStatusRequest);
    }

    @Test
    void toggleRecordRequest() {
        ToggleRecordRequest toggleRecordRequest = ToggleRecordRequest.builder()
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'ToggleRecord',\n" +
                "\t'requestId': " + toggleRecordRequest.getRequestId() + "\n" +
                "}";

        assertSerializationAndDeserialization(json, toggleRecordRequest);
    }

    @Test
    void startRecordRequest() {
        StartRecordRequest startRecordRequest = StartRecordRequest.builder()
                .waitForResult(true)
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'StartRecord',\n" +
                "\t'requestId': " + startRecordRequest.getRequestId() + ",\n" +
                "\t'requestData': {\n" +
                "\t\t'waitForResult': true\n" +
                "\t}\n" +
                "}";

        assertSerializationAndDeserialization(json, startRecordRequest);
    }

    @Test
    void stopRecordRequest() {
        StopRecordRequest stopRecordRequest = StopRecordRequest.builder()
                .waitForResult(false)
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'StopRecord',\n" +
                "\t'requestId': " + stopRecordRequest.getRequestId() + ",\n" +
                "\t'requestData': {\n" +
                "\t\t'waitForResult': false\n" +
                "\t}\n" +
                "}";

        assertSerializationAndDeserialization(json, stopRecordRequest);
    }

    @Test
    void toggleRecordPauseRequest() {
        ToggleRecordPauseRequest toggleRecordPauseRequest = ToggleRecordPauseRequest.builder()
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'ToggleRecordPause',\n" +
                "\t'requestId': " + toggleRecordPauseRequest.getRequestId() + "\n" +
                "}";

        assertSerializationAndDeserialization(json, toggleRecordPauseRequest);
    }

    @Test
    void pauseRecordRequest() {
        PauseRecordRequest pauseRecordRequest = PauseRecordRequest.builder()
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'PauseRecord',\n" +
                "\t'requestId': " + pauseRecordRequest.getRequestId() + "\n" +
                "}";

        assertSerializationAndDeserialization(json, pauseRecordRequest);
    }

    @Test
    void resumeRecordRequest() {
        ResumeRecordRequest resumeRecordRequest = ResumeRecordRequest.builder()
                .build();

        String json = "{\n" +
                "\t'messageType': 'Request',\n" +
                "\t'requestType': 'ResumeRecord',\n" +
                "\t'requestId': " + resumeRecordRequest.getRequestId() + "\n" +
                "}";

        assertSerializationAndDeserialization(json, resumeRecordRequest);
    }
}