package structural.adapter;

// Adapter que adapta o sistema antigo (em mph) para o sistema novo (em km/h)
class RocketAdapter implements NewRocketSystem {
    private OldRocketSystem oldRocket;

    public RocketAdapter(OldRocketSystem oldRocket) {
        this.oldRocket = oldRocket;
    }

    @Override
    public void setSpeedInKMH(double speedInKMH) {
        // Convertendo a velocidade de km/h para mph (1 km/h = 0.621371 mph)
        double speedInMPH = speedInKMH * 0.621371;
        System.out.println("Convertendo " + speedInKMH + " km/h para " + speedInMPH + " mph.");
        oldRocket.setSpeedInMPH(speedInMPH);
    }
}
