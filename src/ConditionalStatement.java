public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 12;
        boolean isMale = true;
        boolean isFemale = true;
        int height = 165;
        String firstLetterInName = "S";

        if (age > 20) {
            System.out.println("Age is over 20");
        }
        if (isMale) {
            System.out.println("This is a male");
        }
        if (isFemale) {
            System.out.println("This is a female");
        }
        if (height < 1.80) {
            System.out.println("Height is under 1.80");
        }else{
            System.out.println("Height is above 1.80");
        }
        if (firstLetterInName == "M") {
            System.out.println("The first letter in the name is M");
        } else if ((firstLetterInName == "I")) {

            System.out.println("The first letter in the name is I");
        } else{
            System.out.println("The first letter in the name is unknown");

        }
    }
}
