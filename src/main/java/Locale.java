import java.util.Enumeration;
import java.util.ResourceBundle;

public class Locale {

   public void setLocale(String nums){
      ResourceBundle labels = ResourceBundle.getBundle(String.valueOf(nums));
      Enumeration bundleKeys = labels.getKeys();

      while (bundleKeys.hasMoreElements()) {
         String key = (String)bundleKeys.nextElement();
         String value = labels.getString(key);
         System.out.println("key = " + key + ", " + "value = " + value);
      }
   }
}
