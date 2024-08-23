package behavioral.command;

// Receiver - Nave Espacial
class Spacecraft {
    public void startEngines() {
        System.out.println("Motores acionados.");
    }

    public void adjustTrajectory() {
        System.out.println("Trajetória ajustada.");
    }

    public void activateSleepMode() {
        System.out.println("Modo de repouso ativado.");
    }

    public void deactivateSleepMode() {
        System.out.println("Modo de repouso desativado.");
    }

    public void clearTrajectory() {
        System.out.println("Trajetória resetada.");
    }

    public void stopEngines() {
        System.out.println("Motores desativados.");
    }
}
