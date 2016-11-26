/**
 * Created by Lenovo on 2016-11-24.
 */
public class Executor {
    Command command;

    void setCommand(Command c){
        this.command = c;
    }

    void executeCommand(){
        command.execute();
    }
}
