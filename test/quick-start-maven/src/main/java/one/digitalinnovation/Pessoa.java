package one.digitalinnovation;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String name;
    private LocalDateTime nascimento;

    public Pessoa(String name, LocalDateTime nascimento) {
        this.name = name;
        this.nascimento = nascimento;
    }
    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento,LocalDateTime.now());
    }
    public boolean maiorDeIdade(){
        return getIdade()>=18;
    }
}
