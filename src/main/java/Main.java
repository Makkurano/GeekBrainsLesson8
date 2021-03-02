public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", "Кот", 200, 50);
        Man man = new Man("Васёк", "Человек", 1000, 50);
        Robot robot = new Robot("Бендер", "Робот", 2000, 100);
       // Treadmill treadmill = new Treadmill(1000);
        Wall wall = new Wall(60);

        cat.run(20);
        //treadmill.run(cat.getPersonType(), cat.getName(), cat.getRunDistance());
    }

}

