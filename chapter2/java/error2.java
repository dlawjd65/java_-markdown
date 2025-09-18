public class error2 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue =5.7;
        String strValue ="A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
        // char var4 = (char) strValue;
        // cannot cast from String to char
        // 강제타입변환에서 문자를 숫자열로 바꿀 수 없지만 
        // 유니코드와 int를 활용하여 숫자로 변경 가능

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(charValue + " -> " + (int) charValue);
    }
}
