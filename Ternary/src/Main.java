public class Main {
   /* public class Main {
   Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario

        private static String checkValue(int value) {
            String result = "";

            if (value % 5 == 0) {
                result = "FizzBuzz";
            } else  {
                result = "Buzz";
            }
            return result;
        }

    } */
   public static void main(String[] args) {
       for (int i = 1; i <= 100; i++) {
           System.out.println("Valore: " + i);
           System.out.println(checkValue(i));
       }
   }
    private static String checkValue(int value) {
        String result = "";
        result = value % 5 == 0 ? "Fizz" : "Buzz";

        return result;
    }
}
