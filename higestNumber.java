import java.util.Arrays;	

public class highestNumber{
    public static void main(String[] args) {
   	
	int[] nums = {1,4,5,6,9,7,-10,9};
	System.out.print(Arrays.toString(twoHighest(nums)));
}
 
public static int[] twoHighest(int[] nums){
	
	int highest1 = 0;
        int highest2 = 0;
 	
	for (int count : nums) {
		if (count > highest1) {
                	highest2 = highest1;
                	highest1 = count;
            	} 
       	} int[] result = {highest1, highest2};
        	return result;

}
 
}

