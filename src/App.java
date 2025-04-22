import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),        
        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();

        vC.printMessage("Personas");
        vC.printPersonsArray(personas);
        vC.printMessage("Personas Ordenadas por edad");
        vC.printPersonsArray(personas);
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);

        vC.printMessage("\nBuscar persona con edad 40");
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB == null){
            vC.printMessage("\tNo hay una persona con esa edad");
        }else{
            vC.printMessage("\nPersona con edad 40 encontrada");
            vC.printMessage("\tLa persona con la edad 40 es: ");
            vC.printMessage("\t" + pB + "\n");
        }

        vC.printMessage("Buscar persona con edad 99");
        pB = pC.buscarPorEdad(personas, 99);
        if (pB == null){
            vC.printMessage("\tNo hay una persona con esa edad");
        }else{
            vC.printMessage("Persona con edad 99 encontrada");
            vC.printMessage("\tLa persona con la edad 99 es: ");
            vC.printMessage("\t" + pB);
        }
    }
}
