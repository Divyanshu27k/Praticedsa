package Transport;

public class Vecicles {
    String name;
    String model;
    int noofTyers;

    Vecicles(){
        this.name="";
        this.model="";
        this.noofTyers=-1;
    }
    Vecicles(String name,String model,int noofTyers){

        this.name=name;
        this.model=model;
        this.noofTyers=noofTyers;
    }
   public void startEngine(){
        System.out.printf("Engine is Starting of %s (%s)%n", name, model);

    }

   public   void stopEngine(){
         System.out.printf("Engine is Stop of %s (%s)%n" , name, model);

     }

}
