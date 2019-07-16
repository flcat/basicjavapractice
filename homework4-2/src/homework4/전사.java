package homework4;

import java.util.Scanner;

public class 전사 extends 캐릭터 {
	int 데미지2;
	int 쿨타임;
	public 전사(){
		이름="전사";
		레벨+=1;
		최대체력=현재체력+500;
		공격력+=20;
		방어력+=20;
		현재체력=최대체력;
	}
	public int 전사스킬(){
		//전사스킬
		final String 전사스킬="1.윈드블레이드 / 2.메가블레이드 / 3.매드소울 / 4.크래셔";
		Scanner sc = new Scanner(System.in);
		System.out.println(전사스킬);
		
		int i = sc.nextInt();
			if(i == 1){
				데미지2=10+(레벨+공격력);
			}
			else if(i == 2){
				데미지2=15+(레벨+방어력);				
			}
			else if(i == 3){
				데미지2=20+(공격력+현재체력*3);
				현재체력-=현재체력*(9/10);
				Thread 쿨타임 = new 쿨타임();
				쿨타임.start();
			}else if(i == 4){
				데미지2=40+(공격력+최대체력*5);
				현재체력=1;
				Thread 쿨타임 = new 쿨타임();
				쿨타임.start();
			}
		return 데미지2;
	}
	public int 겟데미지(){
		return 데미지2;
	}
}
