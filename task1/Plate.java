package lesson_5.task1;

public class Plate {
    private int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void minusFood(int n) {
        food -= n;
    }

    void plusFood() {
        this.food += 100;
        System.out.println("\nКорма не хватило и в миску добавим еще 100 корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}