import java.util.Arrays;

public class GcD{
	public static void main(String[]args){
int num = 0;
int num1 = 2;
int num2 = 4;
	
}
public int getTheGCD(int num, int num1, int num2 ){
	for(int item =1; item <= num1 && item <= num2; item++){
	if(num1 % item == 0 && num2 % item ==0){
		num =item;		
}
	System.out.print("The GCD is" + " "+ num);
	}
	return num;
}

}
