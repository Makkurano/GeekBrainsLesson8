public interface Obstacle {

    default void jump(String personType, String name,int h) {
    }

    default void run(String personType, String name, int distance) {
    }
}
