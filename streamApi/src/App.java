import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {


        // Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
        // langs.forEach(System.out::print);


        // String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        // Stream.of(maisLangs).forEach(System.out::print);
        // Arrays.stream(maisLangs).forEach(System.out::printf);

        List<Integer> outraslangs = Arrays.asList(1,2,3,4,5,6,7,8,9);
        outraslangs.stream().map(x -> x *2)
                            .map(x -> (x / 2) + 1)
                            .forEach(System.out::println);

                            
        System.out.println("UTILIZANDO O FILTER: ");
        outraslangs.stream().filter(x -> x % 2 == 0)
                            .map(x -> x * 10)
                            .forEach(System.out::println);


        System.out.println("UTILIZANDO O REDUCE");
        Integer total =  outraslangs.stream().reduce(0, (acumulator, n) -> acumulator + n);

        System.out.println(total);



        System.out.println("SEGUNDA PARTE DO REDUCE");

        outraslangs.stream()
                    .filter(x -> x > 5)
                    .reduce((ac, n) -> ac + n)
                    .ifPresent(System.out::println);

    }
}
