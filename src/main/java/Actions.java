public interface Actions {

    default void run(int distance) {
    }

    default void jump(int height) {
    }

    String getName();

    String getPersonType();

    int getRunDistance();

    int getJumpDistance();
}
