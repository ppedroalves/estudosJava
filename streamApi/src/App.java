import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {


        // Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
        // langs.forEach(System.out::print);


        // String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};

        // Stream.of(maisLangs).forEach(System.out::print);
        // Arrays.stream(maisLangs).forEach(System.out::printf);

        List<Integer> outraslangs = Arrays.asList(3, 1, 7, 4, 6, 5, 8, 10, 9);
        outraslangs.stream().map(x -> x *2)
                            .map(x -> (x / 2) + 1)
                            .forEach(System.out::println);

    }
}
