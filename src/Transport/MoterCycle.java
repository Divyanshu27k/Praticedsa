package Transport;

public class MoterCycle extends Vecicles {
    public String handleBarStyle;
    public String suspensionType;

    MoterCycle(String name, String model,int noofTyers,String handleBarStyle,String suspensionType){
        super(name, model, noofTyers);
        this.handleBarStyle=handleBarStyle;
        this.suspensionType=suspensionType;
    }
    public void wheelie(){
        System.out.println("MoterCycle is doing Wheeliee on national highway! " + name);
    }
}
