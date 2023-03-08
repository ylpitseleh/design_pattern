package command.remote_control;

public interface Command {
    void execute();
    void undo();
}
