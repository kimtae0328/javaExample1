package f_extends.practice.abstractex;

public class SmartPhone extends Phone{

    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰을 실행합니다.");       
    }

}
