package ohseung;

import java.util.*;

public class BurgerMenu extends BurgerShop {

	Scanner scan = new Scanner(System.in);
	public void showMeu() {
		System.out.println("===== 맘츠터치 햄버거=====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1) + "." + arMenu[i] + "\t: " + arPrice[i] + "원");
		}
		System.out.println("5.종료하기");
	}
	
	public void select1() { arCount[0] += 1; }
	public void select2() { arCount[1] += 1; }
	public void select3() { arCount[2] += 1; }
	public void select4() { arCount[3] += 1; }
	
	public void getReceipt() {
		
		for(int i=0; i<arMenu.length; i++) {
			total += arPrice[i] * arCount[i];
		}
		System.out.println("총 주문금액 : " + total + "원");
		
		System.out.print("현금을 입력하세요 :");
		int price = scan.nextInt();
		
		System.out.println("----------- 영수증 ------------");
		System.out.println("메 뉴 명\t\t수량\t금액");
		System.out.println("-----------------------------");
		for(int i=0; i<arMenu.length; i++) {
		System.out.println((i + 1) + "." + arMenu[i] + "\t " + arCount[i] + "\t"+arPrice[i]);
		}
		System.out.println("-----------------------------");
		System.out.println("주 문 총 액 : \t\t" + total );
		System.out.println("-----------------------------");
		System.out.printf("공 급 가 액 :\t\t %.0f",(total * 0.9));
		System.out.println();
		System.out.printf("부   가   세 :\t\t %.0f" ,(total*0.1));
		System.out.println();
		System.out.println("잔         액 :\t\t"+( price-total));
	}
	
	public void run() {
		while(true) {
			// 메뉴 출력
			showMeu();
			
			// 메뉴 선택
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			
			// 치즈버거
			if(choice == 1) { select1(); }
			// 불고기버거
			else if(choice == 2) { select2(); }
			// 감자튀김
			else if(choice == 3) { select3(); }
			// 콜라
			else if(choice == 4) { select4(); }
			// 종료 및 영수증 출력
			else if(choice == 5) {
				getReceipt();
				break;
			}
		}		
	}
	
}
