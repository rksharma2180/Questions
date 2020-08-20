import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();        
        int y = s.nextInt();
        System.out.println("first Digit" + x + "." + " Second Digit " + y);    // Writing output to STDOUT
        
        int min = Math.min(x, y) / 2;
        int count  = 1;
        System.out.println(min);
        for (int i = 2; i <= min; i++) {
            if (x % i == 0 &&  y%i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
   }