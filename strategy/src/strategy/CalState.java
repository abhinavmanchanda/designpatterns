package strategy;

public class CalState {

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
