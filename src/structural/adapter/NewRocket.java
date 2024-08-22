package structural.adapter;

// Implementação de um foguete que usa quilômetros por hora
class NewRocket implements NewRocketSystem{
    @Override
    public void setSpeedInKMH(double speed) {
        System.out.println("Velocidade ajustada para " + speed + " km/h.");
    }
}
