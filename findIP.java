import java.net.*;
 
public class findIP {
  public static void main (String[] args) {
    String hostname = "www.wp.pl";
 
    try {
      InetAddress ipaddress = InetAddress.getByName(hostname);
      System.out.println("Adres IP to: " + ipaddress.getHostAddress());
    } catch ( UnknownHostException e ) {
      System.out.println("Nie znaleziono, upewnij się że dany host istnieje: " + hostname);
    }
 
  }
}
    

