/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examforwhilestars;
import java.io.*;
import java.util.*;
/**
 *
 * @author jgy
 */
public class TriangleStars {
    public void second() {
        System.out.print("============================");
        Scanner s = new Scanner(System.in);
        System.out.print("직각 삼각형 크기입력 : ");
        int t = s.nextInt();
        
        for(int i =0; i<t; i++) {
            for(int j=0; j<(t-i-1); j++) 
                System.out.print(" ");
            for(int j=0; j<i+1; j++) 
                System.out.print("*");
            System.out.println();
        }
    }
}
