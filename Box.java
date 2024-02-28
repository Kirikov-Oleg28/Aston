import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float fruitWeight = fruits.get(0) instanceof Apple ? 1.0f : 1.5f;
        return fruits.size() * fruitWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void transferFruits(Box<T> anotherBox)
    {
        if (this.getClass() != anotherBox.getClass())
        {
            return;
        }

        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
