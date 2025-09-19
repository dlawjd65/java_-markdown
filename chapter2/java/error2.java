public class error2 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 10;
        String StrValue ="A";
        char ch = StrValue.charAt(0); 
        // String 타입에서 char타입으로 변환하기 위해 필요한 코드
        // charAt(int index) 메서드는 문자열에서 지정한 위치의 단일 문자 하나를 꺼냄
        // 인덱스는 0부터 시작하므로 charAt(0) 은 첫 번째 글자를 의미

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
        // char var4 = (char) strValue;
        // cannot cast from String to char
        // 강제타입변환에서 문자를 숫자열로 바꿀 수 없지만 
        // 유니코드와 int를 활용하여 숫자로 변경 가능
        int var4 = (int) ch; //      
        

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(charValue + " -> " + (int) charValue);
        System.out.println(var4);
    }
}
