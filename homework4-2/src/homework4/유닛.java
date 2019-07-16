package homework4;

public class 유닛 {
	int 레벨;
	int 최대체력;
	int 현재체력;
	int 공격력;
	int 방어력;	
	int 경험치;
	int 골드;
	boolean 죽음=false;
	String 이름;
	public 유닛(){
		
	}
	
	public 유닛(String 이름,int 레벨,int 공격력,int 방어력,int 현재체력,int 경험치,int 골드){
		this.이름 = 이름;
		this.레벨 = 레벨;
		this.공격력 = 공격력;
		this.방어력 = 방어력;
		this.현재체력 = 현재체력;
		this.경험치 = 경험치;
		this.골드 = 골드;
	}
	
	public void 공격(유닛 피해대상){
		System.out.println(this.이름+" 이/가 공격을 가합니다.");
		피해대상.받은피해(Math.abs(this.공격력));
	}
	
	public synchronized void 받은피해(int 데미지){
		
		int 받은데미지 = (this.현재체력+this.방어력)-데미지;
		System.out.println(this.이름+" 이/가"+데미지+"의 피해를 입었습니다.");
		
		if(this.현재체력 < 0){
			this.죽음=true;
			System.out.println(this.이름 + ("이/가 사망하였습니다."));
		}
		else{
			this.현재체력 = 현재체력 - 받은데미지;
			this.죽음=false;
		}
	}

	

	/*
	public void 공격(몬스터 몬스터,전사 전사,도적 도적,무도가 무도가){
		if(몬스터.현재체력 > 0){
			if(직업 == 전사.직업){
				전사.전사스킬(this);
				int 받은데미지 =전사.데미지+총공격력-몬스터.방어력;
				몬스터.현재체력 -= 받은데미지;
				System.out.println(받은데미지+" 의 데미지를 입혔습니다.\n"+몬스터.이름+" 체력 : "+몬스터.현재체력);
				몬스터.몹공격(전사);
			}
			else if(직업 == 도적.직업){
				도적.도적스킬(this);
				int 받은데미지 =도적.데미지+총공격력-몬스터.방어력;
				몬스터.현재체력 -= 받은데미지;
				System.out.println(받은데미지+" 의 데미지를 입혔습니다.\n"+몬스터.이름+" 체력 : "+몬스터.현재체력);
				몬스터.몹공격(도적);
			}
			else if (직업 == 무도가.직업){
				무도가.무도가스킬(this);
				int 받은데미지 =무도가.데미지+총공격력-몬스터.방어력;
				몬스터.현재체력 -= 받은데미지;
				System.out.println(받은데미지+" 의 데미지를 입혔습니다.\n"+몬스터.이름+" 체력 : "+몬스터.현재체력);
				몬스터.몹공격(무도가);
			}
			
		}else if(몬스터.현재체력 <= 0){
			this.경험치 += 몬스터.경험치;
			this.골드 += 몬스터.골드;
			System.out.println(몬스터.경험치+경험치획득+몬스터.골드+골드획득);
			레벨업();
		}
		else{
			System.out.println(없음);
		}
	}
	*/
}
