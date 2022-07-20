import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Outros{
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana Fernadna", 0.5);
        Aluno a2 = new Aluno("Ana Maria", 2.5);
        Aluno a3 = new Aluno("Ana Cristina", 5);
        Aluno a4 = new Aluno("Ana Carolina", 7.5);
        Aluno a5 = new Aluno("Ana Casteka", 10);
        Aluno a6 = new Aluno("Ana Duarte", 12.5);
        Aluno a7 = new Aluno("Irineu", 15);
        Aluno a8 = new Aluno("Ivete Sangalo", 17.5);
        Aluno a9 = new Aluno("Ronaldo", 20);
        Aluno a10 = new Aluno("Mario", 5.5);
        Aluno a11 = new Aluno("Carla", 2.3);
        Aluno a12 = new Aluno("Barabra", 0);

        List<Aluno> alunos  = Arrays.asList(a1, a2,a3,a4,a5,a6, a7,a8,a9,a10,a11,a12);

        // alunos.stream().distinct().forEach(System.out::println);
        

        // System.out.println("\n\nUTILIZANDO SKIP:");
        // alunos.stream().distinct()
        //                 .skip(2)
        //                 .limit(2)
        //                 .map(p -> "O ALUNO " + p.nome + " TIROU A NOTA: " + p.nota )
        //                 .forEach(System.out::println);

        
        alunos.stream().sorted(Comparator.comparing(Aluno::getNota).reversed())
            .limit(12)
            .forEach(p -> System.out.println("O aluno " + p.getNome() + " tirou nota " + p.getNota()));

    }
}