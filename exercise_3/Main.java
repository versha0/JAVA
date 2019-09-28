import java.io.File;

class Main {
   public static void main(String[] args) {      
      File f = null;
      // File f1 = null;
      String v;
      boolean bool = false;
      
      try {
         // create new files
         f = new File("/home/cgi/Desktop/javaa/exercise_3/FileList.java");
        //  f1 = new File("C:\\Program Files");
         
         // get file name or directory name
         v = f.getName();
        //  v1 = f1.getName();
         
         // true if the file path exists
         bool = f.exists();
         
         // if file exists
         if(bool) {
         
            // prints
            System.out.println("File name: "+v);
         }
         
      } catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
}