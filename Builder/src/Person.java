public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public Person(Builder build1){
       this.firstName = build1.getFirstName();
       this.lastName = build1.getLastName();
       this.age = build1.getAge();
       this.address = build1.getAddress();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
