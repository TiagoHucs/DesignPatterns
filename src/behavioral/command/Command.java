package behavioral.command;

// Command Interface
interface Command {
    void execute();
    void undo();
}