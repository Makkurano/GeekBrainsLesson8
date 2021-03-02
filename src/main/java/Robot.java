public class Robot implements Actions {

    private final int jumpDistance;
    private final int runDistance;
    private final String name;
    private final String personType;

    Robot(String name, String personType, int runDistance, int jumpDistance) {
        this.name = name;
        this.personType = personType;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;

    }

    public void run(int r) {
        System.out.println(personType+ " " + name + "Побежал");
    }
    public void jump(int j) {
        System.out.println(personType+ " " + name + "Поскакал");
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public String getName() {
        return name;
    }

    public String getPersonType() {
        return personType;
    }
}
