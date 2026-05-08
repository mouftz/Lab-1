public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int counter = 0;
        while (n > 0){
            if (n % 2 == 0) {
                n = n/2;
                counter+=1;
            }
            else {
                n = n-1;
                counter+=1;
            }
        }
        System.out.println(counter);
    }
}
