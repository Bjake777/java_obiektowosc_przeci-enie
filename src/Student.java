public class Student {
    String imie;
    String nazwisko;
    int wiek;
    String email;
    int indeks;

    public Student(String imie, String nazwisko, int wiek, String email, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.email = email;
        this.indeks = indeks;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void opis(){
        System.out.print("imie: " + imie + " nazwisko:" + nazwisko);
        if(wiek!=0) {
            System.out.print(" wiek: " + wiek + " email: " + email + "indeks: " + indeks);
        }
        System.out.println();
    }
}
