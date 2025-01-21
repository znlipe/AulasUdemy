package Aulas.oo.testes;

import Aulas.oo.Jantar.*;

public class TesteJantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.60);

        Comida ingrediente1 = new Arroz(0.2);
        Comida ingrediente2 = new Feijao(0.1);
        Comida sobremesa = new Sorvete(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());

    }
}
