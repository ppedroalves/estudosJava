import java.util.Arrays;
import java.util.List;

public class Outros{
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 8.8);
        Aluno a2 = new Aluno("Anas", 7.8);
        Aluno a3 = new Aluno("Anasa", 5.8);
        Aluno a4 = new Aluno("Anaba", 9.8);
        Aluno a5 = new Aluno("Anaca", 10);
        Aluno a6 = new Aluno("Anada", 5.8);
        Aluno a7 = new Aluno("Irineu", 0.6);
        Aluno a8 = new Aluno("Ivete", 6);
        Aluno a9 = new Aluno("Ronaldo", 9.9);
        Aluno a10 = new Aluno("Mario", 10);
        Aluno a11 = new Aluno("Carla", 2.3);
        Aluno a12 = new Aluno("Barabra", 10);

        List<Aluno> alunos  = Arrays.asList(a1, a2,a3,a4,a5,a6, a7,a8,a9,a10,a11,a12);

        alunos.stream().distinct().forEach(System.out::println);
        

        System.out.println("\n\nUTILIZANDO SKIP:");
        alunos.stream().distinct()
                        .skip(2)
                        .limit(2)
                        .map(p -> "O ALUNO " + p.nome + " TIROU A NOTA: " + p.nota )
                        .forEach(System.out::println);
    }
}