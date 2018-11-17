public final class Nasa implements LandingObserver {
    @Override
    public void observeLanding(final String name) {
        if (name.contains("Apollo")) {
            System.out.println("We made it!");
        }
    }
}