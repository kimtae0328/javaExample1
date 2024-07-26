package f_extends.practice.abstractex;

public class App {
    public static <Phone> void main(String[] args){
        // 추상클래스는 직접 생성할수 없음
        // Phone phone = new Phone("홍길동");

        SmartPhone sp = new SmartPhone("홍길동");
        // 생성 할수 없지만 타입으로 이용가능
        // 타입으로 사용할 경우 추상클래스를 상속받아 구현된 객체들이 사용될수 있음
        Phone p = (Phone) new SmartPhone("김길동");
    }

}
