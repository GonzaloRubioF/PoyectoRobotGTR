package proyectorobotgtr;

public class PiernaDerechaGTR {

    private boolean puedeCaminar = true;

    public PiernaDerechaGTR() {
        System.out.println("Pierna Derecha GTR creada.");
    }

    public void mostrarPiernaGTR() {
        if (puedeCaminar) {
            System.out.println("La pierna derecha GTR está lista para caminar.");
        } else {
            System.out.println("La pierna derecha GTR no puede caminar.");
        }
    }
}