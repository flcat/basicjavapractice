package homework4;

public class 몬스터 extends 유닛{
	
	boolean 몹출현;
	public 몬스터(String 이름,int 레벨,int 공격력,int 방어력,int 현재체력,int 경험치,int 골드){
		super(이름,레벨,공격력,방어력,현재체력,경험치,골드);
	}
	public boolean 몹죽음(){
		if(this.죽음=true){
			return true;
		}
		else{
			return false;
		}
	}
	public synchronized void 스킬피해(int 데미지){
		int 받은데미지 = (this.현재체력+this.방어력)-데미지;
		System.out.println(this.이름+" 이/가"+Math.abs(데미지)+"의 피해를 입었습니다.");		
		System.out.println("현재체력 :"+ Math.abs(this.현재체력));
		
		if(this.현재체력 <= 0){
			this.죽음=true;
			System.out.println(this.이름 + ("이/가 사망하였습니다."));
		}
		else{
			this.현재체력 = 현재체력 - 받은데미지;
			this.죽음=false;
		}
	}
	/*
	public void 몹공격(캐릭터 캐릭터){
		int 받은데미지=this.공격력-캐릭터.방어력;
		캐릭터.현재체력=캐릭터.현재체력-받은데미지;
		System.out.println("현재체력 : "+캐릭터.현재체력);
		System.out.println(이름+"이/가 공격했다." + Math.abs(받은데미지) +"의 데미지를 입었다.");
		if(캐릭터.현재체력 > 0){
			System.out.println("현재체력 : "+캐릭터.현재체력);
		}
		else{
			System.out.println(이름+"에게 사망하셨습니다.");
			System.exit(0);
		}
	}
	*/
	
	/*몹 스킬
	public void 마레노(){
		StringBuffer str = new StringBuffer();
		str.append("이/가 마레노를 시전했다.");
		
	}
	*/
	/*
	public void 몹출현(){
		
		Random rd = new Random();
		int i = rd.nextInt(20);	
		if(레벨 <= 5){
			고블린 고블린 = new 고블린(이름,레벨,공격력,방어력,현재체력,경험치,골드);

		}else if(레벨 <= 12){
			좀비 좀비 = new 좀비(이름,레벨,공격력,방어력,현재체력,경험치,골드);
		}
			
		}else if(레벨<=21){
			다크클래릭 다크클래릭 = new 다크클래릭();
			이름=다크클래릭.이름;
			레벨=i;
			현재체력=다크클래릭.현재체력+i;
			공격력=다크클래릭.공격력+i;
			방어력=다크클래릭.방어력+i;
			경험치=다크클래릭.경험치+i;
			골드=다크클래릭.골드+i;
		}else if(레벨<=33){
			스톤고렘 스톤고렘 = new 스톤고렘();
			이름=스톤고렘.이름;
			레벨=i;
			현재체력=스톤고렘.현재체력+i;
			공격력=스톤고렘.공격력+i;
			방어력=스톤고렘.방어력+i;
			경험치=스톤고렘.경험치+i;
			골드=스톤고렘.골드+i;
		}else if(레벨<=45){
			러스터데몬 러스터데몬 = new 러스터데몬();
			이름=러스터데몬.이름;
			레벨=i;
			현재체력=러스터데몬.현재체력+i;
			공격력=러스터데몬.공격력+i;
			방어력=러스터데몬.방어력+i;
			경험치=러스터데몬.경험치+i;
			골드=러스터데몬.골드+i;
		}
		*/
	public void 부활한다(){
		
		this.죽음 = false;
		
	}
}
