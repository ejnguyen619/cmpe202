public final class Aliens implements LandingObserver {

    @Override
    public void observeLanding(final String name) {
        if (name.contains("Apollo")) {
            System.out.println("They're distracted, lets invade earth!");
        }
    }

}