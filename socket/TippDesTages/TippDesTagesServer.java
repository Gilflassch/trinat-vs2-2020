package ch.trinat.edu.socket.TippDesTages;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TippDesTagesServer {
    public static void main(String[] args) {
        System.out.println("Server Start");
        new TippDesTagesServer().go();
    }



    public void go() {
        try(ServerSocket serverSock = new ServerSocket(8080)) {
            while(true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String tipp = getTipp();
                writer.println(tipp);
                writer.close();
                System.out.println(tipp);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String getTipp() {
        return "Soit pas bête!";
    }
}
