public class dustks {
    public static void main(String[] args) {
        int value = 0;
        value = value += 10; // a = (a + b), 결과 10
        value = value -= 10; // a = (a - b), 결과 0 (10-10)
        value = value *= 10; // a = (a * b), 결과 0 (0*10)
        value = value /= 10; // a = (a / b), 결과 0 (0*10)

        System.out.println("");
        System.out.println(value);
    }
}
