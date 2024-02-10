package lesson_5.task1;

public class Animal {

    public static void main(String[] args) {

        Plate plate = new Plate(100);

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Кошка", "Lucky", "Orange", 100, 0, 5, 0);
        cat[1] = new Cat("Кошка", "Billy", "Cream", 100, 0, 15, 0);
        cat[2] = new Cat("Кошка", "Snowy", "White", 20, 0, 7, 0);

        Dog[] dog = new Dog[4];
        dog[0] = new Dog("Собака", "Buch", "Orange", 500, 10, 20, 0);
        dog[1] = new Dog("Собака", "Billy", "Cream", 150, 8, 20, 0);
        dog[2] = new Dog("Собака", "Snowy", "White", 300, 25, 20, 0);
        dog[3] = new Dog("Собака", "Blacky", "Black", 250, 10, 20, 0);

        System.out.println("У нас есть:  " + cat.length + " кошек");
        System.out.println("У нас есть:  " + dog.length + " собак");

        System.out.println("Все хотят кущать. Сейчас в миске " + plate.getFood() +
                " корма. \nПосмотрим насколько его хватит, в данный момент кошки  и собаки очень голодны и бегут к миске.\n");

        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.plusFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + "  корма и теперь сыт");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nКоты поели и в миске осталось " + plate.getFood() + "  корма.\n");
            System.out.println ("\nТеперь очередь собак");
            System.out.println("У нас их:  " + dog.length);
        } while (plate.getFood() <= 0);
        do {
            for (Dog j : dog) {

                if (j.getSatiety() == 0) {

                    if (!plate.checkFood(j.getAppetite())) {
                        plate.plusFood();
                    }
                    j.eat(plate);
                    System.out.println("Собака " + j.getName() + " съела " + j.getAppetite() + "  корма и теперь сыта");
                }
                j.setSatiety(j.getSatiety() - 1);
            }
            System.out.println("\nСобаки поели и в миске осталось " + plate.getFood() + "  корма.\n");
        } while (plate.getFood() <= 0);
        }
    }