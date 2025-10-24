package week2;

public class MountainBike extends Bicycle {
    int suspension = 1;

    public void chSuspension(int newValue){
        if(newValue > 0){
            changeSuspension(newValue);
        }
    }

    private void changeSuspension(int newValue) {
        suspension = newValue;
    }


}
