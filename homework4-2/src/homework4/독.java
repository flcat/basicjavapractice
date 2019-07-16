package homework4;

public class 독 extends Thread {
	캐릭터 캐릭터;
	public 독(캐릭터 캐릭터){
		this.캐릭터 = 캐릭터;
	}
	public void run(){
	while(true){	
		try{
			Thread.sleep(6002);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(캐릭터.현재체력 > 0){
			캐릭터.현재체력-=(캐릭터.현재체력/10);
			System.out.println("좀비가 침을 뱉었습니다 좀비의 독에 중독되었습니다.\n"+"현재체력 : "+캐릭터.현재체력+"\n");
		}else if(캐릭터.현재체력 <= 0){
			System.out.println("중독으로 사망했습니다.");
			System.exit(0);
		}
	}
	}
}
