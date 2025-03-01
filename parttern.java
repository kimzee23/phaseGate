public class pattern {
    public static void main(String[] args) {
        int rows = 20;
        
        for (int item = 1; item <= rows; item++) {
           
            for (int jam = 1; jam <= item; jam++) {
                System.out.print('*');
            }
            System.out.print("  ");
            
            
            for (int jam = rows; jam >= item; jam--) {
                System.out.print('*');
            }
            System.out.print("  ");
            

            for (int jam = 1; jam < item; jam++) {
                System.out.print(' ');
            }
            for (int jam = item; jam <= rows; jam++) {
                System.out.print('*');
            }
            System.out.print("  ");
            
 
            for (int jam = item; jam < rows; jam++) {
                System.out.print(' ');
            }
            for (int jam = 1; jam <= item; jam++) {
                System.out.print('*');
            }
            
            System.out.println();
        }
    }
}