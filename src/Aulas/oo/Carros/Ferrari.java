package Aulas.oo.Carros;

public class Ferrari extends Carro implements Esportivo {

    public Ferrari(){
        this(250);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima,"Ferrari");
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
}
