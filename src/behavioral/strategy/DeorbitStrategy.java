package behavioral.strategy;

class DeorbitStrategy implements ManeuverStrategy {

    @Override
    public void execute() {
        System.out.println("Turn retrograde");
        System.out.println("Accelerate 5minutes");
        System.out.println("Stand by 30km height");
        System.out.println("Deploy deaccelarate parachutes");
        System.out.println("Stand by 30km height");
        System.out.println("Deploy principal parachutes");
    }

}
