package ex09.practice;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnon() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnoff() {
        System.out.println("TV를 끕니다.");

    }

    // 인터페이스의 상수를 이용해서 볼륨값을 제한
    @Override
    public void setVolume(int Volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재볼륨");
    }

}
