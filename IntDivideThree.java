public class IntDivideThree {
    public static void main(String[] args) {
        int sum = 0;
                
  
        for (int item = 1; item <= 30; item++) {
            if (item % 3 == 0) {
                sum += item;
            }
      System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + sum);
        }

    }
}
