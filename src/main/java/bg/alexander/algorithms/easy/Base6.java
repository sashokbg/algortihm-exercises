package bg.alexander.algorithms.easy;

public class Base6 {
    public static void main(String[] args) {
        int a=999;

        //pritntira chislo a ot desetichna v shestichna broina sistema

        // 0) ako a > 6 go to 1) else print a and stop
        // 1) delim 'a' na 6
        // 2) zapazvame rezultata 45/6
        // 3) namirame ostataka a-(45/6)*6
        // 4) printirame ostataka na ekrana
        // 5) a = rezultata ot 3
        // 6) REPEAT

        StringBuilder stringBuilder = new StringBuilder();
        do{
            int q = a/6;
            int r = a-(a/6)*6;
            stringBuilder.append(r);
            a=q;
        }while(a>0);

        print(stringBuilder.reverse());
    }

    private static void print(Object o){
        System.out.print(o);
    }
}
