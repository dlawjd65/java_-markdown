public class circle {
    public static void main(String[] args) {
        int var1 =10; // 반지름
        int var2 = 3; // 원주율 양수
        int var3 = 14; // 원주율 소수점

        String piString = var2 + "." + var3; // 원주율 만들기

        double pi = Double.parseDouble(piString); // 문자열을 double로 변환

        double var4 = var1*var1*pi;
        
        System.out.println("");
        System.out.println("원의 넓이"+var4);
    }
}
