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
public class RectagleStars {
    public void first() {
        System.out.print("============================");
        Scanner s = new Scanner(System.in);
        System.out.print("정사각형 크기입력 : ");
        int rt = s.nextInt();
        
        for (int i=0; i < rt; i++)
        {
                System.out.print("*");
            for (int j =1; j < rt; j++) 
            {
                System.out.print("*");
            }
                System.out.println();
        }
        
    }  
}
