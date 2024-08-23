package behavioral.command;

// Concrete Commands
class StartEngineCommand implements Command {
    private Spacecraft spacecraft;

    public StartEngineCommand(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    @Override
    public void execute() {
        spacecraft.startEngines();
    }

    @Override
    public void undo() {
        spacecraft.stopEngines();
    }
}
