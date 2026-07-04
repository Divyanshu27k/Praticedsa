package Transport;

public class Car extends Vecicles {
    public int noOfDoor;
    public String transmissionType;

    Car(String name,String model,int noofTyers,int noOfDoor,String transmissionType){
    //superkeyword
     super(name,model,noofTyers);
     this.transmissionType=transmissionType;

//        Car(String name,String model,int noofTyers,int noOfDoor,String transmissionType){
//            super(name,model,noofTyers);
//
//            this.noOfDoor = noOfDoor;
//            this.transmissionType = transmissionType;
//        }


    }
    public void startAC(){
        System.out.println("Start ac : "  + name);
    }
}
