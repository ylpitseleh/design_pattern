package command.remote_control;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // 장치 생성
        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");
        Stereo stereo = new Stereo("거실");

        // 커맨드 객체
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // 리모컨 슬롯에 커맨드를 로드한다.
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off()); // Command에 execute() 뿐이면 람다식으로 사용할 수 있다.
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
//        remoteControl.setCommand(2, () -> stereo.on(), () -> stereo.off());

        System.out.println(remoteControl); // 리모컨 슬롯의 정보 출력

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        System.out.println();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        System.out.println();

        System.out.println("-- 매크로 ON --");
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, stereoOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);
        System.out.println("-- 매크로 OFF --");
        remoteControl.offButtonWasPushed(0);
    }
}
