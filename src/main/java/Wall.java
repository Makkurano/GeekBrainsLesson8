public class Wall {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void jump(String personType, String name,int h) {
        if (h <= height) {
            System.out.println(personType + name + " успешно преодолел препятствие");
        } else {
            System.out.println(personType + name + " не смог преодолеть препятствие");
        }
    }
}