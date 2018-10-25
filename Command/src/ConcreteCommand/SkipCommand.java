package ConcreteCommand;

import Receiver.MusicPlayer;

public class SkipCommand implements Command{
    private MusicPlayer musicPlayer;
    public SkipCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void excute() {
        musicPlayer.skip();
    }
}
