import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) {
        int[]x={10,15,20,25,30};
        System.out.println(Arrays.toString(x));
        System.out.println("copy =");
        int [] new_arr=(int[])Arrays.copyOf(x,5);
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(new_arr));
        }
    }
}
