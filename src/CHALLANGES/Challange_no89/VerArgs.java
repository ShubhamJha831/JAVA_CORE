package CHALLANGES.Challange_no89;

class VerArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Shubham"));
        System.out.println(concatenate("Jha", "bhai"));
        System.out.println(concatenate("Shubham", "anna"));
    }
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
