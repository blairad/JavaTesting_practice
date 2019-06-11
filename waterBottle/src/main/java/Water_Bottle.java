public class Water_Bottle {

    private int volume;
    private int drink;
    private int empty;

    public Water_Bottle(int volume, int drink, int empty) {
        this.volume = volume;
        this.drink = drink;
        this.empty = empty;
    }

    public int getVolume() {
        return (volume);
    }

    public int getDrink() {
        return (volume - drink);
    }
    public boolean isEmpty() {
        return (empty == 0);
    }

    public int refillIfEqualToZero() {
        return (empty);
    }
}
