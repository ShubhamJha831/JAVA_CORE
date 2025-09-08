package control_statement;

public class Continue {
        public static void main(String[] args) {
            System.out.println("before loop");
            for (int i = 1; i <= 100; i++){
                if (i == 90){
                    continue;
                }
                System.out.println(i);
            }
            System.out.println("out of loop");
        }


}
