package ConcreteCommand;

import Receiver.MusicPlayer;

public class PlayCommand implements Command {
    private MusicPlayer musicPlayer;
    public PlayCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }
    @Override
    public void excute() {
        musicPlayer.play();
    }
}
