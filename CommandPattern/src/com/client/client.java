package com.client;

import com.caller.switchFunction;
import com.command.Command;

public class client {
    public static void main(String[] args){
        switchFunction sf = new switchFunction();
        Command command;
        command = (Command) XMLUtil.getBean();
        sf.setCommand(command);
        sf.press();
    }
}
