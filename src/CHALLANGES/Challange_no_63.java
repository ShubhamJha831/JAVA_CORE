package CHALLANGES;


import Arrays.arrayUtility;

class Challange_no_63 {
    public static void main(String[] args) {
        int[] arr = arrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if(max < num){
                max = num;
            }
        }
        System.out.println("maximum number is" +max);
    }

}
