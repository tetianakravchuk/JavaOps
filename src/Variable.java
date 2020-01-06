import com.sun.tools.corba.se.idl.StructEntry;

public class Variable {

    public static void main(String[] args) {
        byte sizeInch = 13;
        short year = 2017;
        int ports = 3;
        long memory = 2133;
        float processor = 2.5f;
        double sizeCm = 33.02;
        char serialNumber = 'F';
        boolean dev = true;
        System.out.println(sizeInch);
        System.out.println(year);
        System.out.println(ports);
        System.out.println(memory);
        System.out.println(processor);
        System.out.println(sizeCm);
        System.out.println(serialNumber);
        System.out.println(dev);
        //or
        System.out.println(sizeInch + " " + year + " " + ports+ " " + memory + " " + processor + " " + sizeCm + " " + serialNumber + " " + dev);




    }
}
