package Lista01.exercicio5;

public enum Operacao {
    SOMA{
        @Override
        public double executar(double n1, double n2){
            return n1 + n2;
        }
    },

    SUBTRACAO{
      @Override
      public double executar(double n1, double n2){
          return n1 - n2;
      }
    },

    MULTIPLICACAO{
        @Override
        public double executar(double n1, double n2){
            return n1 * n2;
        }
    },

    DIVISAO{
        @Override
        public double executar(double n1, double n2){
            if(n2 == 0){
                throw new IllegalArgumentException("Divisão por zero não permitida!");
            }
            return n1 / n2;
        }
    }
    ;

    public abstract double executar(double n1, double n2) throws IllegalArgumentException;
}
