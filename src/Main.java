public class Main {
    public static void main(String[] args) {
        Modulo modLogin = new Modulo();
        modLogin.nombre = "Login";
        modLogin.lenguaje = "Java";
        modLogin.version = "2.0";
        modLogin.terminado = false;

        Modulo modInventario = new Modulo();
        modInventario.nombre = "Inventario";
        modInventario.lenguaje = "C++";
        modInventario.version = "2.0.5";
        modInventario.terminado = false;

        Modulo modReportes = new Modulo();
        modReportes.nombre = "Reportes";
        modReportes.lenguaje = "Python";
        modReportes.version = "15.0";
        modReportes.terminado = false;

        System.out.println("----Informacion inicial----");
        modLogin.mostrarInformacion();
        System.out.println();
        modInventario.mostrarInformacion();
        System.out.println();
        modReportes.mostrarInformacion();

        modLogin.marcarTerminado();

        System.out.println("----Informacion actualizada----");
        modLogin.mostrarEstado();
        modInventario.mostrarEstado();
        modReportes.mostrarEstado();

        System.out.println("----Versiones----");
        modLogin.mostrarVersion();
        modInventario.mostrarVersion();
        modReportes.mostrarVersion();





    }
}