package kr.javacafe.lambda.apple;

/**
 * Created by Chihwan on 2017. 5. 11..
 */
public class Apple {
    private String color;
    private int weight;

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + color + ", " + weight + ")";
    }
}
