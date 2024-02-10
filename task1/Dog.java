package lesson_5.task1;

public class Dog extends Animal
{
    private final String type;
    private final String name;
    private final String color;
    private final int run;
    private final int swim;
    private final int appetite;
    private  int satiety;

    public Dog(String type, String name, String color, int run, int swim, int appetite, int satiety) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        this.appetite = appetite;
        this.satiety = 0;
    }
    public String toString() {
        return String.format("\nЖивотное: %s \t Имя:  %s \t  Цвет:  %s \t" +
                "Пробежит:   %s \t Плавать не умеет:  %s" +
                "\t Cытость:  %s" ,type,name,color,run, swim,appetite, satiety);
    }

    String getType() {
        return type;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getRun() {
        return run;
    }

    int getSwim() {
        return swim;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this. satiety = satiety;
    }

    void eat(Plate p) {
        p.minusFood(appetite);
    }
}
