public class error4 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;
        int i1 = 3;
        int i2 = 4;
        // short result1 = s1 + s2;
        // 이 연산의 결과는 int 타입으로 강제 변환 타입에 해당
        short result1 = (short) (s1 + s2); // -> 컴파일 가능
        int result2 = i1 + i2;
        int result3 = s1 + s2; //short말고 int로 작성 가능

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}


// byte, short, char 타입의 변수 간 산술 연산은 
// 항상 int 결과를 반환하므로, 
// 더 작은 타입에 할당하려면 캐스팅이 필요합니다.

// s1 + s2 부분만 보면 → int이지만
// (short) (s1 + s2)에서 (short)로 캐스팅한 부분까지는 short타입이다.