package behavioral.command;

// Cliente
public class Main {


    public static void main(String[] args) {
        // Receiver
        Spacecraft spacecraft = new Spacecraft();

        // Concrete Commands
        Command startEngines = new StartEngineCommand(spacecraft);
        Command adjustTrajectory = new AdjustTrajectoryCommand(spacecraft);
        Command activateSleepMode = new ActivateSleepModeCommand(spacecraft);

        // Invoker
        MissionControl missionControl = new MissionControl();

        // Executar comandos
        missionControl.setCommand(startEngines);
        missionControl.sendCommand();

        missionControl.setCommand(adjustTrajectory);
        missionControl.sendCommand();

        missionControl.setCommand(activateSleepMode);
        missionControl.sendCommand();

        missionControl.setCommand(startEngines);
        missionControl.undoCommand();

    }
}
