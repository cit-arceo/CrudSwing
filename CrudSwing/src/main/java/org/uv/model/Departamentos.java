package org.uv.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author citla
 */
@Entity
@Table(name="departamentos")
public class Departamentos {
//    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clave;
    @Column(name="nombre")
    private String nombre;
    
//    @OneToMany
//    @JoinColumn(name="clave_empleado", referencedColumnName="clave")
//    private List<Empleados> empleados = new ArrayList<Empleados>( );
    
    @OneToMany(mappedBy = "departamentos")
    private Set<Empleados> empleados = new HashSet<>();
//    Set empleados = new HashSet();
    
    public Departamentos() {
    }

    public Departamentos(long clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
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

//    public List<Empleados> getEmpleados() {
//        return empleados;
//    }
//
//    public void setEmpleados(List<Empleados> empleados) {
//        this.empleados = empleados;
//    }

}
