
import java.util.Arrays;

public class questionOne{
	public static void main(String[]args){
int num = 0;
int num1 = 2;
int num2 = 4;
 
System.out.print("The GCD is" + " "+ num1);	

}
public static int getTheGCD(int num1, int num2) {
    while (num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }
    return num1;
}

}

	



 