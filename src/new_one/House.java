package new_one;

public class House {
    private int house;

    House(){
        this(1);
    }
    House(int house){
        this.house=house;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}
