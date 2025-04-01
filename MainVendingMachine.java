package report0525;

import java.util.Scanner;

public class MainVendingMachine {
    
    public static void main(String[] args) {
    	
        Menu fcn = new Menu(); // fcn => function 약자
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("자판기 사용을 시작합니다!");
        
        int money = fcn.inputMoney(); // 사용자에게 돈 입력받기
        
        if (money < 800) {
        	System.out.println("잔액이 부족하여 자판기를 이용하실 수 없습니다.");
        }
        
        while (money >= 800) { // 최소 가격인 800원보다 많을 경우 반복
            fcn.displayMenu(); // 메뉴 출력
            
            System.out.print("메뉴를 선택해주세요 (0 입력 시 종료): ");
            int menu = input.nextInt();
            
            if (menu > 0 && menu <= fcn.drinkMenu.length) {
                int neededPrice = fcn.price[menu - 1];

                if (money >= neededPrice && fcn.stock[menu - 1] > 0) {
                    fcn.processSelection(menu, money);
                    money -= neededPrice; // 잔액 차감
                } 
                else if (money < neededPrice) {
                    System.out.println("잔액이 부족하여 선택하실 수 없습니다.");
                    System.out.println("남은 잔액: " + money + "원\n\n\n");
                    
                } 
                else {
                	System.out.println("해당 음료의 재고가 없습니다. 다른 음료를 선택해주세요.\n\n\n");
                }
            } 
            else {
                System.out.println("판매기 메뉴에 없는 선택번호입니다.\n\n\n");
            }
            
            // 남은 잔액이 최소 가격보다 낮거나 재고가 없을 시 종료
            if (money < 800 || !fcn.checkStock()) {
                System.out.println("자판기 이용을 종료합니다.");
                break;
            }
        }
        
        System.out.println("최종 남은 잔액: " + money + "원");
        System.out.println("이용해주셔서 감사합니다!");
        input.close(); // 스캐너 닫기
    }
}
