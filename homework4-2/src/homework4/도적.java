package homework4;

import java.util.Scanner;

public class ���� extends ĳ���� {
	int ������2;
	int ��Ÿ��;
	int ������ݷ�;
	���� ���� = new ����();
	public ����(){
		�̸�="����";
		����+=1;
		�ִ�ü��+=250;
		���ݷ�+=25;
		����+=12;
		����ü��=�ִ�ü��;
		this.������ݷ� = ����.������ݷ�;
	}
	public void ������ų(ĳ���� ĳ����){
	final String ������ų="1.���� / 2.�ϻ�� / 3.��� / 4.����";
	//������ų
	Scanner sc = new Scanner(System.in);
	System.out.println(������ų);
	int i = sc.nextInt();
		if(i == 1){
			������2=13+(ĳ����.����+ĳ����.���ݷ�+����.������ݷ�);
		}
		else if(i == 2){
			������2=18+(ĳ����.���ݷ�+ĳ����.����ü��*2);
			ĳ����.����ü��-=ĳ����.����ü��*(7/10);
		}
		else if(i == 3){
			������2=24+(ĳ����.���ݷ�+ĳ����.����ü��*2+ĳ����.����*2);
			ĳ����.����ü��-=ĳ����.����ü��*(9/10);
			Thread ��Ÿ�� = new ��Ÿ��();
			��Ÿ��.start();
		}
		else if(i == 4){
			������2=30+(ĳ����.���ݷ�+ĳ����.����*12);
			Thread ��Ÿ�� = new ��Ÿ��();
			��Ÿ��.start();
			try {
				��Ÿ��.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
