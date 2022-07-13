import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import Model.Pessoa;



public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
        List<Pessoa> pessoas = Arrays.asList(  
            new Pessoa("Pedro", 40, 4500, Arrays.asList("musica", "futebol")),
            new Pessoa("prtt", 18, 5000, Arrays.asList("dancar", "futebol")),
            new Pessoa("Mateus", 40, 2800, Arrays.asList("musica", "dancar")),
            new Pessoa("Mayke", 18, 1500, Arrays.asList("arte", "futebol")),
            new Pessoa("Rodrigues", 40, 8000, Arrays.asList("musica", "arte")),
            new Pessoa("Roger", 18, 4300, Arrays.asList("danca", "arte")),
            new Pessoa("Fabricio", 40, 1200, Arrays.asList("musica", "leitura"))
        );

        Double doubles = pessoas.stream()
            .mapToDouble(Pessoa::getSalario)
            .sum();

        System.out.println(doubles);


        Set<String> hobbies = pessoas.stream()
                .flatMap(p -> p.getHobbies().stream())
                .collect(Collectors.toSet());

        System.out.println(hobbies);

         Map<Integer, List<String>> pessoasPorIdade = pessoas.stream()
            .collect(
                    Collectors.groupingBy(Pessoa::getIdade, 
                    Collectors.mapping(Pessoa::getNome, Collectors.toList())));
        

        System.out.println(pessoasPorIdade);
            
    }
    
}
