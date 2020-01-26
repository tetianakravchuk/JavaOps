public class WolfTest {
    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        wolf.name = "Johny";
        System.out.println(wolf.name);
        wolf.age = 10;
        System.out.println(wolf.age);
        wolf.sex = "Male";
        System.out.println(wolf.sex);
        wolf.weight = 8;
        System.out.println(wolf.weight);
        wolf.color = "Ginger";
        System.out.println(wolf.color);

        wolf.run();
        wolf.bark();
        wolf.hunt();
        wolf.sit();
        wolf.walk();
    }

}