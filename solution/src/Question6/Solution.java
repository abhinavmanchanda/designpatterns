

import java.util.Scanner;

class CalState {

    private State s;

    CalState() {

    }

    void setstate(State s) {
        this.s = s;
    }

    void calstate(int row,int col,int m[][],int noOfSteps)
    {
        int i = 0, j = 0, k = 0,score=0;
        CalState c=new CalState();
        int[][] tempMatrix = new int[row][col];
        
        for (k = 0; k < noOfSteps; k++)
        {
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++) 
                {
                    score=c.calneighbourscore(m,i,j,col);
                    tempMatrix[i][j] =this.s.nextstate(m[i][j],score);
                  
                }
            }

            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++)
                {
                    m[i][j] = tempMatrix[i][j];
                    tempMatrix[i][j] = 0;
                }
            }
        }
        
        c.display(m,row,col);
       
    }
  
    int calneighbourscore(int m[][],int row,int col,int n)
    {
       int score=0;
	int last=n-1;
       
	if(row>0&&col>0)
	{
		score+=m[row-1][col-1];
	}
	if(row>0)
	{
		score+=m[row-1][col];
		if(col<last)
		score+=m[row-1][col+1];
	}
	if(col>0)
	{
	  score+=m[row][col-1];
		if(row<last)
		score+=m[row+1][col-1];
	}
	if(row<last)
	{
		score+=m[row+1][col];
	}
	if(col<last)
	{
		score+=m[row][col+1];
	}
	if(row<last&&col<last)
	{
		score+=m[row+1][col+1];
	}
        return score;
    }
      void display(int finalMatrix[][],int row,int col)
    {
        int i,j;
         for (i = 0; i < row; i++)
         {
            for (j = 0; j < col; j++) 
            {
                System.out.print(finalMatrix[i][j]);
            }
            System.out.println();
        }

    }

}
 class Game implements State {
    public int nextstate(int currentState,int score)
    {
       
	score=score/2;
	int s=currentState+score;
        if(s>1&&s<10)
	return s;
	else
	return 0;
	       
    }
}
   class GameOfLife implements State {
    public int nextstate(int currentState,int score) 
    {
      
        if(currentState==1&&score<2)
	return 0;
        if(currentState==1&&(score==2||score==3))
	return 1;
        if(currentState==1&&score>3)
	return 0;
        if(currentState==0&&score==3)
	return 1;
        else
        return 0;
    }
}

 class Solution {

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
        System.out.println("Enter the no of steps(generations)");
	int n=s.nextInt();
        CalState state=new CalState(); 
        State gof=new GameOfLife(); 
        State ge=new Game();
        state.setstate(gof);      
        state.calstate(row,col,initialState,n);
        
    }
    
}


 interface State {
      public int nextstate(int currentState,int score);

   
}
