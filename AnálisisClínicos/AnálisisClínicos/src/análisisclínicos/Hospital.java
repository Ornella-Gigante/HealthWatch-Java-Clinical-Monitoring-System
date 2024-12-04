package análisisclínicos;

/**
* La clase Hospital representa el punto de entrada principal del sistema de análisis clínicos.
* Actúa como un ambiente de prueba y demostración del funcionamiento del sistema, mostrando
* la interacción entre las clases Paciente y GenerarAnalisis.
* 
* Esta clase contiene el método main que:
* - Crea una instancia de Paciente con datos de ejemplo
* - Configura el sistema de análisis y lo conecta con el paciente
* - Demuestra el funcionamiento del sistema de notificaciones al simular un cambio 
*   en los niveles de hierro del paciente
* 
* @author Ornella Gigante
* @version 1.0
*/
public class Hospital {
   /**
    * Método principal que demuestra el funcionamiento del sistema de análisis clínicos.
    * Crea un paciente de ejemplo, configura el sistema de análisis y simula un cambio
    * en los niveles de hierro para demostrar el sistema de notificación automática.
    *
    * @param args argumentos de la línea de comandos (no utilizados)
    * @author Ornella Gigante
    */
   public static void main(String[] args) {
       // Crear paciente con datos de ejemplo (nombre, apellido, edad, nivel hierro actual, último hierro, última urea)
       Paciente paciente1 = new Paciente("Joe", "Perez",630862248, 30, 5, 12, 35);
       
       // Instanciar y configurar el sistema de análisis
       GenerarAnalisis analisis1 = new GenerarAnalisis();
       analisis1.setPaciente(paciente1);
       
       // Registrar el sistema de análisis como observador de los cambios del paciente
       paciente1.addPropertyChangeListener(analisis1);
       
       // Simular un cambio significativo en el nivel de hierro (>10) para demostrar
       // el funcionamiento del sistema de notificaciones automáticas
       paciente1.setNivel_hierro(12);  
   }
}
