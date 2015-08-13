import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class IVote {
	
	private int totalT;
	private int totalF;
	private int totalA;
	private int totalB;
	private int totalC;
	private int totalD;
	
	Hashtable<String, Integer> iVoteStats = new Hashtable<String, Integer>();
	
	public void calculateStats()
	{
		Enumeration<String> id = stud.table.keys();
		while(id.hasMoreElements())
		{
			
			String key = id.nextElement();
			String answer = stud.table.get(key);
			
			if(answer.equals("A")){
				totalA++;
				iVoteStats.put("A", totalA);
			}
			
			if(answer.equals("B")){
				totalB++;
				iVoteStats.put("B", totalB);
			}
			
			if(answer.equals("C")){
				totalC++;
				iVoteStats.put("C", totalC);
			}
			
			if(answer.equals("D")){
				totalD++;
				iVoteStats.put("D", totalD);
			}
			
			if(answer.equals("T")){
				totalT++;
				iVoteStats.put("T", totalT);
			}
			
			else{
				totalF++;
				iVoteStats.put("F", totalF);
			}
		}
	}
		
	public void printStats(){
	 	Set<Entry<String, Integer>> set = iVoteStats.entrySet();
	 	Iterator<Entry<String, Integer>> it = set.iterator();
	 	while(it.hasNext()){
	 		Map.Entry entry = (Map.Entry) it.next();
	 		System.out.printf("\n%-20s%s",entry.getKey() , entry.getValue());
	 	}
	}
}
    
	
	
	
	
	



