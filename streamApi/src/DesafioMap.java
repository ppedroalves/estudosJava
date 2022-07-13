import java.util.Arrays;
import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 , 9);
        

        numeros.stream().map(x ->  Integer.toBinaryString(x))
                        .map(x -> new StringBuilder(x).reverse().toString())
                        .map(x -> Integer.parseInt(x, 2))
                        .forEach(System.out::println);

    }
    
}
