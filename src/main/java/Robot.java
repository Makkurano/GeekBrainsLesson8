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

    @Override
    public void run(int r) {
        System.out.println(personType + " " + name + " Побежал");
    }
    @Override
    public void jump(int j) {
        System.out.println(personType + " " + name + " Поскакал");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPersonType() {
        return personType;
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpDistance() {
        return jumpDistance;
    }
}
