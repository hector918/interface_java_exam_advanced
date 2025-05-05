package org.example;

public class LocalFileSystem implements AudioSource {
    private final String rootDirectory;
    private boolean mounted;

    public LocalFileSystem(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    @Override
    public boolean connect() {
        this.mounted = true;
        return true;
    }

    @Override
    public void disconnect() {
        this.mounted = false;
    }

    @Override
    public byte[] getAudioData(String trackId) {
        System.out.println("Local file system is reading audio data");
        return "some fake data".getBytes();
    }

    @Override
    public String getSourceName() {
        return "Local Files (" + this.rootDirectory + ")";
    }
}
