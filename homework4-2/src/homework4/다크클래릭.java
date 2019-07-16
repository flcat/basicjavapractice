package homework4;

public class 다크클래릭 extends 일반몹 {
	//저주로 능력치저하
	public 다크클래릭(String 이름, int 레벨, int 공격력, int 방어력, int 현재체력, int 경험치, int 골드){
		super(이름,레벨, 공격력, 방어력, 현재체력, 경험치, 골드);
		 레벨=30;
		 최대체력=2000;
		 방어력=30;
		 공격력=40;
		 경험치=400;
		 골드=350;
		 이름="다크클래릭";
		 현재체력+=최대체력;
		//int 레벨,int 체력,int 방어력,int 공격력,int 경험치, int 골드,String 아이템,String 이름
		//능력치(30,2000,30,40,400,350,"","다크클래릭");
	}
}
