package Aulas.oo.Carros;

public class Carro {

    protected String nome;
    public int velocidadeMaxima;
    protected int velocidadeAtual;
    protected int delta = 5;
    boolean ligado = false;

    protected Carro(int velocidadeMaxima, String nome) {
        getNome();
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean ligarMotor() {
        if (this.ligado == false) {
            return ligado;
        } else
            return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void acelerarMotor() {
        if (velocidadeAtual + delta > velocidadeMaxima) {
            velocidadeAtual += velocidadeMaxima;
        } else {
            velocidadeAtual += delta;
        }
    }

    public boolean desligarCarro(Carro carro) {
        if (carro.ligado == true) {
            carro.ligado = false;
        } else System.out.println("Carro ja esta desligado");
        return ligado;
    }

    public void statusMotor() {
        if (this.ligado == true) {
            System.out.println("Seu carro esta ligado");
        } else System.out.println("Seu carro esta desligado");
    }

    public void getVelocidadeAtual() {
        System.out.println("O " + getNome() + " esta a " + velocidadeAtual + " km/h");
    }

}
