package ex09.practice;

public class Audio implements RemoteControl{

    private Object volume;

    @Override
    public void turnon() {
        System.out.println("오디오를 켭니다");
        
    }

    @Override
    public void turnoff() {
        System.out.println("오디오를 끕니다");
       
    }

    @Override
    public void setVolume(int Volume) {
        this.volume = volume;
        System.out.println("오디오 볼륨 : " + volume);
        
    }

}
