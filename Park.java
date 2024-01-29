import java.util.Arrays;

public class Park
{


    private static class Atraction {
        String name;
        String workTime;
        int price;

        public Atraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public String toString() {
            return String.format("Название аттракцирна: %s \n Время работы: %s \n Цена: %s \n",
                    name, workTime, price);
        }
    }


        public static void main(String[] args) {

            Atraction[] atrArray = new Atraction[3];
            atrArray[0] = new Atraction("Колесо", "11 - 20", 500);
            atrArray[1] = new Atraction("Труба", "11 - 20", 300);
            atrArray[2] = new Atraction("Горка", "11 - 20", 200);


            System.out.println(Arrays.toString(atrArray));
        }
    }
