/**
 * Created by Lenovo on 2016-11-24.
 */
public class Main {
    public static void main(String[] args){
        Command command = new TurnOnOffCommmand(new Engine());
        Executor executor = new Executor();
        executor.setCommand(command);
        executor.executeCommand();
        executor.executeCommand();
    }



}
