package common;

public interface IBicycle {
    void applyBrakes(int decrement);
    void speedUp(int increment);
    void changeGear(int newValue);
}
