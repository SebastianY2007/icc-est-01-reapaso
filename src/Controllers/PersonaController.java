package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un persona de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        int n = personas.length;
        
        if (personas == null || personas.length <= 1){
            return;
        }

        for (int i = 1; i < n; i++){
            Persona aux = personas[i];
            int j = i - 1;
        
            while (j >= 0 && personas[j].getEdad() > aux.getEdad()){
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;
        
        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            if (personas[medio].getEdad() == edad) {
                return personas[medio];
            }
            if (personas[medio].getEdad() > edad) {
                alto = medio - 1;
            } else {
                bajo = medio + 1;
            }
        }
        return null;
    }
}
