import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTests {

    public LinkedList populate(LinkedList ll){
        int input1[] = {1,2,3,4,5};
        for(int i=0; i<input1.length; i++){
            ll.append(input1[i]);
        }
        return ll;
    }

    @Test
    public void prependTest(){
        LinkedList ll = new LinkedList();
        int testvalue = 5;
        ll=populate(ll);
        ll.prepend(testvalue);
        assertEquals(testvalue, ll.root.value);
    }

    @Test
    public void appendTest_null(){
        LinkedList ll = new LinkedList();
        int testvalue = 5;
        ll.append(testvalue);
        assertEquals(testvalue, ll.root.value);
    }

    @Test
    public void appendTest_one(){
        LinkedList ll = new LinkedList();
        int initial = 3;
        int testvalue = 5;
        ll.append(initial);
        ll.append(testvalue);
        assertEquals(testvalue, ll.last());
    }

    @Test
    public void appendTest(){
        LinkedList ll = new LinkedList();
        ll=populate(ll);
        int testvalue = 5;
        ll.append(testvalue);
        assertEquals(testvalue, ll.last());
    }

    @Test
    public void toStringTest(){
        LinkedList ll = new LinkedList();
        ll=populate(ll);
        String s = "1 2 3 4 5 ";
        assertEquals(s, ll.toString());
    }

    @Test
    public void lengthTest(){
        LinkedList ll = new LinkedList();
        ll=populate(ll);
        int testvalue = 5;
        assertEquals(testvalue, ll.length());
    }


}
