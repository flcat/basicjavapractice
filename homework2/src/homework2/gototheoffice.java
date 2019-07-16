package homework2;

import java.util.Random;
import java.util.Scanner;

public class gototheoffice {
	
	public static void main(String[] args) {
		player p = new player();
		wakeup(p);
	}
		public static void wakeup(player p){
		System.out.println("어...몇시지..");
		Random rd = new Random();
		int i = rd.nextInt(9-7+1)+7;//기상 시 랜덤
		int j = rd.nextInt(59-1+1)+1;//기상 분 랜덤
		int k = rd.nextInt(60-20+1)+20; //피로도 랜덤
		p.rain= rd.nextBoolean();
		p.fatigue=k;
		p.hour=i;
		p.minute=j;
		if(p.fatigue>=35){
			System.out.println("아 오늘은 피곤한데..");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("1.현재시간 "+p.hour+"시 "+p.minute+"분");
		if (p.hour==7 && p.minute<60 ){
			System.out.println("조금 더 잘까 아니면 일어날까.");
			System.out.println("1. 일어난다. 2. 1시간 더 잔다.");
			int wakeUp= sc.nextInt();
				if(wakeUp==1){
					System.out.println("씻으러가자");
				}
				else{
					System.out.println("그래 조금만 더 자자");
					p.hour=(int) (p.hour+1);
					p.fatigue=p.fatigue-10;
					System.out.println("--------------------");
					System.out.println("더 자고싶지만 이제 준비해야지..");
				}
		}
				else if(p.hour==8 && p.minute<60){
					System.out.println("바로 준비해야겠다.");
		}
				else{
			System.out.println("X 됐다");
		}
		bathRoom(p);
		sc.close();
	}
	
	public static void bathRoom(player p){ //목욕 선택
		System.out.println("샤워할까?");
		System.out.println("0.샤워 한다 / 1. 머리감고 세수만 / 2. 세수만 한다. / 3. 씻을시간도 없어 ");
		Scanner sc = new Scanner(System.in);
		int bath = sc.nextInt();
		if(bath==0){
			System.out.println("30분동안 샤워했다.");
			p.minute=p.minute+30;
			p.fatigue=p.fatigue-10;
		}else if(bath==1){
			System.out.println("15분동안 머리감고 세수했다.");
			p.minute=p.minute+15;
			p.fatigue=p.fatigue-5;
		}else if(bath==2){
			System.out.println("5분동안 세수했다. 머리에선 조금 냄새가 날지도...");
			p.minute=p.minute+5;
		}else if(bath==3){
			System.out.println("지각하지 않는게 우선이다. 눈꼽만 떼");
			p.minute=p.minute+1;
			p.fatigue=p.fatigue+10;
		}else{
			System.out.println("보기중에 골라주세요.");
			bathRoom(p);
		}
	breakFast(p);	
	sc.close();
	}
	
	public static void breakFast(player p){
		Scanner sc = new Scanner(System.in);
		System.out.println("뭘 먹을까?");
		System.out.println("0. 아침엔 역시 엄마가 차려주는 밥이지 / 1. 대충 라면 먹자 / 2. 선식이라도.. / 3. 먹을 시간이 없어");
		int  bf = sc.nextInt();
		if(bf==0){
			System.out.println("30분동안 식사를 했다.");
			System.out.println("역시 든든하다");
			p.minute=p.minute+30;
			p.fatigue=p.fatigue-30;
		}else if(bf==1){
			System.out.println("15분동안 식사를 했다.");
			System.out.println("허기는 가셨다");
			p.minute=(int) (p.minute+15);
			p.fatigue=p.fatigue-15;
		}else if(bf==2){
			System.out.println("5분동안 식사(?)를 했다.");
			System.out.println("물만 마신 느낌이지만 안먹은 것 보단 낫다.");
			p.minute=(int) (p.minute+5);
			p.fatigue=p.fatigue-5;
		}else if(bf==3){
			System.out.println("먹을 시간 따윈 없다..학원에서 누네띠네를 먹던가 해야지..");
		}else{
			System.out.println("보기 중에 골라주세요.");
			breakFast(p);
		}
		time(p);
		weather(p);
		sc.close();
	}
	public static void weather(player p){
		Random rd = new Random();
		int i= rd.nextInt(4-1+1)+1;
		switch (i) {
		case 1:
			p.season="봄";
			break;
		case 2:
			p.season="여름";
			break;
		case 3:
			p.season="가을";
			break;
		case 4:
			p.season="겨울";
			break;
		}
		
		System.out.println("지금이 "+"' "+p.season+" '"+" 이니까...음...일기예보에서 오늘 몇도라고했지");
		clothes(p);
		
	}
	public static void time(player p){
		if(p.minute>=60){
			p.hour=p.hour+1;
			p.minute= Math.abs(60-p.minute);
		}
	}
	public static void clothes(player p){
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		if(p.season=="겨울"){
			int i = rd.nextInt(10)-10;
			if(i<0){
				System.out.println("영하권이네 꽉 껴입고 나가야겠다..");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]>=2){
							System.out.println("얼어 죽기 싫으면 안입는게 좋을거 같다. 다시고르자");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("얼어 죽기 싫으면 안입는게 좋을거 같다. 다시고르자");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]>=2){
							System.out.println("얼어 죽기 싫으면 안입는게 좋을거 같다. 다시고르자");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("발가락 짜르고 싶지 않으면 다시고르자");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("좋아 옷은 "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
			else if(i>=0 && i<15){
				System.out.println("겨울치곤 좀 따뜻하네...");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]==3){
							System.out.println("따뜻하다고 해도 이건 아니다. 다시고르자");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("따뜻하다고 해도 이건 아냐. 다시고르자");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]==3){
							System.out.println("아무리 따뜻하다지만 외투를 안입을 순 없지. 다시고르자");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("발가락 짜르고 싶지 않으면 다시고르자");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("좋아 옷은 "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		}
		else if(p.season=="가을"){
			int i = rd.nextInt(20-5+1)-5;
			if(i<15){
				System.out.println("가을치곤 쌀쌀하네");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]==3){
							System.out.println("감기 걸릴 것 같다. 다시고르자");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("가을에 반팔은 좀 아닌거 같아. 다시고르자");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]==3){
							System.out.println("안입으면 감기걸려 다시고르자");
							p.clothes[2]=sc.nextInt();
						}else if(p.clothes[2]==0){
							System.out.println("가을인데 패딩은 너무 오바인거 같다. 다시고르자");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("수족냉증 걸릴 수도 있을 것 같다 다시고르자");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("좋아 옷은 "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
			else{
				System.out.println("아 날 따뜻하네");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.pants[j]+" | ");
				}
				p.clothes[0] = sc.nextInt();
				if(p.clothes[0]==3){
					System.out.println("아무리 날 따뜻해도 가을이야... 다시고르자");
					p.clothes[0]=sc.nextInt();
				}
				System.out.println("\n");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.top[j]+" | ");
				}
				p.clothes[1] = sc.nextInt();
				if(p.clothes[1]==3){
					System.out.println("가을에 반팔은 좀 아닌거 같아. 다시고르자");
					p.clothes[1]=sc.nextInt();
				}
				System.out.println("\n");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.coat[j]+" | ");
				}
				p.clothes[2] = sc.nextInt();
				if(p.clothes[2]<2){
					System.out.println("패딩이나 코트는 굳이 필요 없을 것 같아 다시고르자");
					p.clothes[2]=sc.nextInt();
				}
				System.out.println("\n");
				for(int j=0;j<=3;j++){
					System.out.print(j+" : "+p.shoes[j]+" | ");
				}
				p.clothes[3] = sc.nextInt();
				if(p.clothes[3]==3){
					System.out.println("날이 따뜻해도 슬리퍼는 아냐 다시고르자");
					p.clothes[3]=sc.nextInt();
				}
				System.out.println("\n");
				System.out.println("좋아 옷은 "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		}
		else if(p.season=="여름"){
				System.out.println("와 날씨 미쳤네 너무 덥다.");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]!=3){
							System.out.println("이 날씨에 반바지이외엔 쪄죽을꺼야 다시고르자");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]!=3){
							System.out.println("이 날씨에 반팔이외엔 쪄죽을꺼야. 다시고르자");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]!=3){
							System.out.println("코트를 입겠다고? 재정신이야?");
							p.clothes[2]=3;
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]<2){
							System.out.println("무좀 생기기 싫으면 다시고르는게 좋을것 같아.");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("좋아 옷은 "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		else{
				System.out.println("봄치고는 너무 춥다..");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.pants[j]+" | ");
						}
						p.clothes[0] = sc.nextInt();
						if(p.clothes[0]==3){
							System.out.println("봄에도 얼어 죽을 수 있어.. 다시고르자");
							p.clothes[0]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.top[j]+" | ");
						}
						p.clothes[1] = sc.nextInt();
						if(p.clothes[1]==3){
							System.out.println("반팔은 아니잖아. 다시고르자");
							p.clothes[1]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.coat[j]+" | ");
						}
						p.clothes[2] = sc.nextInt();
						if(p.clothes[2]==3){
							System.out.println("얼어 죽기 싫으면 뭐라도 걸치는게.. 다시고르자");
							p.clothes[2]=sc.nextInt();
						}
						System.out.println("\n");
						for(int j=0;j<=3;j++){
							System.out.print(j+" : "+p.shoes[j]+" | ");
						}
						p.clothes[3] = sc.nextInt();
						if(p.clothes[3]==3){
							System.out.println("발가락 짜르고 싶지 않으면 다시고르자");
							p.clothes[3]=sc.nextInt();
						}
						System.out.println("\n");
						System.out.println("좋아 옷은 "+" : "+p.pants[p.clothes[0]]+" | "+p.top[p.clothes[1]]+" | "+p.coat[p.clothes[2]]+" | "+p.shoes[p.clothes[3]]);
			}
		
		if(p.rain==true){
			System.out.println("어...잠깐 비가오네...우산챙겨야겠다");
			p.minute=p.minute+1;
		}
		System.out.println("좋아 이제 지하철타러가자.\n");
		sc.close();
		p.minute=p.minute+10;
		subway(p);
	}
	public static void subway(player p){
		for(int i=0;i<=p.station.length;i++){
			System.out.println("이번 정류장은 "+p.station[i]+" 역 입니다.");
			p.minute=(int) (p.minute+2);
			if(p.fatigue<40 && p.station[i]=="남성"){
				System.out.println("이제 내려야겠다.");
				break;
			}
			else if(p.fatigue>=30 && p.station[i]== p.station[30] || p.station[i]== p.station[29]){
				System.out.println("헉 잠깐 졸은거 같은데 지나쳤다..다시 돌아가야겠네");
				System.out.println("2 정거장이나 지나쳐서 12분 더 늦어졌다..");
				p.minute=p.minute+12;
				break;
			}
		}
		time(p);
		time(p);
		if(p.hour>=11 && p.minute>=01){
			System.out.println("현재시간 "+p.hour+"시 "+p.minute+"분");
			System.out.println("수업에 늦고 말았다...");
		}
		else{
			System.out.println("현재시간 "+p.hour+"시 "+p.minute+"분");
			System.out.println("좋아 무사히 도착했다");
		}
	}
}