public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1987, "Брэнд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "Методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "Продакт-менеджер");
        Human artem = new Human("Артем", "Москва", -1995, "Директор по развитию бизнеса");

        System.out.println("Пивет! Меня зовут " + maxim.name + ". Я из города " + maxim.town + ". Я родился в " + maxim.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + anya.name + ". Я из города " + anya.town + ". Я родился в " + anya.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родился в " + katya.yearOfBirth + " году. Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году. Будем знакомы!");
        System.out.println("");

        System.out.println("Пивет! Меня зовут " + maxim.name + ". Я из города " + maxim.town + ". Я родился в " + maxim.yearOfBirth + " году. Я работаю на должности " + maxim.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + anya.name + ". Я из города " + anya.town + ". Я родился в " + anya.yearOfBirth + " году. Я работаю на должности " + anya.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родился в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.job + ". Будем знакомы!");
        System.out.println("Пивет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.job + ". Будем знакомы!");
        System.out.println("");

        Human chuck = new Human("London", 1997, "Fucker");
        System.out.println("Пивет! Меня зовут " + chuck.name + ". Я из города " + chuck.town + ". Я родился в " + chuck.yearOfBirth + " году. Я работаю на должности " + chuck.job + ". Будем знакомы!");
    }
}