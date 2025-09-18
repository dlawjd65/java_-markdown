public class error {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';

        int intValue = byteValue;
        int intValue2 = charValue;
        // short shortValue = charValue;
        // Type missmatch : cannot convert from "char" to "short"
        double  doubleValue1 = charValue;
        double doubleValue2 = byteValue;

        System.out.println(intValue);
        System.out.println(intValue2);
        // System.out.println(shortValue);
        // char타입 보다 폭이 넓은 double같은 타입을 사용한다.
        System.out.println(doubleValue1);
        System.out.println(doubleValue2);
    }
}
