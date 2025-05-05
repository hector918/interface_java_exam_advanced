package org.example;
import java.nio.charset.StandardCharsets;

public class WAVProcessor implements AudioFormat {
    @Override
    public byte[] processAudio(byte[] rawData) {
        System.out.println("Wav processor is processing data");
        return rawData;
    }

    @Override
    public boolean isCompatible(byte[] data) {
        System.out.println("Was processor is checking compaible");

        return !containsSubarray(data, "MP3_TEST_DATA".getBytes(StandardCharsets.UTF_8));

    }

    private boolean containsSubarray(byte[] data, byte[] pattern) {
        for (int i = 0; i <= data.length - pattern.length; i++) {
            boolean match = true;
            for (int j = 0; j < pattern.length; j++) {
                if (data[i + j] != pattern[j]) {
                    match = false;
                    break; // 只跳出内层循环，标记匹配失败
                }
            }
            if (match) {
                return true; // 如果内层循环没有被跳出，表示匹配成功
            }
        }
        return false;
    }

    @Override
    public String getFormatName() {
        return "WAV";
    }
}
