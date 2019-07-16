package homework4;

public class 쿨타임 extends Thread {

	public 쿨타임(){
	}
	public void run(){
		System.out.println("기술의 반동으로 아직 움직일 수 없습니다.");
		try{
			Thread.sleep(5000);
		}catch(Exception e){
		}
		
	}
}
