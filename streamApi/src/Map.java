import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {
        List<String> marcas = Arrays.asList("bmw ", "audi ", "honda");


        // marcas.stream().map(x -> x.toUpperCase())
        //                 .forEach(System.out::printf);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(System.out::printf);

    }
    
}
