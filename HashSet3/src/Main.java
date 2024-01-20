import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        HashSet<Integer> prova = getHashSet(10);
        removeElement(2, prova);
       System.out.println(prova);
    }

    public static HashSet<Integer> getHashSet(int input){

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < input; i++){
            hashSet.add(i);
        }
        return hashSet;
    }
    public static void removeElement(Integer num, HashSet<Integer> mySet){
        Boolean isContained = false;
        Iterator myIterator = mySet.iterator();

        while (myIterator.hasNext()){
            if (myIterator.next().equals(num)){
                isContained = true;
            }
        }
        if (isContained == true){
        mySet.remove(num);}
    }
}