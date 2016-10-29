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
public class Rhombus {
    public void fourth() {
        System.out.print("============================");
        Scanner s = new Scanner(System.in);
        System.out.print("다이아몬드 크기입력 : ");
        int r = s.nextInt();
        
        for(int i=0; i<r; i++) {
            for(int j = i+1; j<=r; j ++)
                System.out.print(" ");
            for(int c=0; c<i*2+1; c++)
                System.out.print("*");
            System.out.println();
        }
        for(int i =1; i<r; i++) {
            for(int j=i+1; j>0; j--)
                System.out.print(" ");
            for(int c=r*2-1; c>i*2; c--)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
