package m3.model;

import java.sql.SQLException;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;

import m3.model.DataBaseOperation.TableOperations;

public class IncentiveList {
	
	private static List<Incentive> allIncentives = new ArrayList<Incentive>();
	
	public static List<Incentive> getAllIncentives(){
		return allIncentives;
	}
	
	public static void addIncentive(Incentive i){
		allIncentives.add(i);
		TableOperations database = new TableOperations();
	
		try {
			database.Create(i);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addIncentive(Incentive i, int index){
		allIncentives.add(index, i);
	}
	
	public static Incentive getIncentiveByIndex(int index){
		if(index > allIncentives.size()){
			// check
		}
		return allIncentives.get(index);
	}
	
	public static void deleteIncentive(int index){
		if(index > allIncentives.size()){
			// check
		}
		allIncentives.remove(index);
	}
}
