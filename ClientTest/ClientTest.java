import java.util.*;
import java.text.*;
import java.io.*;
public class ClientTest {
  
  public static void main(String[] s) {
    Client c1 = new Client("1", "Hassen");
    Client c2 = new Client("2", "Joe")

    ClientList list = ClientList.instance();
    list.insertClient(c1);
    list.insertClient(c2);

    Sytem.out.println(c1.getName() + " - Client Name");
    Sytem.out.println(c2.getName() + " - Client Name");
    Sytem.out.println(c1.getID() + " - Client ID");
    Sytem.out.println(c2.getID() + " - Client ID");

    System.out.println(list.getClients());
  }
}