public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void jump(String personType, String name,int h) {
        if (h <= height) {
            System.out.println(personType + " " + name + " успешно преодолел препятствие");
        } else {
            System.out.println(personType + " " + name + " не смог преодолеть препятствие");
        }
    }
}