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
	
	Hashtable<String, String> table = new Hashtable<String, String>();
	
	Hashtable<String, Integer> iVoteStats = new Hashtable<String, Integer>();
	
	Student stud = new Student();
	
	//create the HashTable to store ID and corresponding answer
	public void setTable(String id, String ans){
			table.put(id,ans);		
	}
	
	public void printHashtable(){
 		Set<Entry<String, String>> set = table.entrySet();
 		Iterator<Entry<String, String>> it = set.iterator();
 		while(it.hasNext()){
 			Map.Entry<String,String> entry = (Map.Entry<String,String>) it.next();
 			System.out.printf("\n%-20s%s",entry.getKey() , entry.getValue());
 		} 		
 	}

	
	public void calculateStats()
	{
		Enumeration<String> id = table.keys();
		while(id.hasMoreElements())
		{
			
			String key = id.nextElement();
			String answer = table.get(key);
			
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
				iVoteStats.put("True", totalT);
			}
			
			if(answer.equals("F")){
				totalF++;
				iVoteStats.put("False", totalF);
			}
		}
	}
		
	public void printStats(){
	 	Set<Entry<String, Integer>> set = iVoteStats.entrySet();
	 	Iterator<Entry<String, Integer>> it = set.iterator();
	 	while(it.hasNext()){
	 		Map.Entry<String, Integer> entry = (Map.Entry<String,Integer>) it.next();
	 		System.out.printf("\n%-20s%s",entry.getKey() , entry.getValue());
	 	}
	}
}
    
	
	
	
	
	



