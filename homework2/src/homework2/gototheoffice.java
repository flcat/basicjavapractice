package homework2;

import java.util.Random;
import java.util.Scanner;

public class gototheoffice {
	
	public static void main(String[] args) {
		player p = new player();
		wakeup(p);
	}
		public static void wakeup(player p){
		System.out.println("��...�����..");
		Random rd = new Random();
		int i = rd.nextInt(9-7+1)+7;//��� �� ����
		int j = rd.nextInt(59-1+1)+1;//��� �� ����
		int k = rd.nextInt(60-20+1)+20; //�Ƿε� ����
		p.rain= rd.nextBoolean();
		p.fatigue=k;
		p.hour=i;
		p.minute=j;
		if(p.fatigue>=35){
			System.out.println("�� ������ �ǰ��ѵ�..");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("1.����ð� "+p.hour+"�� "+p.minute+"��");
		if (p.hour==7 && p.minute<60 ){
			System.out.println("���� �� �߱� �ƴϸ� �Ͼ��.");
			System.out.println("1. �Ͼ��. 2. 1�ð� �� �ܴ�.");
			int wakeUp= sc.nextInt();
				if(wakeUp==1){
					System.out.println("����������");
				}
				else{
					System.out.println("�׷� ���ݸ� �� ����");
					p.hour=(int) (p.hour+1);
					p.fatigue=p.fatigue-10;
					System.out.println("--------------------");
					System.out.println("�� �ڰ������ ���� �غ��ؾ���..");
				}
		}
				else if(p.hour==8 && p.minute<60){
					System.out.println("�ٷ� �غ��ؾ߰ڴ�.");
		}
				else{
			System.out.println("X �ƴ�");
		}
		bathRoom(p);
		sc.close();
	}
	
	public static void bathRoom(player p){ //��� ����
		System.out.println("�����ұ�?");
		System.out.println("0.���� �Ѵ� / 1. �Ӹ����� ������ / 2. ������ �Ѵ�. / 3. �����ð��� ���� ");
		Scanner sc = new Scanner(System.in);
		int bath = sc.nextInt();
		if(bath==0){
			System.out.println("30�е��� �����ߴ�.");
			p.minute=p.minute+30;
			p.fatigue=p.fatigue-10;
		}else if(bath==1){
			System.out.println("15�е��� �Ӹ����� �����ߴ�.");
			p.minute=p.minute+15;
			p.fatigue=p.fatigue-5;
		}else if(bath==2){
			System.out.println("5�е��� �����ߴ�. �Ӹ����� ���� ������ ������...");
			p.minute=p.minute+5;
		}else if(bath==3){
			System.out.println("�������� �ʴ°� �켱�̴�. ���Ÿ� ��");
			p.minute=p.minute+1;
			p.fatigue=p.fatigue+10;
		}else{
			System.out.println("�����߿� ����ּ���.");
			bathRoom(p);
		}
	breakFast(p);	
	sc.close();
	}
	
	public static void breakFast(player p){
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������?");
		System.out.println("0. ��ħ�� ���� ������ �����ִ� ������ / 1. ���� ��� ���� / 2. �����̶�.. / 3. ���� �ð��� ����");
		int  bf = sc.nextInt();
		if(bf==0){
			System.out.println("30�е��� �Ļ縦 �ߴ�.");
			System.out.println("���� ����ϴ�");
			p.minute=p.minute+30;
			p.fatigue=p.fatigue-30;
		}else if(bf==1){
			System.out.println("15�е��� �Ļ縦 �ߴ�.");
			System.out.println("���� ���̴�");
			p.minute=(int) (p.minute+15);
			p.fatigue=p.fatigue-15;
		}else if(bf==2){
			System.out.println("5�е��� �Ļ�(?)�� �ߴ�.");
			System.out.println("���� ���� ���������� �ȸ��� �� ���� ����.");
			p.minute=(int) (p.minute+5);
			p.fatigue=p.fatigue-5;
		}else if(bf==3){
			System.out.println("���� �ð� ���� ����..�п����� ���׶�׸� �Դ��� �ؾ���..");
		}else{
			System.out.println("���� �߿� ����ּ���.");
			breakFast(p);
		}
		time(p);
		weather(p);
		sc.close();
	}
	public static void weather(player p){
		Random rd = new Random();
		int i= rd.nextInt(4-1+1)+1;
		switch (i) {
		case 1:
			p.season="��";
			break;
		case 2:
			p.season="����";
			break;
		case 3:
			p.season="����";
			break;
		case 4:
			p.season="�ܿ�";
			break;
		}
		
		System.out.println("������ "+"' "+p.season+" '"+" �̴ϱ�...��...�ϱ⿹������ ���� ��������");
		clothes(p);
		
	}
	public static void time(player p){
		if(p.minute>=60){
			p.hour=p.hour+1;
			p.minute= Math.abs(60-p.minute);
		}
	}
	public static void clothes(player p){
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		if(p.season=="�ܿ�"){
			int i = rd.nextInt(10)-10;
			if(i<0){
				System.out.println("���ϱ��̳� �� ���԰� �����߰ڴ�..");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]>=2){
							System.out.println("��� �ױ� ������ ���Դ°� ������ ����. �ٽð���");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("��� �ױ� ������ ���Դ°� ������ ����. �ٽð���");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]>=2){
							System.out.println("��� �ױ� ������ ���Դ°� ������ ����. �ٽð���");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("�߰��� ¥���� ���� ������ �ٽð���");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("���� ���� "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
			else if(i>=0 && i<15){
				System.out.println("�ܿ�ġ�� �� �����ϳ�...");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]==3){
							System.out.println("�����ϴٰ� �ص� �̰� �ƴϴ�. �ٽð���");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("�����ϴٰ� �ص� �̰� �Ƴ�. �ٽð���");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]==3){
							System.out.println("�ƹ��� �����ϴ����� ������ ������ �� ����. �ٽð���");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("�߰��� ¥���� ���� ������ �ٽð���");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("���� ���� "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		}
		else if(p.season=="����"){
			int i = rd.nextInt(20-5+1)-5;
			if(i<15){
				System.out.println("����ġ�� �ҽ��ϳ�");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]==3){
							System.out.println("���� �ɸ� �� ����. �ٽð���");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("������ ������ �� �ƴѰ� ����. �ٽð���");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]==3){
							System.out.println("�������� ����ɷ� �ٽð���");
							p.clothes[2]=sc.nextInt();
						}else if(p.clothes[2]==0){
							System.out.println("�����ε� �е��� �ʹ� �����ΰ� ����. �ٽð���");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("�������� �ɸ� ���� ���� �� ���� �ٽð���");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("���� ���� "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
			else{
				System.out.println("�� �� �����ϳ�");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.pants[j]+" | ");
				}
				p.clothes[0] = sc.nextInt();
				if(p.clothes[0]==3){
					System.out.println("�ƹ��� �� �����ص� �����̾�... �ٽð���");
					p.clothes[0]=sc.nextInt();
				}
				System.out.println("\n");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.top[j]+" | ");
				}
				p.clothes[1] = sc.nextInt();
				if(p.clothes[1]==3){
					System.out.println("������ ������ �� �ƴѰ� ����. �ٽð���");
					p.clothes[1]=sc.nextInt();
				}
				System.out.println("\n");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.coat[j]+" | ");
				}
				p.clothes[2] = sc.nextInt();
				if(p.clothes[2]<2){
					System.out.println("�е��̳� ��Ʈ�� ���� �ʿ� ���� �� ���� �ٽð���");
					p.clothes[2]=sc.nextInt();
				}
				System.out.println("\n");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.shoes[j]+" | ");
				}
				p.clothes[3] = sc.nextInt();
				if(p.clothes[3]==3){
					System.out.println("���� �����ص� �����۴� �Ƴ� �ٽð���");
					p.clothes[3]=sc.nextInt();
				}
				System.out.println("\n");
				System.out.println("���� ���� "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		}
		else if(p.season=="����"){
				System.out.println("�� ���� ���Ƴ� �ʹ� ����.");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]!=3){
							System.out.println("�� ������ �ݹ����̿ܿ� ���������� �ٽð���");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]!=3){
							System.out.println("�� ������ �����̿ܿ� ����������. �ٽð���");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]!=3){
							System.out.println("��Ʈ�� �԰ڴٰ�? �������̾�?");
							p.clothes[2]=3;
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]<2){
							System.out.println("���� ����� ������ �ٽð��°� ������ ����.");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("���� ���� "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		else{
				System.out.println("��ġ��� �ʹ� ���..");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]==3){
							System.out.println("������ ��� ���� �� �־�.. �ٽð���");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("������ �ƴ��ݾ�. �ٽð���");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]==3){
							System.out.println("��� �ױ� ������ ���� ��ġ�°�.. �ٽð���");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("�߰��� ¥���� ���� ������ �ٽð���");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("���� ���� "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		
		if(p.rain==true){
			System.out.println("��...��� �񰡿���...���ì�ܾ߰ڴ�");
			p.minute=p.minute+1;
		}
		System.out.println("���� ���� ����öŸ������.\n");
		sc.close();
		p.minute=p.minute+10;
		subway(p);
	}
	public static void subway(player p){
		for(int i=0;i<=p.station.length;i++){
			System.out.println("�̹� �������� "+p.station[i]+" �� �Դϴ�.");
			p.minute=(int) (p.minute+2);
			if(p.fatigue<40 && p.station[i]=="����"){
				System.out.println("���� �����߰ڴ�.");
				break;
			}
			else if(p.fatigue>=30 && p.station[i]== p.station[30] || p.station[i]== p.station[29]){
				System.out.println("�� ��� ������ ������ �����ƴ�..�ٽ� ���ư��߰ڳ�");
				System.out.println("2 �������̳� �����ļ� 12�� �� �ʾ�����..");
				p.minute=p.minute+12;
				break;
			}
		}
		time(p);
		time(p);
		if(p.hour>=11 && p.minute>=01){
			System.out.println("����ð� "+p.hour+"�� "+p.minute+"��");
			System.out.println("������ �ʰ� ���Ҵ�...");
		}
		else{
			System.out.println("����ð� "+p.hour+"�� "+p.minute+"��");
			System.out.println("���� ������ �����ߴ�");
		}
	}
}