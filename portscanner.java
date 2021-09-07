import java.net.*;
 
class PortScanner {
   public static void main(String []args) {
      for (int port = 1; port <= 100; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", port), 2);
            socket.close();
            System.out.println("Port: " + port + " jest otwarty");
        } catch (Exception ex) {
           System.out.println("x");
        }
      }
   }
}
