package behavioral.interpreter;

class AccelerateCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing: Accelerate Rocket!");
    }
}
