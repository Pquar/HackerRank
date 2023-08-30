package Stream.Api.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorT {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = (num1,num2)->num1+num2;

        int resultado = numeros.stream()
                .reduce(0,somar);

        int resultado2 = numeros.stream()
                        .reduce(0, (n1,n2)->n1+n2 );
        //                .reduce(0, (n1,n2)->Integer::sum );

        System.out.println(resultado);
        System.out.println(resultado2);

    }
}
