package structural.bridge;

public class PropulsorQuimico implements Propulsor{
    @Override
    public void acionar() {
        System.out.println("Acionando propulsor quimico");
    }
}
