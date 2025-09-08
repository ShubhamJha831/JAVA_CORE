package control_statement;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Ram", "Shyam", "Shubhamjha", "Sohan"
        };


        Printarray(array);

    }

    public static void Printarray(String[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
