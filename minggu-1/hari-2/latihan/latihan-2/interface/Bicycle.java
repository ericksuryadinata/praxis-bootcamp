public interface Bicycle {

    // wheel revolutions per minute
    void changeCadence(int newValue);

    public void changeGear(int newValue);

    public void speedUp(int increment);

    public void applyBrakes(int decrement);
}