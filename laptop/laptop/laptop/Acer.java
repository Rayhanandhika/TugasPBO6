package laptop;

public class Acer extends AbstractLaptop {
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Acer laptop is now ON.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Acer laptop is now OFF.");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 10;
            System.out.println("Acer volume increased to " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 10;
            System.out.println("Acer volume decreased to " + volume);
        }
    }
}
