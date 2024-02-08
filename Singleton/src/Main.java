public class Main {
    public static void main(String[] args){
        User user1 = new User("jack",23);
        User user2 = new User("jacddddk",223);

        for (User element : User.getMyUsers()){
            element.printNameAndAge();
        }
    }
}
