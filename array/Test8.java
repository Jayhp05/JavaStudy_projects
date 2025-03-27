package com.javastudy.ch03.array;

public class Test8 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
        String[] str1 = { "서울지역", "중부지역", "남부지역", "태백지역" };
        
        String[][] str2 = {
        					{ "관악산", "도봉산", "북한산" },
        					{ "계룡산", "월악산", "속리산" },
        					{ "내장산", "지리산", "가야산" },
        					{ "설악산", "오대산", "태백산" }};

        System.out.println("### 지역별 국립공원 ###");
        
        for (i = 0; i < str1.length; i++) {
            System.out.print(str1[i] + " : ");
            
            for (j = 0; j < str2[i].length; j++) {
            	
                System.out.print(str2[i][j]);
                
                if (j < str2[i].length - 1) {
                    System.out.print(", ");
                }
            }
            
            System.out.println();
		}

	}
}
