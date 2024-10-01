import java.util.*;
import java.io.*;

public class ClientList {
    private LinkedList<Client> clients = new LinkedList<Client>();

    public static ClientList instance() {
    if (clients == null) {
      return (clients = new ClientList());
    } else {
      return clients;
    }
  }

    public Client search(String ClientID){
        Client target = null;

        for (Client i : products) {
            if (i.getID().equals(ClientID)) {
                target = i;
                return target;
            }
        }
        return null;
    }

    public boolean insertClient(Client c){
        if(!this.clients.add(c)){
            return false;
        };
        return true;
    }

    public getClients() {
        return this.clients.iterator();
    }
}
