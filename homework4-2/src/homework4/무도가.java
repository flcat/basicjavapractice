package homework4;

import java.util.Scanner;

public class 무도가 extends 캐릭터 {
	int 데미지2;
	int 쿨타임;
	int 무기공격력;
	public 무도가(){
		이름="무도가";
		레벨+=1;
		최대체력+=380;
		공격력+=22;
		방어력+=17;
		현재체력=최대체력;
	}
	public void 무도가스킬(캐릭터 캐릭터){
		//무도가스킬
		final String 무도가스킬="1.선풍각 / 2.달마신공 / 3.구양신공 / 4.다라밀공";
		Scanner sc = new Scanner(System.in);
		System.out.println(무도가스킬);
		int i = sc.nextInt();
			if(i == 1){
				데미지2=12+(캐릭터.공격력+캐릭터.방어력);
			}
			else if(i == 2){
				데미지2=15+((캐릭터.공격력+캐릭터.최대체력*2));
				캐릭터.현재체력-=캐릭터.현재체력*(2/3);
			}
			else if(i == 3){
				데미지2=18+((캐릭터.공격력+캐릭터.최대체력*3));
				캐릭터.현재체력-=캐릭터.현재체력*(9/10);
				Thread 쿨타임 = new 쿨타임();
				쿨타임.start();
			}
			else if(i == 4){
				데미지2=30+((캐릭터.공격력+캐릭터.최대체력*5));
				캐릭터.현재체력=1;
				Thread 쿨타임 = new 쿨타임();
				쿨타임.start();
			}
		}
}

