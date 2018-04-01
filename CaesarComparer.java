import java.io.*;
import java.util.*;
public class CaesarComparer{
   public static void main(String[] args) throws IOException{
      final int num = 50000;
      String s = "";
      Scanner scanner = new Scanner(new FileReader("odyssey_shortened.txt"));
      while(scanner.hasNext()){
         s = s + Caesar.encrypt(scanner.nextLine(),48);
      }
      if(args[0].equalsIgnoreCase("encrypt")){
         Caesar.encrypt(s,48);
      }
      if(args[0].equalsIgnoreCase("decrypt")){
         Caesar.decrypt(s,48);
      }
      if(args[0].equalsIgnoreCase("encryptTwo")){
         Caesar.encryptTwo(s,48);
      }
      if(args[0].equalsIgnoreCase("decryptTwo")){
         Caesar.decryptTwo(s,48);
      }
   }
}
