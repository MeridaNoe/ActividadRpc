package Server;

import java.util.IllegalFormatCodePointException;

public class Methods {
    public double imc(String nombre, double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;

    }



}
