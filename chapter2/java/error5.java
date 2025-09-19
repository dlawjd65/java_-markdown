public class error5 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = (char)(c1 + 1); //방법 1
        char c3 = c1++;
        char c4 = ++c1; // * 전위 증감  

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
