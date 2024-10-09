import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//         char [] test ={'c','b','t'};
//        char [] test1 ={'b', 'a', 'n', 'd'};
//        System.out.println(Arrays.toString(getreverseArr(test)));
//        System.out.println(Arrays.toString(getreverseArr(test1)));
        }
        public static char[] getreverseArr (char[] arr) {
        char[] reversed = new char[arr.length];
        int j=0;
            for (int i = arr.length-1; i >=0 ; i--) {
                reversed[j] = arr[i];
                j++;
            }
            return reversed;
        }
    }
