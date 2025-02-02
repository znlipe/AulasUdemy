package lambdasFunction.formulas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Leo", "Gui");

        System.out.println("Forma tradicional ...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        //utilizacao do lambda para foreach o torna mais flexivel, com possibilidade de concatenacoes como é o exemplo do "!"
        aprovados.forEach(nome -> System.out.println(nome + "!"));

        System.out.println("\nMethod Reference #01...");
        // utilizando a referencia de metodo acaba tornando-o menos flexivel frente ao lambda.
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        //Apos criacao do metodo static, utilizei ele no lambda para concatenar com um texto de apresentacao.
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02...");
        //Ja nesse caso, utilizo referencia de metodo para chamar o metodo static criado para passar pelos aprovados.
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi, me chamo: " + nome);
    }

}
