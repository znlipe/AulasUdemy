package Aulas.oo.testes;

import Aulas.oo.Carros.Civic;
import Aulas.oo.Carros.Ferrari;

public class TesteCarro {

    public static void main(String[] args) {

        Ferrari c1 = new Ferrari();
        Civic c2 = new Civic();


        c1.ligarTurbo();
        c1.setNome("Ferrari");
        c1.acelerarMotor();
        c1.acelerarMotor();
        c1.acelerarMotor();
        c1.getVelocidadeAtual();

        c2.setNome("Civic");
        c2.acelerarMotor();
        c2.acelerarMotor();
        c2.acelerarMotor();
        c2.ligarAr();
        c2.getVelocidadeAtual();
        c2.desligarAr();

    }
}
