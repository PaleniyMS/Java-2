public class Wall implements Trial{

    @Override
    public void doActivity(Team team) {
        jumpOver((Action) team);
    }

    private void jumpOver(Action action) {
        action.jump();
    }
}
