package Aulas.oo.testes;

import Aulas.oo.Animais.Animal;
import Aulas.oo.Animais.Cachorro;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro a1 = new Cachorro("Adalberto", 2.0);

        System.out.println(a1.mamar());
        //System.out.println(a1.respirar());
        System.out.println(a1);
    }


}
