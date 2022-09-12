package Server;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Methods {

    /*
    PRIMERO
    * */
    public double imc(String nombre, double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;

    }



    /*segundo*/

    int numero1, numero2, numero3,numero4;
    int suma, promedio;
    int mul;
    Scanner scanner = new Scanner(System.in);

    public double addition(double num1, double num2) {
        return num1 + num2;
    }


    public int multiplicacion (int n1, int n2, int  n3, int n4){
        int producto = n1 * n2 * n3* n4;
        return producto;

    }
    public int sumatoria (int n1, int n2, int  n3, int n4){
        int sum = n1 + n2 + n3 + n4;
        return sum;

    }
    public int promedio (int n1, int n2, int  n3, int n4){
        int prom = (n1 + n2 + n3 + n4)/4;
        return prom;

    }



/*cuarto*/
    private int[] array = new int[5];

    public void cargar() {
        int i;
        System.out.println("Indica los valores  ");
        for (i = 0; i < array.length; i++) {
            System.out.print("Posicion [" + (i+1) + "] ");
            array[i] = scanner.nextInt();
        }
    }
    public void imprimir() {
        System.out.println("Arreglo en orden ascendente:");
        int i,j, aux;/*
        for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
           // System.out.println();
        }*/

        for (i = 0; i < array.length; i++) {
            for (j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i]+ ", ");
        }


    }



}

