package behavioral.interpreter;

class AbortCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing: Abort Mission!");
    }
}
