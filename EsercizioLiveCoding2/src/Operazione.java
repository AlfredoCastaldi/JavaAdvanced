import java.util.ArrayList;

public enum Operazione{
    operazione1(2,"pulire i cessi"),
    operazione2(4,"pulire le scrivanie"),
    operazione3(6,"spengere i computer");

    private int livelloResponsabilità;
    private String mansioneDaSvolgere;

    private Operazione(int livelloResponsabilità, String mansioneDaSvolgere){

        this.livelloResponsabilità = livelloResponsabilità;
        this.mansioneDaSvolgere = mansioneDaSvolgere;
    }

    public int getLivelloResponsabilità() {
        return livelloResponsabilità;
    }

    public String getMansioneDaSvolgere() {
        return mansioneDaSvolgere;
    }
}
