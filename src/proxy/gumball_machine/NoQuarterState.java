package proxy.gumball_machine;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L; // UnicastRemoteObject는 Serializable을 구현하므로 serialVersionUID 필드가 필요하다.
    // State 객체가 전송될 때 GumballMachine도 전부 직렬화해서 같이 보내는일은 바람직하지 않다.
    transient GumballMachine gumballMachine; // transient > JVM에서는 이 필드를 직렬화하지 않는다. 하지만 직렬화해서 전송받은 후 이 필드를 호출하면 안 좋은 일이 생길 수 있다.

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }

    public void refill() { }

    public String toString() {
        return "waiting for quarter";
    }
}
