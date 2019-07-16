package homework4;

public class 듈라한 extends 보스몹 {
	public 듈라한(String 이름, int 레벨, int 공격력, int 방어력, int 현재체력, int 경험치, int 골드){
		super(이름,레벨, 공격력, 방어력, 현재체력, 경험치, 골드);
		레벨=50;
		최대체력=50000;
		방어력=1000;
		공격력=2000;
		경험치=10000;
		골드=10000;
		현재체력+=최대체력;
		이름="듀라한";
		//int 레벨,int 체력,int 방어력,int 공격력,int 경험치, int 골드,String 아이템,String 이름
		//능력치(50,5000,100,200,1000,1000,"","듀라한");
	}
	
	public void 공포(){
		
	}
}
