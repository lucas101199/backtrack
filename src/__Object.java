public class __Object {

    public int weight;
    public int value;
    public int ratio;

    public __Object(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = weight/value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public int getRatio() {
        return ratio;
    }
}
