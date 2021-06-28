 public class DivisaoArrays {

    public DivisaoArrays(){
        arrayA = new int[10];
        arrayB = new int[10];
    }
    
    private int[] arrayA;
    private int[] arrayB;

    public int[] getArrayA() {
        return arrayA;
    }
    public int[] getArrayB() {
        return arrayB;
    }
    public void setArrayA(int[] arrayA) {
        this.arrayA = arrayA;
    }
    public void setArrayB(int[] arrayB) {
        this.arrayB = arrayB;
    }
    public void setArrayANaPosicao(int valor, int posicaoArray){
        validador(posicaoArray, arrayA);
        arrayA[posicaoArray] = valor;
    }
    public void setArraBNaPosicao(int valor, int posicaoArray){
        validador(posicaoArray, arrayB);
        arrayB[posicaoArray] = valor;
    }
    public int calcula(int a, int b); throwsExcecaoDivisaoResultadoZero{
        int resultado = 0;
        try{
            resultado = a/b;
            if(resultado == 0){
                throw new ExcecaoDivisaoResultadoZero("O resultado da divisão foi igual a ZERO");
            }
        }catch(ArithmeticException e){
            System.out.println("Não se divide um número por zero. Tente novamente!");
        }
        
        return resultado;
    }
    public void calculaDivisaoArrays(){
        
        int [] resultadoDasDivisoes = new int [10];

        try{
            for(int i = 0; i < arrayA.length; i++){
                resultadoDasDivisoes[i] = calcula(arrayA[i], arrayB[i]);
            }
        }catch(ExcecaoDivisaoResultadoZero e){
            System.out.println(e.getMessage());

        }finally{
            for(int i = 0; i < arrayA.length; i++){
                System.out.println("O valor "+i+1+" do arrayA, arrayB e Resultado é:"
                + arrayA[i]+","+arrayB[i]+","+resultadoDasDivisoes[i]);
            }
        }
    }
    private void validador(int posicaoValidar, int[] array){
        if(!((posicaoValidar >= 0) && (posicaoValidar <= array.length -1))){
            throw new IllegalArgumentException("Essa posição não existe no array. Tente mais uma vez!");
        }
    }
}
