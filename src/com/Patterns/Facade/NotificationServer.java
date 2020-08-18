package com.Patterns.Facade;

public class NotificationServer {
    //connect() -> Connection
    //authenticate(appID, Key) -> AuthToken
    //send(authToken, message, target)
    //conn.disconnect()

    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String traget){
        System.out.println("Sending a Message");
    }
}
