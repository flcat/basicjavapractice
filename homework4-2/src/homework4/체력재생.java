package homework4;

public class ü����� extends Thread {
	ĳ���� ĳ����;
	
	public ü�����(ĳ���� ĳ����){
		this.ĳ���� = ĳ����;
	}
	
	public void run(){
		while(true){
		try{
				Thread.sleep(3001);
			}catch(Exception e){
				e.printStackTrace();
			}
		
			if(ĳ����.����ü�� < ĳ����.�ִ�ü��){
				ĳ����.����ü��+=2;
				System.out.println("��+2\n");
			}	
		
		//System.out.println("����ü��: "+this.ĳ����.����ü��);		
	}
	}
	/*
	public static void main(String[] args) {
		ĳ���� ĳ���� = new ĳ����();
		
			for(int i=0;ĳ����.�ִ�ü��>i;i++){
				Thread t = new ü�����();
				t.start();
			}
			System.out.println("ü���� ���� á���ϴ�.");
		}
	*/	
}

