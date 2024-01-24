public class Universitario {
    private String name;
    private String surname;
    private  String facolta;
    private int neededCredits = 300;
    public Universitario(String name, String surname, String facolta){
        this.name = name;
        this.surname = surname;
        this.facolta = facolta;

    }

    public int getNeededCredits() {
        return neededCredits;
    }
}
