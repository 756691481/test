public class Bm {
     private int id;
  private String name;
  private String qq;
 private String school;
 private String hope;
 private String number;
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

 public String getQq() {
  return qq;
 }

 public void setQq(String qq) {
  this.qq = qq;
 }

 public String getSchool() {
  return school;
 }

 public void setSchool(String school) {
  this.school = school;
 }

 public String getHope() {
  return hope;
 }

 public void setHope(String hope) {
  this.hope = hope;
 }

 public String getNumber() {
  return number;
 }

 public void setNumber(String number) {
  this.number = number;
 }

 @Override
 public String toString() {
  return "Bm{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", qq='" + qq + '\'' +
          ", school='" + school + '\'' +
          ", hope='" + hope + '\'' +
          ", number='" + number + '\'' +
          '}';
 }
    }
