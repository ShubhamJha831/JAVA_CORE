package control_statement;

public class Break {
    public static void main(String[] args) {
        System.out.println("before loop");
        for (int i = 1; i <1000; i++){
            if (i == 101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }
}
