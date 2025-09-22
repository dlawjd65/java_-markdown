public class floatanswer2 {
    public static void main(String[] args) {
        float var1 = 10f;
        float var2 = var1 / 100;
        if(Math.abs(var2 - 0.1) < 1e-6) {  // 방법 2. 부동소수점 비교의 일반적 관례
            System.out.println("10%입니다.");     
        }   else {
            System.out.println("10%가 아닙니다.");
        }
    }
}
