package arraynumbers;

import java.util.ArrayList;
import java.util.List;

public class ArrayNumbers {

	public static void main(String[] args) {
		 
		int array[]= {3,4,0,1,2,0,8};
		int count=0;
		List<Integer> elements=new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				elements.add(array[i]);
				
			}
			else
			{
				count++;
			}
		}
		for(int i=1;i<=count;i++) {
			
			elements.add(0);
			
		}
		
	System.out.println(elements);
	}
	
	

}
