import java.io.*;
import java.net.*;



public class Tjenermaskin {



    public static void main(String[] args) throws IOException {

        System.out.println("Tjenermaskin er startet.... ");
        ServerSocket tjenerSocket = new ServerSocket(7004);

        while(true){
            Socket koplingSocket = tjenerSocket.accept();

            BufferedReader innput = new BufferedReader(
                    new InputStreamReader(koplingSocket.getInputStream()));
            PrintWriter utTilKlient = new PrintWriter(
                    koplingSocket.getOutputStream(), true);

            String melding = innput.readLine();
            utTilKlient.print("Wow det virket:))) " + melding + "\r\n");
            utTilKlient.flush();
        }

    }
}






