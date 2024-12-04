package análisisclínicos;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 * La clase GenerarAnalisis representa el proceso de generar un análisis clínico
 * para un paciente. 
 * Esta clase actúa como un observador de los cambios en las propiedades
 * del paciente, específicamente para detectar cambios en los niveles de ciertos parámetros
 * médicos (por ejemplo, el nivel de hierro). Cuando se detecta un cambio significativo en
 * los niveles de un parámetro, la clase notifica que se requiere un nuevo análisis.
 * 
 * La clase implementa la interfaz PropertyChangeListener, lo que le permite escuchar
 * los cambios en las propiedades del objeto Paciente, y en función de esos cambios,
 * generar una alerta y marcar el análisis como pendiente.
 * 
 * Esta clase almacena información sobre el análisis, como el número
 * del análisis, la fecha en que se realiza y si el análisis está pendiente o no.
 * 
 * @author Ornella Gigante
 * @version 1.0
 */
public class GenerarAnalisis implements Serializable, PropertyChangeListener {
    private int num_analisis; 
    private Paciente paciente;
    private Date fecha; 
    private int analisis_pendiente; // Indica si el análisis está pendiente (1) o no (0)
    
    // Constructor vacío, importante para JavaBeans
    public GenerarAnalisis() {
    }
    
    // Este método se ejecuta cuando recibe una notificación de cambio de propiedad (p. ej., cuando cambian los niveles de hierro)
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // Imprime información sobre el cambio de los niveles
        System.out.println("=== ALERTA: NIVELES ALTERADOS ===");
        System.out.println("Paciente: " + paciente.getNombre()); // Nombre del paciente relacionado
        System.out.println("Nivel anterior: " + evt.getOldValue()); // Valor antiguo del nivel de hierro
        System.out.println("Nivel actual: " + evt.getNewValue()); // Valor nuevo del nivel de hierro
        System.out.println("Se requiere nuevo analisis");
        this.analisis_pendiente = 1; // Marca el análisis como pendiente
    }
    
    // Getters y Setters 

    public int getNum_analisis() {
        return num_analisis; // Devuelve el número del análisis
    }

    public void setNum_analisis(int num_analisis) {
        this.num_analisis = num_analisis; // Establece el número del análisis
    }

    public Paciente getPaciente() {
        return paciente; // Devuelve el paciente asociado al análisis
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente; // Establece el paciente para el análisis
    }

    public Date getFecha() {
        return fecha; // Devuelve la fecha del análisis
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha; // Establece la fecha del análisis
    }

    public int getAnalisis_pendiente() {
        return analisis_pendiente; // Devuelve el estado del análisis (pendiente o no)
    }

    public void setAnalisis_pendiente(int analisis_pendiente) {
        this.analisis_pendiente = analisis_pendiente; // Establece el estado del análisis
    }

    // Métodos para obtener los valores antiguos y nuevos
    public Object getOldValue(PropertyChangeEvent evt) {
        return evt.getOldValue();
    }

    public Object getNewValue(PropertyChangeEvent evt) {
        return evt.getNewValue();
    }
}
