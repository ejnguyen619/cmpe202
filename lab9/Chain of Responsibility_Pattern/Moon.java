public final class Moon {

    public static void main(final String[] args) {
        final Moon moon = new Moon();
        moon.startSpying(new Nasa());
        moon.startSpying(new Aliens());

        moon.land("An asteroid");
        moon.land("Apollo 11");
    }

    private final List<LandingObserver> observers = Lists.newCopyOnWriteArrayList();

    public void land(final String name) {
        for (final LandingObserver observer : this.observers) {
            observer.observeLanding(name);
        }
    }

    public void startSpying(final LandingObserver observer) {
        this.observers.add(observer);
    }

}