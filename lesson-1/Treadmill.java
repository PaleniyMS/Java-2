public class Treadmill implements Trial{

    @Override
    public void doActivity(Team team) {
        run((Action) team);
    }

    private void run(Action action) {
        action.run();
    }
}
