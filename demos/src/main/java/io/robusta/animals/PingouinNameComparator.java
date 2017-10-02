package io.robusta.animals;
import java.util.Comparator;

public class PingouinNameComparator implements Comparator<Pingouin>{

	@Override
	public int compare(Pingouin p1, Pingouin p2) {
		return p1.name.compareTo(p2.name);
	}
	
	

}
