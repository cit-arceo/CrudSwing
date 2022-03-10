package org.uv.dao;

import java.util.Collection;
import java.util.List;
import org.uv.model.Departamentos;
import org.uv.model.Empleados;


/**
 *
 * @author citla
 */
public class Main {
    public static void main(String args[]) {
        Idao empDao = factoryDao.getDao(factoryDao.TYPE.EMPLEADOS);
        Idao depaDao = factoryDao.getDao(factoryDao.TYPE.DEPARTAMENTOS);
        Empleados emp = new Empleados();
        Departamentos depto = new Departamentos();
        
//        depto.setClave(4);
        depto.setNombre("Logistica");
        
//        emp.setClave(5);
        emp.setNombre("Alfredo");
        emp.setDireccion("Jalcomulco");
        emp.setTelefono("1234589415");
        emp.setDepartamentos(depto);
//        emp.setClave(5);
        
//        System.out.println(depaDao.insert(depto));

//Mostrar uno        
//        Empleados empleado = (Empleados) empDao.readOne(emp);
//        System.out.println(empleado.getClave() + " " +  empleado.getNombre());
//        Departamentos departamento = (Departamentos) dao.readOne(dep);
//        System.out.println(departamento.getClave() + " " + departamento.getNombre());
//Mostrar todos        
        List<Empleados> lista = empDao.readAll();

        for(Empleados empleado : lista ){
            System.out.println(empleado.getClave() + " " + empleado.getNombre()
                    + " " + empleado.getDireccion() + " " + empleado.getTelefono() 
                    + " " );
        } 
        
    }
}
