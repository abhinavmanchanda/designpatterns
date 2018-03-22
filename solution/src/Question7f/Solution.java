
class GameEngine {

    private Strategy strategy;
    int matrix[][];
    GameEngine(Strategy strategy, int matrix[][]) {
        this.strategy = strategy;
        this.matrix = matrix;
    }

    void calstrategy(int noOfSteps)
    {
        int row= matrix.length;
        int col= matrix.length;
        int i = 0, j = 0, k = 0,score=0;
        int[][] tempMatrix = new int[row][col];
        
        for (k = 0; k < noOfSteps; k++)
        {
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++) 
                {
                    score=calneighbourscore(i,j);
                    tempMatrix[i][j] =this.strategy.nextState(matrix[i][j],score);
                  
                }
            }

            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++)
                {
                    matrix[i][j] = tempMatrix[i][j];
                    tempMatrix[i][j] = 0;
                }
            }
        }
        
        display(matrix,row,col);
       
    }
  
    int calneighbourscore(int row,int col)
    {
       int score=0;
	int last=matrix.length-1;
       
	if(row>0&&col>0)
	{
		score+=matrix[row-1][col-1];
	}
	if(row>0)
	{
		score+=matrix[row-1][col];
		if(col<last)
		score+=matrix[row-1][col+1];
	}
	if(col>0)
	{
	  score+=matrix[row][col-1];
		if(row<last)
		score+=matrix[row+1][col-1];
	}
	if(row<last)
	{
		score+=matrix[row+1][col];
	}
	if(col<last)
	{
		score+=matrix[row][col+1];
	}
	if(row<last&&col<last)
	{
		score+=matrix[row+1][col+1];
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
 class PowerGame implements Strategy {
    public int nextState(int currentState,int score)
    {
       
	score=score/2;
	int s=currentState+score;
        if(s>1&&s<10)
	return s;
	else
	return 0;
	       
    }
}
   class GameOfLife implements Strategy {
    public int nextState(int currentState,int score) 
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


 interface Strategy {
      public int nextState(int currentState,int score);
  
}

public class Solution {

    public static void main(String[] args) {
        int row=3;
        int col=3;
       
        
            int i,j;
            int[][] initialState={{1,0,1},{0,0,0},{1,1,1}};
       	int n=1;//no of steps
       	  Strategy gof=new GameOfLife(); 
        Strategy ge=new PowerGame();
        GameEngine strategy=new GameEngine(gof,initialState); 
      
             
        strategy.calstrategy(n);
        
    }
    
}
