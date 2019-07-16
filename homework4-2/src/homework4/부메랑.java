package homework4;

public class 부메랑 extends Thread {
		캐릭터 캐릭터;
		public 부메랑(캐릭터 캐릭터){
			this.캐릭터 = 캐릭터;
		}
		public void run(){
			try{
				Thread.sleep(5000);
			}catch(Exception e){
			}
			if(캐릭터.현재체력 > 0){
				캐릭터.현재체력-=15;
				System.out.println("되돌아오던 부메랑에 맞았습니다.\n"+"현재체력 : "+캐릭터.현재체력+"\n");
			}else if(캐릭터.현재체력 <= 0 ){
				System.out.println("부메랑에 맞아 죽었습니다");
				System.exit(0);
			}
		}
}
