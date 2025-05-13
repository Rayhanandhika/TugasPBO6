package laptop;

public class Toshiba extends AbstractLaptop {
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Toshiba laptop is now ON.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Toshiba laptop is now OFF.");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 10;
            System.out.println("Toshiba volume increased to " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 10;
            System.out.println("Toshiba volume decreased to " + volume);
        }
    }
}
