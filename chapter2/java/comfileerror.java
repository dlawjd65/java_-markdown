public class comfileerror {
    public static void main(String[] agre) {
        int v1 = 0;
        if (true) {
            int v2 = 0;
            int v3 = 0; // <-- 블록 스코프 밖에서 선언
            if (true) {
                v1 = 1;
                v2 = 1;
                v3 = 1;
            }
            v1 = v2 + v3;
        }
        System.out.println(v1);

    }
}
