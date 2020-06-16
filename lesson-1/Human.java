public class Human implements Action, Team{
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s %s is runnig", this.getClass().getCanonicalName(), name);
        System.out.println();
    }

    @Override
    public void jump() {
        System.out.printf("%s %s is jumping", this.getClass().getCanonicalName(), name);
        System.out.println();
    }
}