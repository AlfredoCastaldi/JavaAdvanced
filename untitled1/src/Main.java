public class Main {

    public static void main(String[] args){
        Studente student1 = new Studente("mario","rossi","ingegneria");
        student1.sostieniEsame("ingegneria1",10);
        student1.svolgiEsame(1);
        System.out.println(student1.neededCredits());
        student1.getAllExams();
    }
}
