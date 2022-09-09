package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su peso");
        double peso = teclado.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = teclado.nextDouble();

        XmlRpcClientConfigImpl config =new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Object[] data = {nombre, peso, altura};
        Double response = (Double) client.execute("Methods.imc", data);
        System.out.println("Hola: " + data[0] + " Tu IMC es: " + response);
    }
}
