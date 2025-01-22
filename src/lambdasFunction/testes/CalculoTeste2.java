package lambdasFunction.testes;

import lambdasFunction.formulas.Calculo;

public class CalculoTeste2 {
    public static void main(String[] args) {

        /**
         * implementando lambda
         */
        Calculo calc = (x, y) -> {
            return x + y;
        };
        //testando o lambda
        System.out.println(calc.calcular(2, 3));

        /**
         * uma forma mais enxuta de lambda, se não inserir chaves, o Java ja reconhece que essa função haverá apenas uma
         * sentença de código e retornará apenas uma coisa,
         * inclusive o Java não permite deixar o "Return" explicito desta forma.
         */

        calc = (x, y) -> x * y;
        System.out.println(calc.calcular(2, 5));

    }
}
