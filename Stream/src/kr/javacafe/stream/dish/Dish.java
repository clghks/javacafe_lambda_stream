package kr.javacafe.stream.dish;

/**
 * Created by Chihwan on 2017. 5. 26..
 */
public class Dish {
    public enum Type {
        MEAT, FISH, OTHER
    }

    private final String name;
    private final boolean vegtarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegtarian, int calories, Type type) {
        this.name =name;
        this.vegtarian = vegtarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegtarian() {
        return vegtarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
