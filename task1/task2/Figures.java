package task2;

public class Figures {

    public static void main(String[] args) {

        Circle c = new Calculation();
        System.out.println("Фигура - Круг" + "\nДлина окружности равна:  " + c.lengthCircle(3.14, 5) +
                "\nПлощадь окружности равена:  " + c.areaCircle(3.14, 5) + "\nЦвет фона: Белый" + "\nЦвет границ: Красный");


        Rectangle r = new Calculation();
        System.out.println("\nФигура - Прямоугольник" + "\nПериметр прямоугольника равен:  " + r.perimeterRectangle(2, 5) +
                "\nПлощадь прямоугольника равена:  " + r.areaRectangle(2, 5) + "\nЦвет фона: Черный" + "\nЦвет границ: Желтый");

        Triangle t = new Calculation();
        System.out.println("\nФигура - Треугольник" + "\nПериметр треугольника равен:  " + t.perimeterTriangle(2, 5, 8) +
                "\nПлощадь треугольника равена:  " + t.areaTriangle(2, 10) + "\nЦвет фона: Фиолетовый" + "\nЦвет границ: Черный");

    }
}