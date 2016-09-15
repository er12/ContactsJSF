package Bean;

/**
 * Created by edmildimassimo on 9/14/16.
 */
import model.Contact;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "manageBean" )
@SessionScoped
public class ManageBean {
    private List<Contact> contactos;
    private Contact contactoActivo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;

    @PostConstruct
    private void inicializando(){
        System.out.println("Testing inicializacion");
    }

    public ManageBean(){
        contactos = new ArrayList<Contact>();
    }


    public Contact getContactoActivo() {
        return contactoActivo;
    }

    public void setContactoActivo(Contact contactoActivo) {
        this.contactoActivo = contactoActivo;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String agregarContacto(){
        Contact nuevo = new Contact();
        nuevo.setNombre(nombre);
        nuevo.setApellido(apellido);
        contactos.add(nuevo);
        return "String";
    }

    public String eliminarContactoActual(){
        contactos.remove(contactoActivo);
        return "String";
    }

    public String modificarContacto(){
        contactoActivo.setNombre(nombre);
        contactoActivo.setApellido(apellido);
        contactoActivo.setCorreo(correo);
        contactoActivo.setDirección(direccion);
        contactoActivo.setTeléfono(telefono);
        return "String";
    }
}
