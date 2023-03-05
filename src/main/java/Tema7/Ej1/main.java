package Tema7;

public class main {
    public static void main(String[] args) {

                Dado dado1 = new Dado();
                Dado dado2 = new Dado(10);
                Dado dado3 = new Dado(12);

                int suma = 0;

                while (suma < 20) {
                    suma = dado1.tirar() + dado2.tirar() + dado3.tirar();
                    System.out.println("Dado 1: " + dado1.getUltimaCara());
                    System.out.println("Dado 2: " + dado2.getUltimaCara());
                    System.out.println("Dado 3: " + dado3.getUltimaCara());
                    System.out.println("Suma: " + suma);
                    System.out.println("---------------------");
                }
            }
        }


