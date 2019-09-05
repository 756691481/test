package bean;
public class User {

    int id;
    String name;

    String school;

    public static int getId() {
        return getId();
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchool() {
        return getSchool();
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return ("id: " +id+ " name： " + name           + " school: " + school);
    }
}