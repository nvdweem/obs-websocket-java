package net.twasi.obsremotejava.requests.SetVolume;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.RequestBase;
import net.twasi.obsremotejava.requests.RequestType;

public class SetVolumeRequest extends RequestBase {
    private String source;
    private double volume;

    public SetVolumeRequest(OBSCommunicator com, String source, double volume) {
        super(RequestType.SetVolume);

        this.source = source;
        this.volume = volume;

        com.messageTypes.put(getMessageId(), SetVolumeResponse.class);
    }
}
