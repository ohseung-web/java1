package ohseung;

import java.util.*;

public class BurgerMenu extends BurgerShop {

	Scanner scan = new Scanner(System.in);
	public void showMeu() {
		System.out.println("===== ������ġ �ܹ���=====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1) + "." + arMenu[i] + "\t: " + arPrice[i] + "��");
		}
		System.out.println("5.�����ϱ�");
	}
	
	public void select1() { arCount[0] += 1; }
	public void select2() { arCount[1] += 1; }
	public void select3() { arCount[2] += 1; }
	public void select4() { arCount[3] += 1; }
	
	public void getReceipt() {
		
		for(int i=0; i<arMenu.length; i++) {
			total += arPrice[i] * arCount[i];
		}
		System.out.println("�� �ֹ��ݾ� : " + total + "��");
		
		System.out.print("������ �Է��ϼ��� :");
		int price = scan.nextInt();
		
		System.out.println("----------- ������ ------------");
		System.out.println("�� �� ��\t\t����\t�ݾ�");
		System.out.println("-----------------------------");
		for(int i=0; i<arMenu.length; i++) {
		System.out.println((i + 1) + "." + arMenu[i] + "\t " + arCount[i] + "\t"+arPrice[i]);
		}
		System.out.println("-----------------------------");
		System.out.println("�� �� �� �� : \t\t" + total );
		System.out.println("-----------------------------");
		System.out.printf("�� �� �� �� :\t\t %.0f",(total * 0.9));
		System.out.println();
		System.out.printf("��   ��   �� :\t\t %.0f" ,(total*0.1));
		System.out.println();
		System.out.println("��         �� :\t\t"+( price-total));
	}
	
	public void run() {
		while(true) {
			// �޴� ���
			showMeu();
			
			// �޴� ����
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();
			
			// ġ�����
			if(choice == 1) { select1(); }
			// �Ұ�����
			else if(choice == 2) { select2(); }
			// ����Ƣ��
			else if(choice == 3) { select3(); }
			// �ݶ�
			else if(choice == 4) { select4(); }
			// ���� �� ������ ���
			else if(choice == 5) {
				getReceipt();
				break;
			}
		}		
	}
	
}
