package ConcreteCommand;

import java.util.ArrayList;
import java.util.List;

public class MacroMusicCommand implements MacroCommand {
    public static final List<Command> COMMANDS = new ArrayList<>();
    @Override
    public void add(Command command) {
        COMMANDS.add(command);
    }

    @Override
    public void remove(Command command) {
        COMMANDS.remove(command);
    }

    @Override
    public void excute() {
        System.out.println("----回放开始-----");
        COMMANDS.forEach(Command::excute);
        System.out.println("----回放结束-----");
        System.out.println("githubggg");
    }
}
