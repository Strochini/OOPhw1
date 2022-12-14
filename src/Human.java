import java.util.jar.Attributes;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
            this.town = town;
            this.job = job;
    }
    public Human(String town, int yearOfBirth, String job) {
            this.yearOfBirth = yearOfBirth;
            name = "Default";
            this.town = town;
            this.job = job;
    }
    public Human(String name, String town, int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
            this.town = town;
            job = "Default";
    }
    public Human(int yearOfBirth, String name, String job) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
            town = "Default";
            this.job = job;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null) {
            this.town = town;
        } else {
            this.town = "Unknown";
        }
    }
}
