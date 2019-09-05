public class User {
private int id;
private String name;
private String school;
    public int get_id() { return id; }

    public void set_id(int _id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
