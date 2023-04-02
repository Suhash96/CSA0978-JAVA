import java.io.*;

class FileReadWriteDemo {
   public static void main(String[] args) {
      String str = "WELCOME TO SSE";

      // Write the string to a file
      try {
         FileOutputStream fos = new FileOutputStream("test.txt");
         byte[] bytes = str.getBytes();
         fos.write(bytes);
         fos.close();
         System.out.println("String written to file successfully.");
      } catch (IOException e) {
         System.out.println("An error occurred while writing to file.");
         e.printStackTrace();
      }

      // Read the string from the file
      try {
         FileInputStream fis = new FileInputStream("test.txt");
         int content;
         while ((content = fis.read()) != -1) {
            System.out.print((char) content);
         }
         fis.close();
         System.out.println("\nString read from file successfully.");
      } catch (IOException e) {
         System.out.println("An error occurred while reading from file.");
         e.printStackTrace();
      }
   }
}