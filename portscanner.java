import java.net.*;
 
class PortScanner {
   public static void main(String []args) {
      for (int port = 1; port <= 500; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("212.77.98.9", port), 55);
            socket.close();
            System.out.println("Port: " + port + " jest otwarty");
        } catch (Exception ex) {
        }
      }
   }
}
