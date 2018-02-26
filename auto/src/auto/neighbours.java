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
public class neighbours implements state {
    public int nextstate(int[][]a, int row, int col, int n)
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
