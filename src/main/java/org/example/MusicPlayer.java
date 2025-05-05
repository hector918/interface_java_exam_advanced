package org.example;

public class MusicPlayer {
    private AudioSource source;
    private AudioOutput output;
    private AudioFormat format;
    private boolean isPlaying;


    public MusicPlayer() {
      isPlaying = false;
    }


    public void setAudioSource(AudioSource source) {
        this.source = source;
        this.isPlaying = false;
    }


    public void setAudioOutput(AudioOutput output) {
        this.output = output;
        this.isPlaying = false;
    }


    public void setAudioFormat(AudioFormat format) {
        this.format = format;
        this.isPlaying = false;
    }


    public void playTrack(String trackId) {
        this.isPlaying = true;
    }


    public void stop() {
        this.isPlaying = false;
    }

    public String getCurrentConfiguration() {
        return "MusicPlayer Configuration:" +
                "\n- Source: " + (source != null ? source.getSourceName() : "none") +
                "\n- Output: " + (output != null ? output.getDeviceName() : "none") +
                "\n- Format: " + (format != null ? format.getFormatName() : "none");
    }
}

