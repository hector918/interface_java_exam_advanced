package org.example;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MP3Processor implements AudioFormat {
    @Override
    public byte[] processAudio(byte[] rawData) {
        System.out.println("Mp3 processor is processing data");
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            outputStream.write("DECODED_MP3_".getBytes());
            outputStream.write(rawData);
            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Failed to process audio", e);
        }
    }

    @Override
    public boolean isCompatible(byte[] data) {
        System.out.println("Mp3 processor is checking compatible");
        return true;
    }

    @Override
    public String getFormatName() {
        return "MP3";
    }
}
