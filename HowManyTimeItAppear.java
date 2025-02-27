public class HowManyTimeItAppear{



 public static void main(String[] args) {
         System.out.println(isValidDigitCounting("1210")); 
        System.out.println(isValidDigitCounting("030"));  
   
    }


    public static boolean isValidDigitCounting(String num) {
        int[] count = new int[10]; 

                for (char item : num.toCharArray()) {
            count[item - '0']++;
        }

        for (int item2 = 0; item2 < num.length(); item2++) {
            if (count[item2] != num.charAt(item2) - '0') {
                return false;
            }
        }

        return true;
    }

   


}

