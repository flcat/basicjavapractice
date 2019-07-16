package homework4;

import java.util.Scanner;

public class 도적 extends 캐릭터 {
	int 데미지2;
	int 쿨타임;
	int 무기공격력;
	무기 무기 = new 무기();
	public 도적(){
		이름="도적";
		레벨+=1;
		최대체력+=250;
		공격력+=25;
		방어력+=12;
		현재체력=최대체력;
		this.무기공격력 = 무기.무기공격력;
	}
	public void 도적스킬(캐릭터 캐릭터){
	final String 도적스킬="1.습격 / 2.암살격 / 3.기습 / 4.저격";
	//도적스킬
	Scanner sc = new Scanner(System.in);
	System.out.println(도적스킬);
	int i = sc.nextInt();
		if(i == 1){
			데미지2=13+(캐릭터.레벨+캐릭터.공격력+무기.무기공격력);
		}
		else if(i == 2){
			데미지2=18+(캐릭터.공격력+캐릭터.현재체력*2);
			캐릭터.현재체력-=캐릭터.현재체력*(7/10);
		}
		else if(i == 3){
			데미지2=24+(캐릭터.공격력+캐릭터.현재체력*2+캐릭터.레벨*2);
			캐릭터.현재체력-=캐릭터.현재체력*(9/10);
			Thread 쿨타임 = new 쿨타임();
			쿨타임.start();
		}
		else if(i == 4){
			데미지2=30+(캐릭터.공격력+캐릭터.레벨*12);
			Thread 쿨타임 = new 쿨타임();
			쿨타임.start();
			try {
				쿨타임.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
