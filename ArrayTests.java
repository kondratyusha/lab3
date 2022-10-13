import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,3,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,3,1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {0,1,2,3,4,5,6,7,8,9};
    assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,0}, ArrayExamples.reversed(input1));
  }
}
