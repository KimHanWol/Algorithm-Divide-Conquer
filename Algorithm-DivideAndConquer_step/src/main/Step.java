package main;

public class Step {
	
	int[] stairs;
	
	int sum;
	
	public Step(int[] stairs) {
		this.stairs = stairs;
		sum = 0;
	}
	
	public void stepUp(int first) {
		sum += stairs[first];
		
		int[] threeSteps = new int[] {
				stairs[first + 1],
				stairs[first + 2],
				stairs[first + 3],};
		
		int lowest = getLowest(threeSteps[0], threeSteps[1], threeSteps[2]);
		
		switch(lowest) {
		case 0:
			sum += threeSteps[1] + threeSteps[2];
			stepUp(first + 5);
			break;
		case 1:
			sum += threeSteps[0];
			
			break;
		case 2:
			break;
		}
	}
	
	public int getLowest(int a, int b, int c) {
		if(a < b) {
			if(a < c) return 0;
			else return 2; 
		}
		else{
			if(b < c) return 1;
			else return 2;
		}
	}
}
