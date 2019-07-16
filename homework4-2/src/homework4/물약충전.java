package homework4;

public class 물약충전 extends Thread{
		물약 물약;
		public 물약충전(물약 물약){
			this.물약=물약;
		}
		public synchronized void run(){
			try{
				Thread.sleep(5004);
			}catch(Exception e){
			}
			if(물약.체력포션갯수<=10){
				물약.체력포션갯수++;
				System.out.println("상점에 물약이 "+물약.체력포션갯수+"개 들어왔습니다.\n");
			}
			else if(물약.체력포션갯수==10){
				System.out.println("물약 재고가 충분히 찼습니다.");
			}
		}
}
