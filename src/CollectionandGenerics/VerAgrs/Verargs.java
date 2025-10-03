package CollectionandGenerics.VerAgrs;

public class Verargs{
    public static void main(String[] args) {
        System.out.println(sum(1,1,1,1,1 ,1,1,1,1));
    }

    public static int sum(int first, int second, int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
