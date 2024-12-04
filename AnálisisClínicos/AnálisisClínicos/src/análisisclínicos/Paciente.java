package análisisclínicos;

import java.beans.*;
import java.io.Serializable;

/**
 * La clase Paciente representa un paciente en un sistema de análisis clínicos.
 * Contiene información sobre el paciente como su nombre, apellido, edad, niveles de hierro,
 * y los últimos valores de hierro y urea. Además, implementa un sistema de notificación para 
 * cambios en los niveles de hierro del paciente, notificando a los oyentes cuando estos valores
 * cambian y superan un umbral específico.
 */
public class Paciente implements Serializable {

    // Atributos del paciente
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private int nivel_hierro;
    private int ultimo_hierro;
    private int ultimo_urea;
    

    // Sistema de notificaciones para eventos
    private PropertyChangeSupport propertySupport;
    
    
    public Paciente(){
        
    }

    /**
     * Constructor de la clase Paciente que inicializa todos los atributos del paciente.
     *
     * @param nombre          Nombre del paciente
     * @param apellido       Apellido del paciente
     * @param edad           Edad del paciente
     * @param nivel_hierro   Nivel de hierro del paciente
     * @param ultimo_hierro  Último nivel de hierro registrado
     * @param ultimo_urea    Último nivel de urea registrado
     * @param telefono       Teléfono del paciente
     */
    public Paciente(String nombre, String apellido, int edad, int telefono, int nivel_hierro, int ultimo_hierro, int ultimo_urea) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.nivel_hierro = nivel_hierro;
        this.ultimo_hierro = ultimo_hierro;
        this.ultimo_urea = ultimo_urea;
        this.propertySupport = new PropertyChangeSupport(this); // Inicializar el PropertyChangeSupport
    }

    // Establecer el nivel de hierro y notificar cambios
    public void setNivel_hierro(int nuevo_nivel) {
        int nivel_anterior = this.nivel_hierro;
        this.nivel_hierro = nuevo_nivel;

        if (nuevo_nivel > 10) {
            propertySupport.firePropertyChange("nivel_hierro", nivel_anterior, nuevo_nivel);
        }
    }

  
    // Método para agregar listeners de cambios
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel_hierro() {
        return nivel_hierro;
    }

    public int getUltimo_hierro() {
        return ultimo_hierro;
    }

    public int getUltimo_urea() {
        return ultimo_urea;
    }
    
     public int setTelefono(int telefono) {
        return telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
