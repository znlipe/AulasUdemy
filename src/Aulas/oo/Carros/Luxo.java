package Aulas.oo.Carros;

public interface Luxo {

    public void ligarAr();
    abstract void desligarAr();

    //comportamento padrao que nao obriga as classes que implementam essa interface (como por ex o civic)
    // instanciarem por ser do metodo de acesso "default"
    default int velocidadeDoAr(){
        return 1;
    }
}
