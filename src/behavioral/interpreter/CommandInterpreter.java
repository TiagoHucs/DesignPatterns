package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

class CommandInterpreter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    Map<String, Command> commands = new HashMap<>();

    CommandInterpreter(){
        commands.put("Lancar",new LaunchCommand());
        commands.put("Acelerar",new AccelerateCommand());
        commands.put("Abortar",new AbortCommand());
    }

    void interpret(String strCommand){
        Command command = commands.get(strCommand);

        if(command !=null){
            command.execute();
        } else {
            System.out.println(ANSI_RED + "Command '"+strCommand+"' not found" + ANSI_RESET);
        }
    }
}
