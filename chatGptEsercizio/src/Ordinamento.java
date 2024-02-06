import java.util.Collection;

public abstract class Ordinamento implements Collection {

    public static Collection<?> orderList(Collection<?> list){

        for (Object element : list){
            System.out.println(element);
        }
        return list;
    }
}
