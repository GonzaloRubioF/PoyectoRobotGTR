package proyectorobotgtr;

public class RobotGTR {

    // Atributos del robot
    private ManoIzquierdaGTR manoIzquierda;
    private ManoDerechaGTR manoDerecha;
    private PiernaIzquierdaGTR piernaIzquierda;
    private PiernaDerechaGTR piernaDerecha;
    private TorsoGTR torso;
    private CabezaGTR cabeza;

    // Constructor del robot
    public RobotGTR() {
        this.manoIzquierda = new ManoIzquierdaGTR();
        this.manoDerecha = new ManoDerechaGTR();
        this.piernaIzquierda = new PiernaIzquierdaGTR();
        this.piernaDerecha = new PiernaDerechaGTR();
        this.torso = new TorsoGTR();
        this.cabeza = new CabezaGTR();
        System.out.println("Robot GTR creado con partes izquierdas y derechas.");
    }

    // Método para mostrar las características del robot
    public void mostrarRobotGTR() {
        System.out.println("Características del robot:");
        manoIzquierda.mostrarManoGTR();
        manoDerecha.mostrarManoGTR();
        piernaIzquierda.mostrarPiernaGTR();
        piernaDerecha.mostrarPiernaGTR();
        torso.mostrarTorsoGTR();
        cabeza.mostrarCabezaGTR();
    }
}