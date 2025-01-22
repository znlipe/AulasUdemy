package lambdasFunction.testes;

import lambdasFunction.formulas.Calculo;
import lambdasFunction.formulas.Dividir;
import lambdasFunction.formulas.Multiplicar;
import lambdasFunction.formulas.Somar;

public class CalculoTeste1 {

    public static void main(String[] args) {

        Calculo calculo = new Somar();
        System.out.println(calculo.calcular(2,3));

        calculo = new Multiplicar();
        System.out.println(calculo.calcular(2,3));

        calculo = new Dividir();
        System.out.println(calculo.calcular(24,2));

    }
}
