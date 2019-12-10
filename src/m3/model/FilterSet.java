package m3.model;

import java.util.HashSet;

public class FilterSet<Filter> extends HashSet{
	
	public boolean equals(Object o) 
	
	{
		if (o ==  null )  return   false ;  
		
		if(this.getClass() == o.getClass())
			return true;
		

		return false;
	}
	
//	public   int  hashCode() {  
//        return  this.getClass().hashCode();  
//    } 

}
