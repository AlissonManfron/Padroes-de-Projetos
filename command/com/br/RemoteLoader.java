package command.com.br;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCDOn = new StereoOnWithCDCommand(stereo);
        GarageDoorOpenCommand garageDoorOpenOn = new GarageDoorOpenCommand(garageDoor);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl.toString());

        remoteControl.onButtomWasPushed(0);
        remoteControl.offButtomWasPushed(0);
        remoteControl.undoWasPushed();



    }
}
