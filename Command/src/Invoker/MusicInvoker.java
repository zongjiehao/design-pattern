package Invoker;

import ConcreteCommand.Command;

public class MusicInvoker {
    private Command playCommand;
    private Command skipCommand;
    private Command stopCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setSkipCommand(Command skipCommand) {
        this.skipCommand = skipCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }
    public void play(){
        playCommand.excute();
    }
    public void skip(){
        skipCommand.excute();
    }
    public void stop(){
        stopCommand.excute();
    }
}
