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
public   class gameoflife implements state {
    public int nextstate(int m[][],int row,int col,int n) 
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
}
