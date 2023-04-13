import java.util.Arrays;

public class Programm {
    public static void main(String[] args) {
        new Programm().doWork();


    }
    public void doWork(){
        double[] array = new double[]{1.4, 2.3, 6.6, 1.9};
        ISortierAlgorythm sort = new InsertionSort();
        sort.sortAufsteigend(array);
        System.out.println(Arrays.toString(array));
        sort.sortAbsteigend(array);
        System.out.println(Arrays.toString(array));
    }

}