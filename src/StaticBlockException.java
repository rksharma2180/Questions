public class StaticBlockException {
   static int i, j;
   static {
      System.out.println("In the static block");
      try {
         i = 0;
         j = 10/i;
      } catch(Exception e){
         System.out.println("Exception while initializing" + e.getMessage());
         throw new RuntimeException(e.getMessage());
      }
   }
   public static void main(String args[]) {
      StaticBlockException sbe = new StaticBlockException();
      System.out.println("In the main() method");
      System.out.println("Value of i is : "+i);
      System.out.println("Value of j is : "+ j);
   }
}