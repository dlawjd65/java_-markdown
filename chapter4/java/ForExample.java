public class ForExample {
    public static void main (String[] args) {
        for (int m=2; m<=9; m++) {
            System.out.println("***" + m + "단 ***");
            for (int n=1; n<=9; n++) {
                System.out.println(m + "x" + n + "=" + (m*n));
            }
        }          
    }
}
// 중첩 for문에서 변수명을 m, n으로 정한 것은 작성자의 선택
// 짧고 간단하게: 반복 카운터는 i, j, k처럼 한 글자로도 관례적으로 사용.