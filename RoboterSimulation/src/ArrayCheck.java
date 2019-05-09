
public class ArrayCheck {

	
	public ArrayCheck() {
		
	}
	
	
	public boolean equal(Punkt[] ary, Punkt p) {
		
		for(int x = 0; x < ary.length ; x++) {
		
			if(ary[x] == p) {
				
				return true;
			}
		}
		
		return false;
		
	}
}

