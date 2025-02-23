package Task1.day21;

public class Main {
    static boolean contains(int a, int ... varargs){
        for (int num : varargs) {
            if(num == a){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(contains(5, 1, 2, 3, 4, 5));
        System.out.println(contains(6, 1, 2, 3, 4, 5));
    }
}
