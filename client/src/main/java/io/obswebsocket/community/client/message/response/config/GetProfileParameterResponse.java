package io.obswebsocket.community.client.message.response.config;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.response.RequestResponse;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
public class GetProfileParameterResponse extends RequestResponse<GetProfileParameterResponse.Data> {
  public GetProfileParameterResponse() {
    super(Request.Data.Type.GetProfileParameter);
  }

  @Getter
  @ToString
  @SuperBuilder
  public static class Data {
    private String parameterValue;
    private String defaultParameterValue;
  }
}
