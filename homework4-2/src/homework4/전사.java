package homework4;

import java.util.Scanner;

public class ���� extends ĳ���� {
	int ������2;
	int ��Ÿ��;
	public ����(){
		�̸�="����";
		����+=1;
		�ִ�ü��=����ü��+500;
		���ݷ�+=20;
		����+=20;
		����ü��=�ִ�ü��;
	}
	public int ���罺ų(){
		//���罺ų
		final String ���罺ų="1.������̵� / 2.�ް����̵� / 3.�ŵ�ҿ� / 4.ũ����";
		Scanner sc = new Scanner(System.in);
		System.out.println(���罺ų);
		
		int i = sc.nextInt();
			if(i == 1){
				������2=10+(����+���ݷ�);
			}
			else if(i == 2){
				������2=15+(����+����);				
			}
			else if(i == 3){
				������2=20+(���ݷ�+����ü��*3);
				����ü��-=����ü��*(9/10);
				Thread ��Ÿ�� = new ��Ÿ��();
				��Ÿ��.start();
			}else if(i == 4){
				������2=40+(���ݷ�+�ִ�ü��*5);
				����ü��=1;
				Thread ��Ÿ�� = new ��Ÿ��();
				��Ÿ��.start();
			}
		return ������2;
	}
	public int �ٵ�����(){
		return ������2;
	}
}
