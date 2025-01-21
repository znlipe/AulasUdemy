package Aulas.oo.Animais;

public class Cachorro extends Mamifero {

    private Double idade;
    private String nome;

    //construtor padrao.
    public Cachorro(String nome, Double idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getIdade() {
        return idade;
    }

    //metodo para atribuir idade ao animal, usando "Math.abs" para garantir que o valor nao sera negativo.
    public void setIdade(Double novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }

    }

    @Override
    public String mover() {
        return "Usando as patas";
    }

    @Override
    //sobrecarga do metodo mamar da classe mamifero com condicional para verificar se o animal esta em periodo
    //de amamentacao
    public String mamar() {
        if (idade <= 1) {
            return "Mamando leite";
        } else return getNome() + " não mama pois ja é adulto";
    }

    @Override //sobrecarga do metodo respirar da classe Animal
    public String respirar() {
        return "Usando os pulmoes";
    }

    @Override //metodo de apresentacao
    public String toString() {
        return "Apresentando o cachorro {" + "nome = " + nome + ", idade = " + idade + " anos}";
    }
}
