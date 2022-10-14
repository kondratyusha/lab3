import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        StringChecker sc = new StringChecker() {
            public boolean checkString(String s){
                if(s.contains("a")){
                    return true;
                }else{
                    return false;
                }
            }
        };
        input1.add("apple");
        input1.add("banana");
        input1.add("pineapple");
        input1.add("orange");
        input1.add("pomegranate");

        input2.add("apple");
        input2.add("banana");
        input2.add("pineapple");
        input2.add("orange");
        input2.add("pomegranate");

        assertEquals(input2, ListExamples.filter(input1, sc));


    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        List<String> both = new ArrayList<>();

        input1.add("apple");
        input1.add("banana");
        input1.add("pineapple");

        input2.add("orange");
        input2.add("pomegranate");

        both.addAll(input1);
        both.addAll(input2);
        both.sort(null);

        assertEquals(both, ListExamples.merge(input1, input2));


    }
}
