public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i<1000; i++){
            boolean x = i%3 == 0;
            boolean y = i%5 == 0;
            if (x || y){
                counter += 1;
            }
        }
        System.out.println(counter);
    }


}