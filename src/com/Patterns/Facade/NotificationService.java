package com.Patterns.Facade;

public class NotificationService {

    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authToken = server.authenticate("appID", "key");
        //Message message = new Message("Hello World");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
