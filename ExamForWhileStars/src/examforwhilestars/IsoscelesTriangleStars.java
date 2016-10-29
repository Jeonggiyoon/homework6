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
 * @author jgy
 */
public class IsoscelesTriangleStars {
    public void third() {
        System.out.print("============================");
        Scanner s = new Scanner(System.in);
        System.out.print("이등변 삼각형 크기입력 : ");
        int it = s.nextInt();
        
        for(int i=0; i< it; i++) {
            for(int j=0; j<(it-i); j++)
                System.out.print(" ");
            for(int j=0; j<i*2+1; j++)
                System.out.print("*");
            System.out.println();
        }
        
    }
    
}
