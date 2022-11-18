public class NumeroOculto extends Thread {
    public static int numOculto;
    public static boolean acertado;

    public static int propuestaNumero(int num) {
        int resultado;
        System.out.println("El numero es: " + numOculto + " y el propuesto por el hilo " + Thread.currentThread().getName() + " es: " + num);
        if (num == numOculto) {
            resultado = 1;
            System.out.println("¡ACERTADO!");
        } else if (acertado) {
            resultado = -1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    @Override
    public void run() {
        int num;
        int resultado = 0;
        while (!acertado || resultado == 0) {
            num = (int) (Math.random() * 10 + 1);
            resultado = propuestaNumero(num);
            if (resultado == 1) acertado = true;
            if (acertado) Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        numOculto = (int) (Math.random() * 10 + 1);

        NumeroOculto num1 = new NumeroOculto();
        NumeroOculto num2 = new NumeroOculto();
        NumeroOculto num3 = new NumeroOculto();
        NumeroOculto num4 = new NumeroOculto();
        NumeroOculto num5 = new NumeroOculto();
        NumeroOculto num6 = new NumeroOculto();
        NumeroOculto num7 = new NumeroOculto();
        NumeroOculto num8 = new NumeroOculto();
        NumeroOculto num9 = new NumeroOculto();
        NumeroOculto num10 = new NumeroOculto();

        num1.setName("num1");
        num2.setName("num2");
        num3.setName("num3");
        num4.setName("num4");
        num5.setName("num5");
        num6.setName("num6");
        num7.setName("num7");
        num8.setName("num8");
        num9.setName("num9");
        num10.setName("num10");

        num1.start();
        num2.start();
        num3.start();
        num4.start();
        num5.start();
        num6.start();
        num7.start();
        num8.start();
        num9.start();
        num10.start();
    }
}
