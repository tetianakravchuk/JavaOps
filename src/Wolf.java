public class Wolf {
 private String sex;
 private String name;
 private int weight;
 private int age;
 private String color;

 public void walk() {

 }

 public void sit() {

 }

 public void run() {

 }

 public void bark() {

 }

 public void hunt() {

 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  if(age >8){
   System.out.println("Age is incorrect");
  }
  this.age = age;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public int getWeight() {
  return weight;
 }

 public void setWeight(int weight) {
  this.weight = weight;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getSex() {
  return sex;
 }

 public void setSex(String sex) {
  this.sex = sex;
 }
}
