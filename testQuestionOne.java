import static org.junit.Assert.*;
import org.junit.Test;

public class testQuestionOne {
    
    @Test
    public void testGCD() {
	//testQuestionOne questionOne = new questionOne();
        assertEquals(2, questionOne.getTheGCD(2, 4));
        assertEquals(1, questionOne.getTheGCD(7, 9));
        assertEquals(5, questionOne.getTheGCD(10, 15));
      
    }
}

