package net.twasi.obsremotejava.message.request.scenes;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import net.twasi.obsremotejava.message.request.Request;

@Getter
@ToString(callSuper = true)
public class SetCurrentProgramSceneRequest extends Request {
    private final Data requestData;

    public SetCurrentProgramSceneRequest(String sceneName) {
        super(Type.SetCurrentProgramScene);

        this.requestData = Data.builder().sceneName(sceneName).build();
    }

    @Getter
    @ToString
    @Builder
    public static class Data {
        private final String sceneName;
    }
}
