package net.twasi.obsremotejava.message.response.inputs;

import lombok.Getter;
import lombok.ToString;
import net.twasi.obsremotejava.message.request.Request;
import net.twasi.obsremotejava.message.response.RequestResponse;

@Getter
@ToString(callSuper = true)
public class CreateInputResponse extends RequestResponse {
    private Data responseData;

    public CreateInputResponse() {
        super(Request.Type.CreateInput);
    }

    @Getter
    @ToString
    public static class Data {
        private Integer sceneItemId;
    }
}
