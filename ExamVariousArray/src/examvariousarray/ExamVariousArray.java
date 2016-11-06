/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examvariousarray;
import java.util.*;

/**
 *
 * @author 정기윤
 */
public class ExamVariousArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("********************************");
        System.out.printf("\t \t 배열사용\n");
        System.out.println("********************************");
        
        System.out.printf("\t\t Menu\n");
        System.out.println("1. 2번째로 큰수 찾기");
        System.out.println("2. 심사 점수 계산");
        System.out.println("3. 학생 총점, 평균값 구하기");
        System.out.println("4. 5층 아파트의 거주자  숫자 구하기");
        System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
        System.out.println("6. 종료하기");
        Scanner s = new Scanner(System.in);
        System.out.print("원하는 메뉴를 선택하세요 : ");
        int m = s.nextInt();
        System.out.println("********************************"); 
        
        while (true) {
            switch (m) {
                case 1: 
                    new SecondMax().first();
                    break;
                    
                case 2: 
                    new AvgScore().second();
                    break;
                    
                case 3: 
                    new StudentScore().third();
                    break;
                    
                case 4: 
                    new  AptPersonCount().fourth();
                    break;
                    
                case 5: 
                    new  OnlyNumber().fifth();
                    break;
                    
                default : 
                    System.exit(0);
                    break;
                    
            }
        }
    }
    
}
