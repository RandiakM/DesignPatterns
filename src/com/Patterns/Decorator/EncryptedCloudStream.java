package com.Patterns.Decorator;

public class EncryptedCloudStream implements Stream{

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data){
        return "^@%&&t6832GTR%^&W!@G^637df";
    }
}
