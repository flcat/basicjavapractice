package homework4;

public class 스톤고렘 extends 일반몹 {
	//마법데미지가 반감됨, 일정 확률로 데미지 반사, 내구도가 있다면 내구도 소모가 빠름
	public 스톤고렘(String 이름, int 레벨, int 공격력, int 방어력, int 현재체력, int 경험치, int 골드){
		super(이름,레벨, 공격력, 방어력, 현재체력, 경험치, 골드);
		 레벨=10;
		 최대체력=500;
		 방어력=20;
		 공격력=13;
		 경험치=200;
		 골드=200;
		 이름="스톤고렘";
		 현재체력+=최대체력;
		// 레벨, 체력, 방어력, 공격력, 경험치,  골드,String 아이템,String 이름
		//능력치(10,500,20,13,200,200,"","스톤고렘");
	}
	
	
}
