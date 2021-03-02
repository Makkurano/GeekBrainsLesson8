public interface Obstacle {

    default void run(String personType, String name, int distance) {

    }

    default void jump(String personType, String name,int h) {

    }
}
