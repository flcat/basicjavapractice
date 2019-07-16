package homework4;

import java.util.Scanner;

public class 캐릭터 extends 유닛 {
	
	//좀비용
	/*
	int 레벨=8;
	int 최대체력=250*8;
	int 공격력=25*8;
	int 방어력=12*8;
	//듈라한용
	*/
	int 레벨=1*50;
	int 최대체력=250*50;
	int 공격력=25*50;
	int 방어력=12*50;
	int 현재체력=최대체력;
	int 누적경험치=0;
	int 총공격력;
	int 골드=10000;
	int 보유체력포션;
	String 무기이름="맨손";
	String 갑옷="셔츠";
	public 캐릭터(){
		
	}
	
	public 캐릭터(String 이름,int 레벨,int 공격력,int 방어력,int 현재체력,int 경험치,int 골드){
		super(이름,30,공격력,방어력,현재체력,경험치,골드);
	}
	

	
	private final String 오류="올바르게 입력해 주세요";
	private final String 사냥성공=" 을/를 잡았습니다.";
	private final String 경험치획득=" 의 경험치와 ";
	private final String 골드획득=" 골드를 획득 했습니다.";
	private final String 없음="몬스터가 없습니다.";

	
	private final String 사냥메뉴="1.공격 / 2.포션먹기 / 3. 도망간다";
	
	


			
	
	public void 스텟부여(전사 전사,도적 도적,무도가 무도가){
		if(이름==전사.이름){
			this.레벨+=전사.겟렙();
			this.최대체력+=전사.겟체력();
			this.공격력+=전사.겟공격력();
			this.방어력+=전사.겟방어력();
			this.현재체력+=최대체력;
		}else if(이름==도적.이름){
			레벨+=도적.겟렙();
			최대체력+=도적.겟체력();
			공격력+=도적.겟공격력();
			방어력+=도적.겟방어력();
			현재체력+=최대체력;
		}else if(이름==무도가.이름){
			레벨+=무도가.겟렙();
			최대체력+=무도가.겟체력();
			공격력+=무도가.겟공격력();
			방어력+=무도가.겟방어력();
			현재체력+=최대체력;
		}else{
			System.out.println(오류);
		}
	}
	public void 경험치획득(몬스터 몬스터){
		if(몬스터.죽음 == true){
			this.경험치+=몬스터.경험치;
			System.out.println(몬스터.경험치+"의 경험치를 획득했습니다.");
		}
	}
	
	public void 레벨업(){
		if(this.경험치 >= this.레벨*20 && this.레벨<=50){
			레벨++;
			System.out.println("레벨이 "+this.레벨+" 로 오르셨습니다.");
			this.현재체력+=this.현재체력*(1/2);
		}
		else if(this.레벨==50){
			System.out.println("레벨이 더이상 오르지 않습니다.");
		}
	}
	
	public void 포션구입(물약 물약){
		System.out.println("보유금액"+this.골드+"\n몇개나 구입하시겠습니까? (개당 100G)");
		System.out.println("구입 가능 포션 갯수 : "+물약.체력포션갯수);
		if( this.골드 >= 100 ){
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			if( 물약.체력포션갯수 < j){
				System.out.println("갯수가 모자랍니다.");
			}
			else if( 물약.체력포션갯수 >= j){
				this.골드 -= j * 100;
				물약.체력포션갯수 -= j;
				보유체력포션 += j;
				System.out.println("보유한 포션 갯수"+보유체력포션);
			}
		}
		else{
			System.out.println("골드가 부족합니다");
		}
	}
		
	public String 겟이름(){
		return 이름;
	}
	public int 겟렙(){
		return 레벨;
	}
	public int 겟체력(){
		return 최대체력;
	}
	public int 겟공격력(){
		return 공격력;
	}
	public int 겟방어력(){
		return 방어력;
	}
}

