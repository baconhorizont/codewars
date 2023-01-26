package codewars.kyu5.ProductofconsecutiveFibnumbers;

public class ProdFib {
    public static long[] productFib(long prod) {
        long[] result = {0,1,0};

        while (result[0]*result[1] != prod){
            long temp = result[0];
            result[0] = result[1];
            result[1] = temp + result[0];

            if (result[0]*result[1] > prod){
                return result;
            }
        }
        result[2] = 1;
        return result;
    }
}
