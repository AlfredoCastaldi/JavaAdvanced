public enum ContoBancarioTIpo {
    A ("bibo"),
    B("bibo2"),
    C("bibo3");
    private String nomeConto;
    private ContoBancarioTIpo(String str){
        this.nomeConto = str;
    }

    public String getNomeConto() {
        return nomeConto;
    }
}
