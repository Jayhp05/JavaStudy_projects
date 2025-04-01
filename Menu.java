package report0525;

import java.util.Scanner;

public class Menu {
	
	String[] drinkMenu = {"콜라", "사이다", "환타", "핫식스"};
    int[] stock = {5, 5 , 1, 2};
    int[] price = {1200, 1200, 800, 2000};
	
	public void displayMenu() {
	    
        System.out.println("===================================");
        System.out.println("============음료 자동판매기============");
        for (int cnt = 0; cnt < drinkMenu.length; cnt++) {
            System.out.printf("(%d). %s - (재고: %d) - 가격: %d\n", cnt + 1, drinkMenu[cnt], stock[cnt], price[cnt]);
        }
        System.out.println("===================================");
    }

    public int inputMoney() {
    	Scanner input = new Scanner(System.in);
    	
        System.out.print("\n잔액을 입력하세요: ");
        
        int money = input.nextInt();
        return money;
    }

    public int selectMenu() {
    	Scanner input = new Scanner(System.in);
    	
        System.out.print("메뉴를 선택해주세요: ");
        
        int menu = input.nextInt();
        return menu;
    }
    
    public void giveChange(int money, int neededPrice) {
        int change = money - neededPrice;
        
        System.out.println("거스름돈은 " + change + "원 입니다.");
    }

    public void processSelection(int menu, int money) {
        int selectArr = menu - 1;
        String outDrink = drinkMenu[selectArr];
        int neededPrice = price[selectArr];
        int selectStock = stock[selectArr];

        if (selectStock > 0) {
            if (money >= neededPrice) {
                System.out.println(outDrink + "를 선택하였습니다.\n\n\n");
                giveChange(money, neededPrice);
                stock[selectArr] -= 1;
            }
        }
    }
    
    public boolean checkStock() {
        for (int cnt : stock) {
            if (cnt > 0) {
                return true; // 하나라도 남아있으면 true
            }
        }
        return false; // 모든 재고가 0이면 false
    }
}