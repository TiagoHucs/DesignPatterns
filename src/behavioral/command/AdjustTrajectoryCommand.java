package behavioral.command;

class AdjustTrajectoryCommand implements Command {
    private Spacecraft spacecraft;

    public AdjustTrajectoryCommand(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    @Override
    public void execute() {
        spacecraft.adjustTrajectory();
    }

    @Override
    public void undo() {
        spacecraft.clearTrajectory();
    }
}
