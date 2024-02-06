import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[]args) {

        String[] myStrs = {"ciao","Abc","zzzzz","ZZZZ"};
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(myStrs));

        Ordinamento.orderList(myList);

    }
}
