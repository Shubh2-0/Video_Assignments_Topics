package com.masai;

import java.util.Comparator;

public class com implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
	
		if(o1.score > o2.score) return 1;
		
		else if(o1.score < o2.score) return -1;
			
		else {
			return o2.name.compareTo(o1.name);
		}	
		
		
	}
	
	

}

