package homework4;

public class 물약 extends 아이템{
	//
	int 초;
	int 회복량=100;
	int 사용가능횟수;
	int 체력포션갯수=0;
	
	//
	static final String 오류="올바르게 입력해 주세요";
	final String 사용불가="지금은 사용할 수 없습니다.";
	
	public 물약(){
	}
	public void 회복(캐릭터 캐릭터){
		final String 회복=" 회복되었다.";
		final String 부족="포션이 없습니다.";
		System.out.println("체력이 "+회복량*(캐릭터.레벨)+회복);
		캐릭터.현재체력+=회복량*캐릭터.레벨;
	}
}
