import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        NumbersBeforeFour n = new NumbersBeforeFour();
        System.out.println(Arrays.toString(n.numbers(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
    }
}
