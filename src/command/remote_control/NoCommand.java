package command.remote_control;

class NoCommand implements Command {
    @Override
    public void execute() {} // 아무 일도 하지 않는 커맨드

    @Override
    public void undo() {}
}
