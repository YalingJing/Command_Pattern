package com.command;

import com.recipient.FanOpenClass;

public class FanCommand extends Command {
    private FanOpenClass fanOpenClass;

    public FanCommand(){
        fanOpenClass = new FanOpenClass();
    }

    @Override
    public void execute() {
        fanOpenClass.openFan();
    }
}
