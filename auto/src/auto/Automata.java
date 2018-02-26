/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author lenovo
 */
public class Automata {
int row;int col;
    Automata(int row, int col)
    {
        row=this.row;
        col=this.col;
        
    }
    Automata()
    {
        
    }
   
    void calstate(int row,int col,int m[][])
    {
        
        int i=0,j=0;
        int [][] m1=new int [row][col];
        int [][] m2=new int [row][col];
        Automata a=new Automata();
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               m1[i][j]=a.gameoflife(m,i,j,col);
               m2[i][j]=a.neighbour(m,i,j,col);
                //System.out.println(m[i][j]);
            }
        }
           for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                
               System.out.print(m1[i][j]);
                       
            }
            System.out.println();
        }
    }

    int gameoflife(int m[][],int row,int col,int n) 
    {
      int score=0;
	int last=n-1;
	if(row>0&&col>0)
	{
            if(m[row-1][col-1]==1)
		score++;
	}
	if(row>0)
	{
		if(m[row-1][col]==1)
		score++;
		if(col<last)
                {if(m[row-1][col+1]==1)score++;}
	}
	if(col>0)
	{
	  if(m[row][col-1]==1)
              score++;
		if(row<last)
                {if(m[row+1][col-1]==1)score++;}
	}
	if(row<last)
	{
		if(m[row+1][col]==1) score++;
	}
	if(col<last)
	{
		if(m[row][col+1]==1) score++;
	}
	if(row<last&&col<last)
	{
		if(m[row+1][col+1]==1) score++;
	}
	//return score;
        if(m[row][col]==1&&score<2)
	return 0;
        if(m[row][col]==1&&(score==2||score==3))
	return 1;
        if(m[row][col]==1&&score>3)
	return 0;
        if(m[row][col]==0&&score==3)
	return 1;
        else
        return 0;
    }

   int neighbour(int[][]a, int row, int col, int n)
    {
       int score=0;
	int last=n-1;
	if(row>0&&col>0)
	{
		score+=a[row-1][col-1];
	}
	if(row>0)
	{
		score+=a[row-1][col];
		if(col<last)
		score+=a[row-1][col+1];
	}
	if(col>0)
	{
	  score+=a[row][col-1];
		if(row<last)
		score+=a[row+1][col-1];
	}
	if(row<last)
	{
		score+=a[row+1][col];
	}
	if(col<last)
	{
		score+=a[row][col+1];
	}
	if(row<last&&col<last)
	{
		score+=a[row+1][col+1];
	}
	score=score/2;
	int s=a[row][col]+score;
        if(s>1&&s<10)
	return s;
	else
	return 0;
	       
    }
}
    
    
