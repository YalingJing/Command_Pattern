package com.command;

import com.recipient.LightOpenClass;

public class LightCommand extends Command{
    private LightOpenClass lightOpenClass;

    public LightCommand() {
        lightOpenClass = new LightOpenClass();
    }

    @Override
    public void execute() {
        lightOpenClass.openLight();
    }
}

