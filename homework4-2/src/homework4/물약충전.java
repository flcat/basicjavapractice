package homework4;

public class �������� extends Thread{
		���� ����;
		public ��������(���� ����){
			this.����=����;
		}
		public synchronized void run(){
			try{
				Thread.sleep(5004);
			}catch(Exception e){
			}
			if(����.ü�����ǰ���<=10){
				����.ü�����ǰ���++;
				System.out.println("������ ������ "+����.ü�����ǰ���+"�� ���Խ��ϴ�.\n");
			}
			else if(����.ü�����ǰ���==10){
				System.out.println("���� ��� ����� á���ϴ�.");
			}
		}
}
