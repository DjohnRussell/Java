import java.io.*;
import java.net.*;
public class Klientmaskin {

    public static void main(String[] argv) throws IOException {

        String sendetekst=" Tekst som er sendt.... ";
        if(argv.length != 0)
            sendetekst = argv[0];

        Socket klientSocket = new Socket("localhost", 7004);
        PrintWriter ut = new PrintWriter(
                klientSocket.getOutputStream(), true);
        BufferedReader inn = new BufferedReader(
                new InputStreamReader(klientSocket.getInputStream()));

        ut.print(sendetekst + "\r\n");
        ut.flush();

        String svartekst = inn.readLine();
        System.out.println("Svar fra Tjenermaskin: " + svartekst);

        klientSocket.close();


    }
}