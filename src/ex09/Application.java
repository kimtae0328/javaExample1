package ex09;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

import ex09.practice.Audio;
import ex09.practice.RemoteControl;
import ex09.practice.Television;

public class Application {
    public static void main(String[] args) {
        // 인터페이스는 직접생성 불가
        // 구현체를 이용하여 생성하고 타입으로 사용가능
        RemoteControl rc = new Television();
        List list = new ArrayList();
        rc.turnon();
        rc.setVolume(20);
        ;
        rc.turnoff();

        RemoteControl rc1 = new Audio();
        rc1.turnon();
        rc1.setVolume(20);
        ;
        rc1.turnoff();

        List<RemoteControl> list = new ArrayList<RemoteControl>();
        list.add(rc);
        list.add(rc1);

        for (RemoteControl r : list) {
            r.turnon();
            r.setVolume(20);
            r.turnoff();
        }

    }

}
