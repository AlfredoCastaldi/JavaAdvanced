public class Studente {
    private String nome = "gianni";
    private Arancia pastoStundente = new Arancia("blu",11);

    public void saluta(){
        System.out.println("ciao sono " + this.nome);
    }

    public Arancia getPastoStundente() {
        return pastoStundente;
    }

    public String getNome() {
        return nome;
    }
}
