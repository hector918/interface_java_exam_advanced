package org.example;

public class FLACProcessor implements AudioFormat {
    @Override
    public byte[] processAudio(byte[] rawData) {
        System.out.println("FLAC data in process");
        return rawData;
    }

    @Override
    public boolean isCompatible(byte[] data) {
        System.out.println("FLAC checking compatible");
        return true;
    }

    @Override
    public String getFormatName() {
        return "FLAC format";
    }
}
