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

        obstacles[0].run(participants[0].getPersonType(), participants[0].getName(), participants[0].getRunDistance());
        for (int j = 0; j < participants.length; j++) {
            for (int i = 0; i < obstacles.length; i++) {
                obstacles[i].jump(participants[j].getPersonType(), participants[j].getName(), participants[j].getJumpDistance());
                obstacles[i].run(participants[j].getPersonType(), participants[j].getName(), participants[j].getRunDistance());
            }
        }
    }
}

