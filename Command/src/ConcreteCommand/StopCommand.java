package ConcreteCommand;

import Receiver.MusicPlayer;

public class StopCommand implements Command{
    private MusicPlayer musicPlayer;
    public StopCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void excute() {
        musicPlayer.stop();
    }
}
