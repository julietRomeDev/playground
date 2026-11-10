package class1;

public class DataTypes {
    
    public static void main(String[] args) {
        
        System.out.println("Data Types");

        System.out.println("--------");
        System.out.println();

        int integerData = 3; // Primitive data type
        float floatData = 3.14f; // Primitive data type
        double doubleData = 888; // Primitive data type
        char charData = 64; // Primitive data type, only accept ASCII code
        boolean booleanData = true;
        byte byteData = 125, byteData3 = 3, byteData4; // Primitive data type
        short shortData = 134;
        String stringData = "String!"; //Object data type
        byte useOfAdding = 10;
        byte useOfSubstraction = 10;
        System.out.println("Positive boolean data: " + booleanData);
        if (booleanData == true) {
            booleanData = false;
            System.out.println("Negative boolean data: " + booleanData);
        }
        System.out.println("Int PRIMITVE data type: " + integerData);
        System.out.println("float PRIMITIVE data type: " + floatData);
        System.out.println("double PRIMITIVE data type: " + doubleData);
        System.out.println("char PRIMITIVE ASCII data type: " + charData);
        System.out.println("string OBJECT data type: " + stringData);
        System.out.println("byte PRIMITIVE data: " + byteData);
        System.out.println("short PRIMITIVE data type: " + shortData);
        //Values of byte -> wrapper class
        System.out.println("bye MAX VALUE: " + Byte.MAX_VALUE);
        System.out.println("byte MIN VALUE: " + Byte.MIN_VALUE);
        System.out.println(++useOfAdding);
        System.out.println(++useOfSubstraction);
        System.out.println(--useOfSubstraction);

        

    }
}
