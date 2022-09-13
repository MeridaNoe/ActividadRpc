package Client;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCEjercicio3 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Scanner read = new Scanner(System.in);
        Double numero1, numero2, min, max, sumatoria = 0.0;
        System.out.println("Hola ingresa un número");
        numero1 = read.nextDouble();
        System.out.println("Ingresa un número diferente");
        numero2 = read.nextDouble();
        min = Math.min(numero1, numero2);
        max = Math.max(numero1, numero2);
        System.out.print("Sumatoria de: ");
        for (double i = min+1; i <max; i++) {

            System.out.print( i + " |");
        }
        for (double i = min+1; i < max; i++) {
            sumatoria+=i;
        }
        System.out.println();

        Object[] data = {sumatoria};
        String response = (String) client.execute("Methods.sumatoria", data);
        System.out.println("\n"+ response);



    }
}
