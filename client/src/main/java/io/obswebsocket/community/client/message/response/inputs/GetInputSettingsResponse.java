package io.obswebsocket.community.client.message.response.inputs;

import com.google.gson.JsonObject;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public class GetInputSettingsResponse extends RequestResponse<GetInputSettingsResponse.Data> {
  public GetInputSettingsResponse() {
    super(Request.Data.Type.GetInputSettings);
  }

  @Getter
  @ToString
  @SuperBuilder
  public static class Data {
    private JsonObject inputSettings;
    private String inputKind;
  }
}
