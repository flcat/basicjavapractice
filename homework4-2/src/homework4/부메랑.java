package homework4;

public class �θ޶� extends Thread {
		ĳ���� ĳ����;
		public �θ޶�(ĳ���� ĳ����){
			this.ĳ���� = ĳ����;
		}
		public void run(){
			try{
				Thread.sleep(5000);
			}catch(Exception e){
			}
			if(ĳ����.����ü�� > 0){
				ĳ����.����ü��-=15;
				System.out.println("�ǵ��ƿ��� �θ޶��� �¾ҽ��ϴ�.\n"+"����ü�� : "+ĳ����.����ü��+"\n");
			}else if(ĳ����.����ü�� <= 0 ){
				System.out.println("�θ޶��� �¾� �׾����ϴ�");
				System.exit(0);
			}
		}
}
