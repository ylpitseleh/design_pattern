package proxy.gumball_machine;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter(); // 동전이 들어올 때 해야할 일
    void ejectQuarter(); // 동전을 반환할 때 해야할 일
    void turnCrank(); // 손잡이가 돌아갔을 때 해야할 일
    void dispense(); // 알맹이를 내보낼 때 해야할 일
}
