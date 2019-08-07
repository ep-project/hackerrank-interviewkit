//This question is described as medium but it is easy

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        if( a.score > b.score) return -1;
        if( a.score < b.score) return 1;

        //Scores are equal, sort by name

        if( a.name.compareTo(b.name) >0 ) return 1;
        if( a.name.compareTo(b.name) <0 ) return -1;

        return 0; //Same name and same score
    
    }
}