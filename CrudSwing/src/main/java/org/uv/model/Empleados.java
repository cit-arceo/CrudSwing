package org.uv.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author citla
 */
@Entity(name="empleados")
public class Empleados {    
//    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clave;
    @Column (name="nombre")
    private String nombre;
    @Column (name="direccion")
    private String direccion;
    @Column (name="telefono")
    private String telefono;
    @ManyToOne
    @JoinColumn(name="clave_departamento", referencedColumnName="clave")
    private Departamentos departamentos;
    
//    @ManyToOne(optional = true, fetch = FetchType.EAGER)
//    @JoinColumn(name = "depto")
//    @JsonBackReference(value = "empleado")
//    private Departamentos departamento;
    
    public Empleados() {
    }

    public Empleados(long clave, String nombre, String direccion, String telefono) {
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

}
