// Geven a non-empty array of integers nums, every element appears twice except for one, find that single one. 
import java.util.Scanner;
public class commonIntgers{
    public strings singleNumber(String [] nums) {
        String uniqueNum = 0;
        for (int num : nums) {
            uniqueNum ^= num;
        }
        return uniqueNum;
    }

    public static void main(String[] args) {
        commonIntgers single = new commonIntgers();
        String[] nums = {"l","e","e","t","c","o","d","e"};
        System.out.println(single.singleNumber(nums));  
    }
}

