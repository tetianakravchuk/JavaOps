public class WolfTest {
    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        wolf.setName("Johny");
        wolf.setAge(10);
        wolf.setSex("Male");
        wolf.setWeight(8);
        wolf.setColor("Ginger");

        System.out.println(wolf.getName());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getSex());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getColor());
        
        wolf.run();
        wolf.bark();
        wolf.hunt();
        wolf.sit();
        wolf.walk();
    }

}