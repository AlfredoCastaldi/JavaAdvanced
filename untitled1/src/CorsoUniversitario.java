public  class CorsoUniversitario {
    protected String  nome;
    protected String docente;
    protected int crediti;
    protected boolean passedTest = false;


    public CorsoUniversitario(String name, int crediti){
        this.nome = name;
        this.crediti = crediti;
    }
    public void hasPassed(){
        this.passedTest = true;
    }

    @Override
    public String toString() {
        return "CorsoUniversitario{" +
                "nome='" + nome + '\'' +
                ", docente='" + docente + '\'' +
                ", crediti=" + crediti +
                ", passedTest=" + passedTest +
                '}';
    }
}
