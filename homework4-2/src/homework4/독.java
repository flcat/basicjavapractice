package homework4;

public class �� extends Thread {
	ĳ���� ĳ����;
	public ��(ĳ���� ĳ����){
		this.ĳ���� = ĳ����;
	}
	public void run(){
	while(true){	
		try{
			Thread.sleep(6002);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(ĳ����.����ü�� > 0){
			ĳ����.����ü��-=(ĳ����.����ü��/10);
			System.out.println("���� ħ�� ������ϴ� ������ ���� �ߵ��Ǿ����ϴ�.\n"+"����ü�� : "+ĳ����.����ü��+"\n");
		}else if(ĳ����.����ü�� <= 0){
			System.out.println("�ߵ����� ����߽��ϴ�.");
			System.exit(0);
		}
	}
	}
}
