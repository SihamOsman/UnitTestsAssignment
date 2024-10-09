import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void getreverseArrtest1() {

        char[] input = {'c', 'b', 't'};
        char[] test1 = Main.getreverseArr(input);
        char[] output = {'t', 'b', 'c'};
        assertArrayEquals(output,test1);
    }
    void getreverseArrtest2() {

        char[] input = {'b', 'a', 'n', 'd'} ;
        char[] test1 = Main.getreverseArr(input);
        char[] output = {'d', 'n', 'a', 'b'};
        assertArrayEquals(output,test1);
    }

}