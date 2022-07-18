import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
   

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 8.8);
        Aluno a2 = new Aluno("Anas", 7.8);
        Aluno a3 = new Aluno("Anasa", 5.8);
        Aluno a4 = new Aluno("Anaba", 9.8);
        Aluno a5 = new Aluno("Anaca", 1.8);
        Aluno a6 = new Aluno("Anada", 5.8);

        List<Aluno> alunos  = Arrays.asList(a1, a2,a3,a4,a5,a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(reprovado));

    }
}
