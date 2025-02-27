import static org.junit.Assert.*;
import org.junit.Test;

public class TestUniqueThings{
@Test
	public void TestUniqueNums(){
	assertEquals(new int [] { 1,3,3,5,5,6,7},  UniqueThings.uniqueNumbers(new int[]{1,6,7}));

}

	}
