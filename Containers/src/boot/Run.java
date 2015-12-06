package boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import data.NameComparator;
import data.Worker;

public class Run {

	public static void main(String[] args) {
		
		//-------------------ArrayList---------------

		ArrayList<Worker> workers = new ArrayList<Worker>();
		
		workers.add(new Worker("Mor", 30, 1000));
		workers.add(new Worker("Daniel", 31, 1000));
		workers.add(new Worker("Or", 25, 100));
		
		//for(Worker w : workers)
		//	System.out.println(w);
		
		//workers.add(0, new Workr("Sarit", 22, 7000));
		
		System.out.println(workers);
		
		Worker[] workers2 = new Worker[workers.size()];
		workers.toArray(workers2);
		
		
		Collections.sort(workers);
		
		//for(Worker w : workers)
		//	System.out.println(w);
		
		//--------------------LinkedList-------------------
		
		LinkedList<Worker> workerList = new LinkedList<Worker>();
		workerList.add(new Worker("Itai", 50, 800000));
		workerList.add(new Worker("Osnat", 30, 50000));
		workerList.add(new Worker("Mazal", 35, 20000));
		
		System.out.println(workerList);
		
		workerList.addFirst(new Worker("Yarin",12,100000));
		
		
		Worker temp = workerList.get(0);
		//System.out.println(temp);
		
		Collections.sort(workerList, new NameComparator());
		
		
		//--------------------HASH-MAP--------------------
		HashMap<String, Worker> workersMap = new HashMap<String,Worker>();
		workersMap.put("David", new Worker("David", 30, 1000));
		workersMap.put("Sahar", new Worker("Sahar", 32, 4000));
		workersMap.put("Boaz", new Worker("Boaz", 31, 3000));
		workersMap.put("Boaz", new Worker("Boaz", 32, 6000));
		workersMap.put("BoazTwo", new Worker("BoazJunior", 3, 6));
		
		
		
		Iterator<String> it = workersMap.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key + " " + workersMap.get(key));
		}
		
		
	}

}
