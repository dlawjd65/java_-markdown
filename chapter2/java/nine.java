public class nine {
    public static void main(String[] args) {
        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";

        // 문자열을 double 로 바꾼 뒤 소수점 버림
        double var5 = Math.floor(Double.parseDouble(var4));
        // Double.parseDouble(var4) = 문자열을 숫자로 바꿈
        // Math.floor = 소수점 이하를 버리고 그 수보다 작거나 같은 가장 큰 정수를 
        // double 타입으로 돌려주는 메소드


        // int var5 = Integer.parseInt(var4)를 사용이 불가한 이유
        // Integer.parseInt() → 정수 문자열만 가능.

        int result = (int) (var1 + var2 + var3 + var5);

        System.out.println("");
        System.out.println(result);
    }
}
