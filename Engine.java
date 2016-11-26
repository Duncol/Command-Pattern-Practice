/**
 * Created by Lenovo on 2016-11-24.
 */
public class Engine implements Device {
    boolean isTurnedOn;

    Engine(){
        this.isTurnedOn = false;
    }

    public void action(){
        if (this.isTurnedOn == false){
            this.isTurnedOn = true;
            System.out.println("Fuel is pumpin' engines");
        }
        else{
            this.isTurnedOn = false;
            System.out.println("Pistons are slowing and... it's done");
        }
    }
}
