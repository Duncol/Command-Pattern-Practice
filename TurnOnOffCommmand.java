/**
 * Created by Lenovo on 2016-11-24.
 */
public class TurnOnOffCommmand extends Command {
    TurnOnOffCommmand(Device d){
        this.device = d;
    }
    void execute(){
        device.action();
    }
}
