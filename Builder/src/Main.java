public class Main {
    public static void main(String[] args){
        Builder build = new Builder();

        Person person1 = build.build();
        Person person2 = new Person(build.buildNameAndSurname("mitch","connor").buildAddress("via fasulla 123"));
        Person person3 = new Person(build.buildNameAndSurname("jhon", "AAAAA"));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
