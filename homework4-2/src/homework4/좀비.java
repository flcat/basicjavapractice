package homework4;

public class 좀비 extends 일반몹 {
	//죽여도 랜덤 횟수만큼 부활 독데미지
	public 좀비(String 이름, int 레벨, int 공격력, int 방어력, int 현재체력, int 경험치, int 골드){
		super(이름,레벨, 공격력, 방어력, 현재체력, 경험치, 골드);
		 레벨=5;
		 최대체력=300;
		 방어력=3;
		 공격력=12;
		 경험치=100;
		 골드=80;
		 이름="좀비";
		 현재체력+=최대체력;
		//능력치(5,300,3,12,100,100,"","좀비");
	}
	/*
	public synchronized void 독(캐릭터 캐릭터){
		if(캐릭터.현재체력>=50){
			try{ 
				Thread.sleep(2000);
			}catch(Exception e){
				
			}
			캐릭터.현재체력-=캐릭터.현재체력*(1/10);
		}
	}
	*/
}
