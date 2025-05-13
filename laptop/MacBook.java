package laptop;

public class MacBook extends AbstractLaptop {
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("MacBook is now ON.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("MacBook is now OFF.");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 10;
            System.out.println("MacBook volume increased to " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 10;
            System.out.println("MacBook volume decreased to " + volume);
        }
    }
}
