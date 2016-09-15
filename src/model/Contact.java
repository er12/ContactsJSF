package model;

/**
 * Created by Ernesto on 14-Sep-16.
 */
public class Contact
{
    String nombre, spellido, dirección, teléfono , correo;

    public Contact() {}

    public Contact(String nombre, String spellido, String dirección, String teléfono, String correo) {
        this.nombre = nombre;
        this.spellido = spellido;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSpellido() {
        return spellido;
    }

    public void setSpellido(String spellido) {
        this.spellido = spellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
