package lambdasFunction.testes;

import java.util.function.BinaryOperator;

/*
Teste criado para a implementacao de "BinaryOperator<T>" de java.util.function da documentacao da oracle.
 */

public class CalculoTeste3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x,y) -> x + y;
        System.out.println("Soma: " + calc.apply(2.5, 3.0));

        calc = (x,y) -> {return x * y;};
        System.out.println("Multiplicacao: " + calc.apply(2.5, 3.0));

        BinaryOperator<Integer> calc2 = (x,y) -> x + y;
        System.out.println(calc2.apply(2, 3));

        calc2 = (x,y) -> {return x * y;};
        System.out.println(calc2.apply(2, 3));

    }
}
