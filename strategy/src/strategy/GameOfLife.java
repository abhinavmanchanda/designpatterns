
package strategy;

public   class GameOfLife implements State {
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
