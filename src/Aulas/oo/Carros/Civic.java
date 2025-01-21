package Aulas.oo.Carros;

public class Civic extends Carro implements Luxo {

    public Civic(){
        super(150,"Civic");
    }

    @Override
    public void ligarAr() {
        System.out.println("Ligar Ar");
        velocidadeAtual -= 5;
    }

    public void desligarAr() {
        System.out.println("Desligar Ar");
        velocidadeAtual =+ 5;
    }
}
