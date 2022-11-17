public class NumeroOculto extends Thread{
    public static int numOculto;
    public static boolean acertado;

    public static int propuestaNumero(int num){
        int resultado;
        if (num == numOculto){
            resultado = 1;
            //interrumpir hilo
        }else if (acertado) {
            resultado = 1;
            //interrumpir hilo
        }else {
            resultado = 0;
        }
        return resultado;
    }

    @Override
    public void run(){
        int num;
        while (true){
            num = (int) (Math.random() * 100 +1);
            propuestaNumero(num);
        }
    }

    public static void main(String[] args) {
        numOculto = (int)Math.random();
        for (int i= 0; i<10; i++){
            new NumeroOculto().start();
        }
    }
}
