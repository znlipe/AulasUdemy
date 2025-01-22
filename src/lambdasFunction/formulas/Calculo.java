package lambdasFunction.formulas;

@FunctionalInterface
public interface Calculo {
    /**
     * deixando o public abstract só para fins de detalhamento, não há necessidade de inserir nas interfaces pois esse é
     * o valor padrão de um método em interfaces
     **/
    public abstract double calcular(double x, double y);
}
