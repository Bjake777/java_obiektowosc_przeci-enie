public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Adam","Kowalski");
        Student student2 = new Student("Kamil","Kaminski");
        Student student3 = new Student("Igor", "Kowalski");
        Student student4 = new Student("Igor", "Kowalski", 20, "igorek@gmail.com",123456);
        Student student5 = new Student("Michał","Bujak", 20, "michal@gmail.com",2345678);

        Student[] studenci = {student1, student2, student3, student4, student5};

        for (Student student : studenci) {
            student.opis();
        }
    }
}
