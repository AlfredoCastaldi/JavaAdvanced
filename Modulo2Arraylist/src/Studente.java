public class Studente {
    private String name;
    private int age;

    public Studente(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
