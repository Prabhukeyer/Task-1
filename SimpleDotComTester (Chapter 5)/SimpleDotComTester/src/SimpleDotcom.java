public class SimpleDotcom {
	int [] locationcells;
	int numofhits=0;
	
	public void setLocationCells (int[]locs) {
		locationcells=locs;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "Miss";
		for (int cell : locationcells) {
			if (guess==cell) {
				result = "hit";
				numofhits++;
				break;	
			}
			
		}
		
		if (numofhits==locationcells.length) {
			result = "Kill";
		}
		System.out.println(result);
		return result;
	}

}
