import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 8.8);
        Aluno a2 = new Aluno("Anas", 7.8);
        Aluno a3 = new Aluno("Anasa", 5.8);
        Aluno a4 = new Aluno("Anaba", 9.8);
        Aluno a5 = new Aluno("Anaca", 1.8);
        Aluno a6 = new Aluno("Anada", 5.8);

        List<Aluno> alunos  = Arrays.asList(a1, a2,a3,a4,a5,a6);

        Comparator<Aluno> melhorNota = (a, aa) -> {
            if(a.nota > aa.nota) return 1;
            if(a.nota < aa.nota) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (a, aa) -> {
            if(a.nota > aa.nota) return -1;
            if(a.nota < aa.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }
    
}
