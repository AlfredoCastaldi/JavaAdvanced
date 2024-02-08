public class Main {
    public static void main(String[] args){
        try{
            System.out.println(divideNumbers(4,null));
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
    public static Integer divideNumbers(Integer numeratore, Integer divisore) throws NullPointerException{

        if (divisore == null || numeratore == null){
            throw new NullPointerException("Cannot refer to null value");
        }
        return numeratore / divisore;
    }

}
