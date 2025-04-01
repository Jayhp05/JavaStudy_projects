package com.javastudy.project.firsthw;

import java.util.Scanner;

public class Menu {
	
    StockManage m = new StockManage();
    int money;

    // 메뉴 출력
    public void displayMenu() {
        System.out.println("===================================");
        System.out.println("============음료 자동판매기============");
        for (int cnt = 0; cnt < m.getDrinkMenu().length; cnt++) {
            System.out.printf("(%d). %s - (재고: %d) - 가격: %d원\n", cnt + 1, 
                m.getDrinkMenu()[cnt], m.getStock()[cnt], m.getPrice()[cnt]);
        }
        System.out.println("===================================");
    }

    public void inputMoney() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n잔액을 입력하세요: ");
        money = input.nextInt();
    }

    public int selectMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("메뉴를 선택해주세요 (0 입력 시 종료): ");
        return input.nextInt();
    }

    public void giveChange(int neededPrice) {
        money -= neededPrice;
        System.out.println("거스름돈은 " + money + "원 입니다.\n");
    }

    public void processSelection(int selectedMenu) {
        int selectArr = selectedMenu - 1;
        String outDrink = m.getDrinkMenu()[selectArr];
        int neededPrice = m.getPrice()[selectArr];
        int selectStock = m.getStock()[selectArr];

        if (selectStock > 0) {  // 재고 확인
            if (money >= neededPrice) { // 돈이 충분한 경우
                System.out.println(outDrink + "를 선택하였습니다!\n");
                giveChange(neededPrice);
                m.getStock()[selectArr] -= 1;
            } else {
                System.out.println("잔액이 부족하여 구매할 수 없습니다.\n");
            }
        } else {
            System.out.println("해당 음료의 재고가 없습니다. 다른 음료를 선택해주세요.\n");
        }
    }

    // 모든 음료의 재고 확인
    public boolean checkStock() {
        for (int cnt : m.getStock()) {
            if (cnt > 0) {
                return true; // 하나라도 재고가 있으면 true
            }
        }
        return false; // 모든 재고가 0이면 false
    }

    // 메인 자판기 실행 메서드
    public void runVendingMachine() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("자판기 사용을 시작합니다!\n");
        inputMoney();

        if (money < 800) {
            System.out.println("잔액이 부족하여 자판기를 이용할 수 없습니다.");
            return;
        }

        while (money >= 800) {
            displayMenu();
            
            int selectedMenu = selectMenu();
            
            if (selectedMenu == 0) {
                System.out.println("자판기 이용을 종료합니다.");
                break;
            }

            if (selectedMenu > 0 && selectedMenu <= m.getDrinkMenu().length) {
                processSelection(selectedMenu);
            } else {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요.\n");
            }

            if (money < 800 || !checkStock()) {
                System.out.println("잔액이 부족하거나 모든 음료가 품절되었습니다.");
                break;
            }
        }

        System.out.println("최종 남은 잔액: " + money + "원");
        System.out.println("이용해주셔서 감사합니다!");
        input.close();
    }
}
