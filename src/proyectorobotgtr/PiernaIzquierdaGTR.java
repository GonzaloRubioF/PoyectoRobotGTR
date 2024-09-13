package proyectorobotgtr;

public class PiernaIzquierdaGTR {

    private boolean puedeCaminar = true;

    public PiernaIzquierdaGTR() {
        System.out.println("Pierna Izquierda GTR creada.");
    }

    public void mostrarPiernaGTR() {
        if (puedeCaminar) {
            System.out.println("La pierna izquierda GTR está lista para caminar.");
        } else {
            System.out.println("La pierna izquierda GTR no puede caminar.");
        }
    }
}