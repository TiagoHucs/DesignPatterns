package behavioral.command;

// Invoker - Controle da Agência Espacial
class MissionControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sendCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }
}
