package ex09.practice;

// 인터페이스 선언부
// 생성자를 가질수 없음
// 인터페이스는 객체의 사용방법을 정의한 것이므로 인트턴스, 정적필드 선언이 불가
// 상수만 선언 가능 = 대문자로, 두단어 연결시 _
public interface RemoteControl {


    /*웹브라우저 요청
     -> 웹서버에 요청이 들어오면 요청 URL에 따라 컨트롤러를 실행
     -> Controller 사용자의 요청정보 수집
     -> Service 비지니스로직 (실질적 업무)
        LoginService(인터페이스), LoginServiceImpl(구현체-class)
     -> Mapper(DAO) 데이터베이스 입출력
     */
   
   public int MAX_VOLUME = 10;
   public int MIN_VOLUME = 0;

   public void turnon();
   public void turnoff();
   public void setVolume(int Volume);
     
}
