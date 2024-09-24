import java.util.Objects;
public class Athlete extends Person {    String sport;
    int place;
    public Athlete(String name, int age, String gender, String sport, int place) {        super(name, age, gender);
        this.sport = sport;        this.place = place;
    }
    public void introduce() {        super.introduce();
        System.out.println("Sport - " + sport + " Took place - " + place);        if (place <= 3){
            System.out.println("Congratulations!You entered the top three");        } else {
            System.out.println("Train harder and you got it");        }
    }
    public void work() {        System.out.println("Athlete is training");
    }
    @Override    public String toString() {
        return "Athlete{" +                "gender='" + gender + '\'' +
                ", age=" + age +                ", name='" + name + '\'' +
                ", place=" + place +                ", sport='" + sport + '\'' +
                '}';    }
    @Override
    public boolean equals(Object o) {        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;        if (!super.equals(o)) return false;
        Athlete athlete = (Athlete) o;        return place == athlete.place && Objects.equals(sport, athlete.sport);
    }
    @Override    public int hashCode() {
        return Objects.hash(super.hashCode(), sport, place);    }
}