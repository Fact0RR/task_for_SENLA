package task5;

public class SomeThing {
    private int volume;
    private int price;
    private String name = "name";

    ////
    public SomeThing(int volume, int price,String name) {
        this.volume = volume;
        this.price = price;
        this.name = name;
    }

    public SomeThing(int volume, int price) {
        this.volume = volume;
        this.price = price;
    }
////////


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}