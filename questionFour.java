import java.util.Arrays;

class questionFour{
	public static int[] highetAndLowest(int[] numbers ){

int highest = 0;
int lowest = 0;
int indexHighest = 0;
int indexLowest = 0;

int total = 0;

int[] newArrays = new int[1];

	for (int count = 0; count < numbers.length; count++){
		if (numbers[count] > highest){
		highest = numbers[count];
		
	}	
		else if (numbers[count] < lowest){
		lowest = numbers[count];
				
	     }	
 	 }
	
	return new int[] {highest, lowest};
}


public static void main(String[] args){

int[] arrays = {4, 6, 2, 5, -1};

int[] output = highetAndLowest(arrays);

System.out.print(Arrays.toString(output));

   }
}	