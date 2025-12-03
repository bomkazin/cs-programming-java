public class NumberOrder {
    public static void main(String[] args){
        int d = Integer.parseInt(args[0]);
        int e = Integer.parseInt(args[1]);
        int f = Integer.parseInt(args[2]);

        int min = Math.min(d, Math.min(e,f));
        int max = Math.max(d, Math.max(e,f));
        int midNum = d + e + f - min - max;

        System.out.println(min);
        System.out.println(midNum);
        System.out.println(max);
    }
}
