import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {12.79, -58.97, 45.98, 35.34, 6.54, -79.95, 44.23, -40.34, 56.65, -9.59, 69.96, 13.64, -12.56, 34.89, -12.78};

        double average = 0.00;
        int count = 0;
        boolean isNegative = false;

        for ( double aa : numbers) {
            if (aa < 0 ) {
                isNegative = true;

        } else if (aa > 0 && isNegative) {
                average = aa;
                count++;
                System.out.println(aa);

            }


        }
        System.out.println("Среднее арифмитическое число " + average/count);
    }


}