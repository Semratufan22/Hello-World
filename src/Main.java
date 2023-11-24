// Main.java
public class Main {
   static final String[] sizes = {"Small", "Medium", "Large"};

   public static void main(String[] args) {
      // Same Customer for all
      String customerName = "John Doe";
      String phoneNumber = "+31612345678";

      // Small pizza
      printOrder((byte) 0, 7.99F, (byte) 6, false, customerName, phoneNumber);

      // Medium pizza
      printOrder((byte) 1, 10.99F, (byte) 8, true, customerName, phoneNumber);

      // Large pizza
      printOrder((byte) 2, 13.99F, (byte) 10, false, customerName, phoneNumber);
   }

   public static void printOrder(byte size, float price, byte slices, boolean isVegetarian, String customerName, String customerPhone) {
      System.out.printf(
              """
              Pizza Order Details:
              Size: %s
              Price: $%.2f
              Slices: %d
              Vegetarian: %s
              Customer Name: %s
              Phone Number: %s
                                      
              """, humanReadableSize(size), price, slices, humanReadableBoolean(isVegetarian), customerName, customerPhone
      );
   }

   public static String humanReadableSize(byte size) {
      byte safeSize = (byte) Math.max(size, 0);
      if (size > sizes.length - 1) {
         safeSize = (byte) (sizes.length - 1);
      }
      return sizes[safeSize];
   }

   public static String humanReadableBoolean(boolean bool) {
      return bool ? "Yes" : "No";
   }


            int pizzaPiece = 3; // Sipariş edilen pizza adedi
            double unitPrice = 10.0; // Bir pizza birim fiyatı
            double discountRate = 0.10; // Yüzde 10 indirim oranı

            double totalPrice = pizzaPiece  * unitPrice; // Toplam fiyat hesaplanır


         }



