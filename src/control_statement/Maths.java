package control_statement;

public class Maths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.07));
        System.out.println(Math.random());

        for (int i = 0; i < 10; i++){
            double rendom =(int) Math.round(Math.random() * 10000);
            System.out.println(rendom);
        }
    }
}
