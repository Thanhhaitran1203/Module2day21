public class Main {
    public static void main(String[] args) {
        TongGiamDoc a = TongGiamDoc.getInstance("1","AAA");
        System.out.println(a);
        TongGiamDoc b = TongGiamDoc.getInstance("2","BBB");
        System.out.println(b);
    }
}