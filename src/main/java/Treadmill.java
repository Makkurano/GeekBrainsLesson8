public class Treadmill implements Obstacle {
    int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void run(String personType, String name, int distance) {
        if (lenght <= distance) {
            System.out.println(personType + " " + name + " успешно преодолел расстояние");
        } else {
            System.out.println(personType + " " + name + " не смог преодолеть расстояние");
        }
    }


}