package com.Patterns.Decorator;

public class Main {
    public static void main(String[] args) {
//        CloudStream cloudStream = new CloudStream();
//        cloudStream.write("Here's some data");

//        EncryptedCloudStream encryptedCloudStream = new EncryptedCloudStream();
//        cloudStream.write("Here's some data");

        storeCreditCard(new CloudStream());

        storeCreditCard(new EncryptedCloudStream(new CloudStream()));

        storeCreditCard(new CompressedCloudStream((new CloudStream())));

        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream((new CloudStream()))));


    }

    public static void storeCreditCard(Stream stream){
        stream.write("1111-1111-1111-1111");
    }
}
