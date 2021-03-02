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
    public void run(int r) {
        System.out.println(personType+ " " + name + " Побежал");
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
