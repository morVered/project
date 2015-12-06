package data;

import java.util.Comparator;

public class NameComparator implements Comparator<Worker> {

	@Override
	public int compare(Worker w1, Worker w2) {
		
		return w1.getName().compareTo(w2.getName());
	}

}
