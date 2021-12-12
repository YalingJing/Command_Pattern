package com.caller;

import com.command.Command;

public class switchFunction {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press(){
        System.out.println("房间开关键：");
        command.execute();
    }
}
