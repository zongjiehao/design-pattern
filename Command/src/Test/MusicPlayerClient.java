package Test;

import ConcreteCommand.*;
import Invoker.MusicInvoker;
import Receiver.MusicPlayer;

import java.util.Comparator;


public class MusicPlayerClient {
    public static void main(String[] args) {
        //创建接受者
        MusicPlayer musicPlayer = new MusicPlayer();
        //抽象命令类
        Command playCommand = new PlayCommand(musicPlayer);
        Command skipCommand = new SkipCommand(musicPlayer);
        Command stopCommand = new StopCommand(musicPlayer);
        //创建invoker
/*        MusicInvoker invoker = new MusicInvoker();
        invoker.setPlayCommand(playCommand);
        invoker.setSkipCommand(skipCommand);
        invoker.setStopCommand(stopCommand);
        //测试
        invoker.play();
        invoker.skip();
        invoker.play();
        invoker.stop();
        invoker.skip();*/
        MacroMusicCommand macroMusicCommand = new MacroMusicCommand();
        macroMusicCommand.add(playCommand);
        macroMusicCommand.add(skipCommand);
        macroMusicCommand.add(stopCommand);
        macroMusicCommand.add(skipCommand);

        macroMusicCommand.excute();


    }


}
