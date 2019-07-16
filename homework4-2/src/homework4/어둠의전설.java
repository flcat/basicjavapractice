package homework4;

import java.util.Random;
import java.util.Scanner;

public class 어둠의전설 {
	

public 어둠의전설(){
	
}

public static void main(String[] args) {
		/*
		 if 1
		  던전시작
		 쓰레드생성
		 쓰레드시작 
		  실제전투루프
		 while{
		 }
		*/

		final String 전직완료="로 전직하셨습니다.";
		final String 오류="올바르게 입력해 주세요";
		캐릭터 캐릭터 = new 캐릭터();
		전사 전사 = new 전사();
		도적 도적 = new 도적();
		무도가 무도가 = new 무도가();
		물약 물약 = new 물약();
		Scanner sc = new Scanner(System.in);

		System.out.println("어둠의전설에 오신것을 환영합니다.");
		System.out.println("이름을 선택해주세요.\n"+"1.전사 / 2.도적 / 3.무도가");
		int i = sc.nextInt();
		if(i == 1){	
			캐릭터.이름=전사.겟이름();
			캐릭터.스텟부여(전사,도적,무도가);
			System.out.println(캐릭터.이름+전직완료);
			Thread 체력재생스레드 = new 체력재생(캐릭터);
			체력재생스레드.start();
		//	return 1;
		}
		else if(i == 2){
			캐릭터.이름=도적.겟이름();
			캐릭터.스텟부여(전사,도적,무도가);
			System.out.println(캐릭터.이름+전직완료);
			Thread 체력재생스레드 = new 체력재생(캐릭터);
			체력재생스레드.start();
			//return 2;
		}
		else if(i == 3){
			캐릭터.이름=무도가.겟이름();
			캐릭터.스텟부여(전사,도적,무도가);
			System.out.println(캐릭터.이름+전직완료);
			Thread 체력재생스레드 = new 체력재생(캐릭터);
			체력재생스레드.start();
		//	return 3;
		}
		else{
			System.out.println(오류);
		//	return -1;
		}
	
		
		
		while(true){
			Thread 물약충전 = new 물약충전(물약);
			물약충전.start();	
			final String 메뉴선택 = "1.사냥  / 2.장비변경 / 3.물약상점 / 4.상태창 / 5.종료";	
			System.out.println(메뉴선택);
			int j = sc.nextInt();
			if( j == 1 ){
				Random rd = new Random();
				몬스터 몬스터;
					if(캐릭터.레벨 <= 9){
						int k = rd.nextInt(9)+1;					
						몬스터 = new 몬스터("고블린",k,30,5,200,100+k,30*k);					
						System.out.println(몬스터.레벨+" LV "+몬스터.이름+"이 출현했습니다.");
						System.out.println("고블린이 부메랑을 던졌습니다.");
						if(몬스터.현재체력 > 0){
							Thread 부메랑 = new 부메랑(캐릭터);
							부메랑.start();
						}
						System.out.println(몬스터.이름+" / "+몬스터.레벨+" / "+몬스터.공격력+" / "+몬스터.방어력+" / "+몬스터.현재체력+" / ");
						System.out.println(캐릭터.이름+" / "+캐릭터.레벨+" / "+캐릭터.공격력+" / "+캐릭터.방어력+" / "+캐릭터.현재체력+" / ");	
					}
					else if(캐릭터.레벨 < 19 && 캐릭터.레벨 >= 10){
						int k = rd.nextInt(9)+10;
						몬스터 = new 몬스터("좀비",k,700+k,5*k,3000+k,100+k,30*k);
						System.out.println(몬스터.레벨+" LV "+몬스터.이름+"이 출현했습니다.");
						if(몬스터.현재체력 > 0){
							Thread 독 = new 독(캐릭터);
							독.start();
						}
					}
					else if(캐릭터.레벨 < 25 && 캐릭터.레벨 >= 20){
						int k = rd.nextInt(9)+20;
						몬스터 = new 몬스터("스톤고렘",k,1200+k,5*k,5000+k,100+k,30*k);
						System.out.println(몬스터.레벨+" LV "+몬스터.이름+"이 출현했습니다.");
	
					}
					else if(캐릭터.레벨 < 36 && 캐릭터.레벨 >= 25){
						int k = rd.nextInt(9)+30;
						몬스터 = new 몬스터("러스터데몬",k,1800+k,5*k,50000+k,100+k,30*k);
						System.out.println(몬스터.레벨+" LV "+몬스터.이름+"이 출현했습니다.");
					}
					else if(캐릭터.레벨<=49 && 캐릭터.레벨 >= 36){
						int k = rd.nextInt(9)+40;
						몬스터 = new 몬스터("다크클래릭",k,2700+k,5*k,150000+k,100+k,30*k);
						System.out.println(몬스터.레벨+" LV "+몬스터.이름+"이 출현했습니다.");
					}
					else{	
						몬스터 = new 몬스터("듈라한",52,4520,3000,223200,10000,10000);
						System.out.println(몬스터.레벨+" LV "+몬스터.이름+"이 출현했습니다.");
					}
					
					/*
					if(몬스터.현재체력 <= 0) {
						몬스터.몹죽음();
						캐릭터.경험치획득(몬스터);
						break; 
					}
					else{
					*/
						
							//사냥선택
								//System.out.println(사냥메뉴);
							
							
								while(true){
									if( 몬스터.현재체력 <= 0){
										몬스터.죽음=true;
										몬스터.몹죽음();
										if(몬스터.이름 =="듈라한"){
											System.out.println("당신의 노력으로 마이소시아의 세계에 평화가 찾아왔습니다.");
											System.out.println(" The end");
											System.exit(0);
										}
											
										캐릭터.경험치획득(몬스터);
										캐릭터.레벨업();
										break;
									}else if( 캐릭터.현재체력 <= 0){
										캐릭터.죽음=true;
										System.out.println(몬스터.이름+"에게 사망하셨습니다.");
										System.exit(0);
									}
									System.out.println("1.스킬 / 2.물약 / 3.메뉴로");
									int l = sc.nextInt();
									if(l == 1){
										if(몬스터.현재체력 > 0){
											if(캐릭터.이름==전사.이름 && 캐릭터.현재체력 > 0 ){
													전사.전사스킬();
													몬스터.현재체력-=전사.데미지2+캐릭터.총공격력;
													if(몬스터.현재체력 < 0){
														System.out.println("몹 : 0");
													}
													else {
													System.out.println("몹 : "+Math.abs(몬스터.현재체력));
													}
													몬스터.공격(전사);
													캐릭터.현재체력-=몬스터.공격력;
													if(캐릭터.현재체력 < 0){
														System.out.println("캐릭터 : 0");
													}
													else {
													System.out.println("캐릭 : "+Math.abs(캐릭터.현재체력));
													}
												}
											else if(캐릭터.이름==전사.이름 && 캐릭터.현재체력 <= 0 ){
												System.out.println("죽었습니다.");
												System.exit(0);
											}
											else if(캐릭터.이름==도적.이름 && 캐릭터.현재체력 > 0 && 몬스터.죽음==false){
												도적.도적스킬(캐릭터);
												몬스터.현재체력-=도적.데미지2+캐릭터.총공격력;
												if(몬스터.현재체력 < 0){
													System.out.println("몹 : 0");
												}
												else {
												System.out.println("몹 : "+몬스터.현재체력);
												}
												몬스터.공격(도적);
												캐릭터.현재체력-=몬스터.공격력;
												if(캐릭터.현재체력 < 0){
													System.out.println("캐릭터 : 0");
												}
												else {
												System.out.println("캐릭 : "+캐릭터.현재체력);
												}
											}
											else if(캐릭터.이름==무도가.이름 && 캐릭터.현재체력 > 0){
												무도가.무도가스킬(캐릭터);
												몬스터.현재체력-=무도가.데미지2;
												if(몬스터.현재체력 < 0){
													System.out.println("몹 : 0");
												}
												else {
												System.out.println("몹 : "+몬스터.현재체력);
												}
												몬스터.공격(무도가);
												캐릭터.현재체력-=몬스터.공격력;
												System.out.println("캐릭 : "+캐릭터.현재체력);
											}
										}
										
									}
									else if(l == 2){
										캐릭터 포션먹기 = new 캐릭터();
										if(캐릭터.보유체력포션 > 0 && 캐릭터.현재체력 < 캐릭터.최대체력){
											System.out.println("현재 체력 :"+캐릭터.현재체력);
											물약.회복(캐릭터);
											캐릭터.보유체력포션--;
										}
										else if(캐릭터.현재체력 >= 캐릭터.최대체력){
											System.out.println("체력이 충만합니다.");
											캐릭터.현재체력=캐릭터.최대체력;
										}
										else{
											System.out.println("포션이 없습니다.");
										}
									}
									else if(l == 3){
										break;
									}
									
									else{
										System.out.println(오류);
									}
							}
					}	
							/*
							while(true){
								if(캐릭터.현재체력 > 0){
								캐릭터.공격(몬스터);
								}
								else if(캐릭터.현재체력 <= 0){
									캐릭터.죽음();
									break;
								}
								if(몬스터.현재체력 > 0){
								몬스터.공격(캐릭터);
								}
								else if(몬스터.현재체력 <= 0){
									몬스터.죽음();
									break;
								}
							}
							*/				
					else if( j == 2 ){
							
							System.out.println("무기를 고르세요. 무도가는 착용할 수 없습니다. \n"+"1.아스카론 / 2.앵거바딜");
							int k = sc.nextInt();
							if(k == 1 && 캐릭터.이름 != "무도가"){
								아스카론 아스카론 = new 아스카론();
								캐릭터.무기이름=아스카론.이름;
								캐릭터.총공격력=아스카론.무기공격력;
							}
							else if(k == 2 && 캐릭터.이름 != "무도가"){
								앵거바딜 앵거바딜 = new 앵거바딜();
								캐릭터.무기이름=앵거바딜.이름;
								캐릭터.총공격력=앵거바딜.무기공격력;
							}else if(k == 3){
								캐릭터.무기이름="맨손";
								캐릭터.총공격력=0;
							}
						}
						else if( j == 3 ){
							캐릭터.포션구입(물약);
						}
						else if( j == 4 ){
							System.out.println("직업 : "+캐릭터.이름+" / 레벨 : "+캐릭터.레벨+" / 체력 : "+캐릭터.현재체력+" / 보유골드 : "+캐릭터.골드);
						}
						else if( j == 5 ){
							System.out.println("게임을 종료합니다.");
							System.exit(0);
						}
						else{
							System.out.print(오류);
						}
		}
	}
}


