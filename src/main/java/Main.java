import java.io.IOException;
import java.util.*;

public class Main {
   public static void main(String[] args) {

      ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle_de");
      Enumeration bundleKeys = labels.getKeys();

      while (bundleKeys.hasMoreElements()) {
         String key = (String)bundleKeys.nextElement();
         String value = labels.getString(key);
         System.out.println("key = " + key + ", " + "value = " + value);
      }
   }
}
