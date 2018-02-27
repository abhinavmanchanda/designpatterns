
package strategy;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     System.out.println("Enter no of rows and colums");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        System.out.println("Enter the elements of matrix");
        
            int i,j;
            int[][] initialState=new int [row][col] ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                initialState[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the no of steps");
		int n=s.nextInt();
        CalState state=new CalState(); 
        State gof=new GameOfLife(); 
        State ge=new Game();
        state.setstate(gof);      
        state.calstate(row,col,initialState,n);
        
    }
    
}


