package CHALLANGES;

class Challange_no_73 {
    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        Challange_no_73 dice = new Challange_no_73();
        for(int i = 0; i < 10; i++){
            System.out.println(dice.roll());
        }
    }
}
