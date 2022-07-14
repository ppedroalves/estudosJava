import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 8.8);
        Aluno a2 = new Aluno("Anas", 7.8);
        Aluno a3 = new Aluno("Anasa", 5.8);
        Aluno a4 = new Aluno("Anaba", 9.8);
        Aluno a5 = new Aluno("Anaca", 1.8);
        Aluno a6 = new Aluno("Anada", 5.8);

        List<Aluno> alunos  = Arrays.asList(a1, a2,a3,a4,a5,a6);

        // alunos.stream().filter(x -> x.nota >= 7)
        //                 .map(x -> "Parabanes " + x.nome + ", voce foi aprovado!")
        //                 .forEach(System.out::println);

        List<Produto> produtos = Arrays.asList(new Produto("PERNA", 30, 30,30),
        new Produto("CAPIVARA", 1000, 10,200),
        new Produto("PRODUTO", 50, 5,0),
        new Produto("REFRIGERANTE", 10, 0,30),
        new Produto("CONTROLE", 50, 15,12),
        new Produto("CELULAR", 4500, 20,100)
        );

        produtos.stream().filter(x -> x.desconto > 10)
                         .filter(x -> x.valorFrete < 100)
                         .map(p -> "SUPER PROMOÇÃO: " + p.nome)
                         .forEach(System.out::println);

    }
}
