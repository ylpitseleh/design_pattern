package proxy.gumball_machine;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args){
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                             "rmi://boulder.mightygumball.com/gumballmachine",
                             "rmi://austin.mightygumball.com/gumballmachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i=0; i<location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]); // 클라이언트 보조객체 (스텁) - GumballMachineRemote의 구현체
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i< monitor.length; i++) {
            monitor[i].report();
        }
    }
}
