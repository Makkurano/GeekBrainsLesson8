public class Cat implements Actions {

    private int jumpDistance;
    private int runDistance;
    private String name;
    private String personType;

    Cat(String name, String personType, int runDistance, int jumpDistance) {
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
