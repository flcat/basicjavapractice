package homework4;

public class 체력재생 extends Thread {
	캐릭터 캐릭터;
	
	public 체력재생(캐릭터 캐릭터){
		this.캐릭터 = 캐릭터;
	}
	
	public void run(){
		while(true){
		try{
				Thread.sleep(3001);
			}catch(Exception e){
				e.printStackTrace();
			}
		
			if(캐릭터.현재체력 < 캐릭터.최대체력){
				캐릭터.현재체력+=2;
				System.out.println("♥+2\n");
			}	
		
		//System.out.println("현재체력: "+this.캐릭터.현재체력);		
	}
	}
	/*
	public static void main(String[] args) {
		캐릭터 캐릭터 = new 캐릭터();
		
			for(int i=0;캐릭터.최대체력>i;i++){
				Thread t = new 체력재생();
				t.start();
			}
			System.out.println("체력이 가득 찼습니다.");
		}
	*/	
}

