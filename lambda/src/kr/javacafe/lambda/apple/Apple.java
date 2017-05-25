package kr.javacafe.lambda.apple;

/**
 * Created by Chihwan on 2017. 5. 11..
 */
public class Apple {
    private String color;
    private Integer weight;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + color + ", " + weight + ")";
    }
}
