package Model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
  
    private Integer idade;
 
    private int salario;
    
    private List<String> hobbies = new ArrayList<>();

    
    
    public Pessoa(String nome, Integer idade, int salario, List<String> hobbies) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }



}
