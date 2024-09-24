public class Main {    public static void main(String[] args) {
    Person person = new Person("Marta", 10, "female");        person.introduce();
    person.work();
    System.out.println();
    Student student1 = new Student("Ostap", 21, "male", "LNU", 4);
    student1.introduce();
    student1.work();
    System.out.println();
    Student student2 = new Student("Maria", 19, "female", "ldubgd", 2);
    student2.introduce();
    student2.work();
    System.out.println();
    Cadet cadet = new Cadet("Max", 15, "male","Radoviy","LDUBGD");        cadet.introduce();
    cadet.work();
    System.out.println();
    Athlete athlete1 = new Athlete("Olya", 23, "female", "volleybal", 1);
    athlete1.introduce();
    athlete1.work();
    System.out.println();
    Athlete athlete2 = new Athlete("Tanya", 19, "female", "karate", 4);        athlete2.introduce();
    athlete2.work();
    System.out.println();
    Athlete athlete3 = new Athlete("Oleg", 22, "male", "football", 3);
    System.out.println(athlete1.toString());
    System.out.println(athlete3.toString());
    System.out.println(athlete1.equals(athlete3));
    System.out.println(athlete2.hashCode());
    System.out.println();
    System.out.println(person);
    System.out.println(student1);
    System.out.println(cadet);
    }
}