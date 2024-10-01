import java.util.*;
import java.io.*;

public class Client {
  private string id;
  private string name;
  
  private LinkedList<WishItem> WishList = new LinkedList<WishItem>();

  public Client(string id, string name){
    this.id = id;
    this.name = name;
  }

  public String getID(){
    return this.id;
  }

  public int getName(){
      return this.name;
  }

  public void setName(String name) {
    this.name = name
  }
}