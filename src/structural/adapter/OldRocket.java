package structural.adapter;

// Implementação de um foguete que usa milhas por hora
class OldRocket implements OldRocketSystem{

    @Override
    public void setSpeedInMPH(double speed) {
        System.out.println("Velocidade ajustada para " + speed + " mph.");
    }
}
