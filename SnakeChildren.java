//working out logic, will scrap this, ignore for now

public class SnakeChildren{
int parentArr[];
int currentpos;
int pos_idx;

public SnakeChildren(int childnum, int[] parentPos){
	//add child to snake component array
	pos_idx = 1;
	parentArr = parentPos;

}
//need to get passed parents direction
//maybe add a "follow" component with parent node instead of head
//draw out array and movements on paper

	int nextLocation;
	while(!end){
		nextLocation = parentArr[pos_idx];
		moveChild(nextLocation);
		pos_idx++;
	}
	
	void moveChild(int location){
		component.setLocation(nextX, nextY);
	}
}



