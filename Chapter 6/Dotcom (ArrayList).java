import java.util.ArrayList;
public class Dotcom {
	
	private ArrayList<String> locationCells;
	
	public void setlocationCells(ArrayList<String> locs ) {
		locationCells = locs;
	}
	
	public String checkYourself(String UserInput) {
		String result = "Miss";
		
		int index = locationCells.indexOf(UserInput);
		
		System.out.println("UserInput");
		System.out.println("locationCells.indexOf(UserInput");
		
		if (index >=0 ) {
			
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "Kill";
			} else {
				result= "hit";
			}
			
		}
		return result ;
	}
	

}
