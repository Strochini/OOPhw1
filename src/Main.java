import java.text.DecimalFormat;

public class Main {
    public static String costFormat(double f) {
        return new DecimalFormat("#0.00").format(f);
    }

    public static String bouquetCost(Flower flow0, int amount0, Flower flow1, int amount1, Flower flow2, int amount2) {
        double bouquet = flow0.getCost() * amount0 + flow1.getCost() * amount1 + flow2.getCost() * amount2;
        bouquet = (bouquet / 100 * 10) + bouquet;
        return costFormat(bouquet);
    }

    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1987, "Брэнд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "Продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "Директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, "Безработный");

        System.out.println("Пивет! Меня зовут " + maxim.name + ". Я из города " + maxim.getTown() + ". Я родился в " + maxim.getYearOfBirth() + " году. Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + anya.name + ". Я из города " + anya.getTown() + ". Я родился в " + anya.getYearOfBirth() + " году. Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + katya.name + ". Я из города " + katya.getTown() + ". Я родился в " + katya.getYearOfBirth() + " году. Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() + " году. Будем знакомы!\n");

        System.out.println("Пивет! Меня зовут " + maxim.name + ". Я из города " + maxim.getTown() + ". Я родился в " + maxim.getYearOfBirth() + " году. Я работаю на должности " + maxim.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + anya.name + ". Я из города " + anya.getTown() + ". Я родился в " + anya.getYearOfBirth() + " году. Я работаю на должности " + anya.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + katya.name + ". Я из города " + katya.getTown() + ". Я родился в " + katya.getYearOfBirth() + " году. Я работаю на должности " + katya.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() + ". Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.job + ". Будем знакомы!\n");

        Human chuck = new Human("London", 1997, "Fucker");
        chuck.setYearOfBirth(-1);
        chuck.setTown(null);
        System.out.println("Пивет! Меня зовут " + chuck.name + ". Я из города " + chuck.getTown() + ". Я родился в " + chuck.getYearOfBirth() + " году. Я работаю на должности " + chuck.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + vladimir.name + ". Я из города " + vladimir.getTown() + ". Я родился в " + vladimir.getYearOfBirth() + " году. Будем знакомы!\n");

        Flower rose = new Flower("Роза", "Голландия", 35.59, 4);
        System.out.println(rose);

        Flower chrysanthemum = new Flower();
        chrysanthemum.setName("Хризантема");
        chrysanthemum.setCost(15);
        chrysanthemum.setLifeSpan(5);
        System.out.println(chrysanthemum);

        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        System.out.println(peony);

        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);
        System.out.println(gypsophila + "\n");
        System.out.println(bouquetCost(rose, 3, chrysanthemum, 5, gypsophila, 1));
    }
}