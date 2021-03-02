public class Treadmill {
    int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    public void run(String personType, String name, int distance) {
        if (distance <= lenght) {
            System.out.println(personType + name + " успешно преодолел расстояние");
        } else {
            System.out.println(personType + name + " не смог преодолеть расстояние");
        }
    }


}