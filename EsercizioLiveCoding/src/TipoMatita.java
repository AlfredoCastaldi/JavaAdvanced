public enum TipoMatita {
    HB(6),
    H(3),
    B(1),
    B1(5);
    private int durezza;
    private TipoMatita(int _durezza){
        durezza = _durezza;
    }

    public int getDurezza() {
        return durezza;
    }
}
