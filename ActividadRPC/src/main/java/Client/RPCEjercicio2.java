package Client;

import Server.Methods;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCEjercicio2 {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);


        Methods methods = new Methods();


        System.out.println("Ingrese 4 números: ");
        System.out.print("Primer Número: ");
        int n1 = scanner.nextInt();
        System.out.print("Segundo Número: ");
        int n2 = scanner.nextInt();
        System.out.print("Tercer Número: ");
        int n3 = scanner.nextInt();
        System.out.print("Cuarto Número: ");
        int n4 = scanner.nextInt();


        System.out.print( "El producto es: "+ methods.multiplicacion(n1,n2,n3,n4)+ ",la suma es: " + methods.sumatoria(n1,n2,n3,n4)+ " y el promedio es: " + methods.promedio(n1,n2,n3,n4)) ;

    }
}
