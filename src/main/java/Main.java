public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", "Кот", 200, 50);
        Man man = new Man("Васёк", "Человек", 1000, 40);
        Robot robot = new Robot("Бендер", "Робот", 2000, 100);
        Treadmill treadmill = new Treadmill(1000);
        Wall wall = new Wall(60);

        Actions[] participants = new Actions[3]; {
            participants[0] = cat;
            participants[1] = man;
            participants[2] = robot;}

        Obstacle[] obstacles = new Obstacle[2]; {
            obstacles[0] = treadmill;
            obstacles[1] = wall;
        }

        participants[0].run(20);
        participants[1].jump(50);
        obstacles[1].jump(cat.getPersonType(), cat.getName(), cat.getJumpDistance());
    }

}

