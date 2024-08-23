package behavioral.command;

class ActivateSleepModeCommand implements Command {
    private Spacecraft spacecraft;

    public ActivateSleepModeCommand(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    @Override
    public void execute() {
        spacecraft.activateSleepMode();
    }

    @Override
    public void undo() {
        spacecraft.deactivateSleepMode();
    }

}
