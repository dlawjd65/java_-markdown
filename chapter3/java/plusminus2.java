public class plusminus2 {
    public static void main(String[] args) {
        int x = 5;

        int a = ++x; // 전위 증가
        System.out.println("");
        System.out.println("x=" + x + ", a=" + a);
        // x=6, a=6 (x가 먼저 6이 되고 그 값이 a에 대입)

        x = 5;
        int b = x++; // 후위 증가
        System.out.println("x=" + x + ", b=" + b);
        // x=6, b=5 (b에는 증가 전 값 5가 들어가고, x는 나중에 6이 됨)

    }
}
