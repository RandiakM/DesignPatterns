package com.Patterns.Bridge;

//Basic Remote Control (turnOn, turnOff)
//Advanced Remote control (setChannel)
//Movie Remote Control (play, pause, rewind)

//RemoteControl
    //SonyRemoteControl
//AdvancedRemoteControl
    //SonyAdvancedRemoteControl

//let's we want to add new tv remote control called Samsung,

//RemoteControl
    //SonyRemoteControl
    //SamsungRemoteControl
//AdvancedRemoteControl
    //SonyAdvancedRemoteControl
    //SamsungAdvancedRemoteControl

//2 types of remote control -> 2 new class
public class RemoteControl {

    protected Device device;  //like a bridge

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }
    public void turnOff(){
        device.turnOff();
    }
}
