public class Clock_01 {
    public static void main(String[] args) {
        //hour:[0-23]
        //minutes:[0-59]
        for(int i = 0; i <= 23; i++){
            for(int j = 0; j <= 59; j++){
                System.out.printf("%d:%d%n", i, j);
            }
        }
    }
}
