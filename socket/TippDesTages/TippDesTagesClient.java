package ch.trinat.edu.socket.TippDesTages;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TippDesTagesClient {

    public static void main(String[] args) {
        System.out.println("Client Start");
        new TippDesTagesClient().go();

    }

    public void go() {
        try(Socket s = new Socket("localhost", 8080)) {
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Ratschlag " + advice);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
