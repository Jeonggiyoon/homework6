/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examforwhilestars;
import java.util.*;
import java.io.*;

/**
 *
 * @author 정기윤
 */
public class ExamForWhileStars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************************************");
        System.out.println("         반복문 연습하기2");
        System.out.println("************************************");
        System.out.println("             메뉴");
         
        System.out.println("1. 정사각형 별찍기");
        System.out.println("2. 직각삼각형 별찍기");
        System.out.println("3. 이등변삼각형 별찍기");
        System.out.println("4. 다이아몬드 별찍기");
        System.out.println("2. 종료하기");
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("원하는 메뉴는 : ");
        int m = s.nextInt();
        
        while (true) {
            switch (m) 
            {
                case 1:
                    new RectagleStars().first();
                    break;
                case 2:
                    new TriangleStars().second();
                    break;
                case 3:
                    new IsoscelesTriangleStars().third();
                    break;
                case 4:
                    new Rhombus().fourth();
                    break;
                default :
                    System.exit(0);
                    break;
            }
        }
    }
    
}
