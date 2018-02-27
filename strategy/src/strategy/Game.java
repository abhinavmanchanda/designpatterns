
package strategy;

public class Game implements State {
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

