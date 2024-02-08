public class Builder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    public Builder(){
    }
    public Person build () {
        if (this.firstName == null || this.lastName == null){
            throw new IllegalArgumentException("nome o cognome è null");
        }
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            throw new IllegalArgumentException("nome e cognome devono essere pieni");
        } else {
            return new Person(this);
        }
    }
    public void resetBuilder(){
        this.firstName = null;
        this.lastName = null;
        this.age = null;
        this.address = null;
    }
    public String getFirstName() {
        return firstName;
    }
    public Builder buildNameAndSurname(String name, String surname){
        this.firstName = name;
        this.lastName = surname;
        return this;
    }
    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {

        return age;

    }

    public String getAddress() {
        return address;
    }

    public Builder buildAddress(String address){
        this.address = address;
        return this;
    }
    public Builder buildAge(int age){
       this.age = age;
       return this;
    }
}
