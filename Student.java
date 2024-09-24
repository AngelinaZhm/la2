public class Student extends Person {    String university;
    int course;
    public Student(String name, int age, String gender, String university, int course) {        super(name, age, gender);
        this.university = university;        this.course = course;
    }
    @Override    public void introduce() {
        super.introduce();        if (course == 4) {
            System.out.println("University: "+university+", Course: "+course+" - It's a final year!");        } else {
            System.out.println("University: "+university+", Course: "+course);        }
    }
    @Override    public void work() {
        if (university.equalsIgnoreCase("LDUBGD")){            System.out.println("You are teaching in the best university!");
        } else {            System.out.println("Your university is not bad");
        }    }
}