package behavioral.interpreter;

public class Main {
    public static void main(String[] args){
        CommandInterpreter interpreter = new CommandInterpreter();

        interpreter.interpret("Launch");
        interpreter.interpret("Accelerate");
        interpreter.interpret("Sabotage");
        interpreter.interpret("Abort");
    }
}
