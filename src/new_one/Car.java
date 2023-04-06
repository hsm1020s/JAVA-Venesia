package new_one;

public class Car { //기본값 1
    private int car;

    Car(){
        this(1);
    }
    Car(int car){
        this.car=car;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }
}
