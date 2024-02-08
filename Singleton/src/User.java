import java.util.ArrayList;

public class User {
    private String name;
    private int eta;

    private static ArrayList<User> myUsers;
    public static ArrayList<User> getMyUsers(){
        if (myUsers == null){
            myUsers = new ArrayList<User>();
        }
        return myUsers;
    }
    public User(String name, int eta){
        this.name = name;
        this.eta = eta;
        getMyUsers().add(this);
    }


    public void printNameAndAge(){
        System.out.println(this.name + " " + this.eta);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
