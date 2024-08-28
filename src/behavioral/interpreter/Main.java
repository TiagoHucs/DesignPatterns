package behavioral.interpreter;

public class Main {
    public static void main(String[] args){
        CommandInterpreter interpreter = new CommandInterpreter();

        interpreter.interpret("Lancar");
        interpreter.interpret("Acelerar");
        interpreter.interpret("Sabotar");
        interpreter.interpret("Abortar");
    }
}
