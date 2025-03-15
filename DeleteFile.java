//Q1 iii. delete a file

import java.io.File;

public class DeleteFile {
   public DeleteFile() {
   }

   public static void main(String[] var0) {
      File var1 = new File("updated_example.txt");
      if (var1.exists()) {
         if (var1.delete()) {
            System.out.println("File deleted successfully: " + var1.getName());
         } else {
            System.out.println("Failed to delete the file.");
         }
      } else {
         System.out.println("The file does not exist.");
      }

   }
}