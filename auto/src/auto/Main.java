/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter no of rows and colums");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        System.out.println("Enter the elements of matrix");
        int i,j;
        int[][] m=new int [row][col] ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                m[i][j]=s.nextInt();
            }
        }
        Automata a=new Automata(row,col);
        
        a.calstate(row,col,m);
    }
    
}
