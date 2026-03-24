public class Lamp {
    boolean isOn; // Attribute [cite: 17]

    // Q6: Methods to turn on/off and print status [cite: 18]
    public void turnOn() {
        isOn = true;
        System.out.println("Light on status: " + isOn);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light on status: " + isOn);
    }
}