package homework4;

import java.util.Scanner;

public class ĳ���� extends ���� {
	
	//�����
	/*
	int ����=8;
	int �ִ�ü��=250*8;
	int ���ݷ�=25*8;
	int ����=12*8;
	//����ѿ�
	*/
	int ����=1*50;
	int �ִ�ü��=250*50;
	int ���ݷ�=25*50;
	int ����=12*50;
	int ����ü��=�ִ�ü��;
	int ��������ġ=0;
	int �Ѱ��ݷ�;
	int ���=10000;
	int ����ü������;
	String �����̸�="�Ǽ�";
	String ����="����";
	public ĳ����(){
		
	}
	
	public ĳ����(String �̸�,int ����,int ���ݷ�,int ����,int ����ü��,int ����ġ,int ���){
		super(�̸�,30,���ݷ�,����,����ü��,����ġ,���);
	}
	

	
	private final String ����="�ùٸ��� �Է��� �ּ���";
	private final String ��ɼ���=" ��/�� ��ҽ��ϴ�.";
	private final String ����ġȹ��=" �� ����ġ�� ";
	private final String ���ȹ��=" ��带 ȹ�� �߽��ϴ�.";
	private final String ����="���Ͱ� �����ϴ�.";

	
	private final String ��ɸ޴�="1.���� / 2.���ǸԱ� / 3. ��������";
	
	


			
	
	public void ���ݺο�(���� ����,���� ����,������ ������){
		if(�̸�==����.�̸�){
			this.����+=����.�ٷ�();
			this.�ִ�ü��+=����.��ü��();
			this.���ݷ�+=����.�ٰ��ݷ�();
			this.����+=����.�ٹ���();
			this.����ü��+=�ִ�ü��;
		}else if(�̸�==����.�̸�){
			����+=����.�ٷ�();
			�ִ�ü��+=����.��ü��();
			���ݷ�+=����.�ٰ��ݷ�();
			����+=����.�ٹ���();
			����ü��+=�ִ�ü��;
		}else if(�̸�==������.�̸�){
			����+=������.�ٷ�();
			�ִ�ü��+=������.��ü��();
			���ݷ�+=������.�ٰ��ݷ�();
			����+=������.�ٹ���();
			����ü��+=�ִ�ü��;
		}else{
			System.out.println(����);
		}
	}
	public void ����ġȹ��(���� ����){
		if(����.���� == true){
			this.����ġ+=����.����ġ;
			System.out.println(����.����ġ+"�� ����ġ�� ȹ���߽��ϴ�.");
		}
	}
	
	public void ������(){
		if(this.����ġ >= this.����*20 && this.����<=50){
			����++;
			System.out.println("������ "+this.����+" �� �����̽��ϴ�.");
			this.����ü��+=this.����ü��*(1/2);
		}
		else if(this.����==50){
			System.out.println("������ ���̻� ������ �ʽ��ϴ�.");
		}
	}
	
	public void ���Ǳ���(���� ����){
		System.out.println("�����ݾ�"+this.���+"\n��� �����Ͻðڽ��ϱ�? (���� 100G)");
		System.out.println("���� ���� ���� ���� : "+����.ü�����ǰ���);
		if( this.��� >= 100 ){
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			if( ����.ü�����ǰ��� < j){
				System.out.println("������ ���ڶ��ϴ�.");
			}
			else if( ����.ü�����ǰ��� >= j){
				this.��� -= j * 100;
				����.ü�����ǰ��� -= j;
				����ü������ += j;
				System.out.println("������ ���� ����"+����ü������);
			}
		}
		else{
			System.out.println("��尡 �����մϴ�");
		}
	}
		
	public String ���̸�(){
		return �̸�;
	}
	public int �ٷ�(){
		return ����;
	}
	public int ��ü��(){
		return �ִ�ü��;
	}
	public int �ٰ��ݷ�(){
		return ���ݷ�;
	}
	public int �ٹ���(){
		return ����;
	}
}

