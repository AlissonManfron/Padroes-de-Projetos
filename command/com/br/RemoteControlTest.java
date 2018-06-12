package command.com.br;

public class RemoteControlTest {
    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("Luz");
        GarageDoor door = new GarageDoor();

        LightOnCommand command = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);

        remote.setCommand(command);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
    }
}
