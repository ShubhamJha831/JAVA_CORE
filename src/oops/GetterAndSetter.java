package oops;

public class GetterAndSetter {
    private String color;

    private String model;

    private double furelLevel;

    private long CostOfPurchase;


    public GetterAndSetter(String color, String model, double furelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.furelLevel = furelLevel;
        this.CostOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

    public void Setcolor(String color){
        this.color = color;
    }


    public String getModel(){
        return model;
    }
}
