package org.uv.dao;

/**
 *
 * @author citla
 */
public class factoryDao {
    public enum TYPE{EMPLEADOS,DEPARTAMENTOS}
    
    public static Idao getDao(TYPE t){
        Idao dao = null;
        switch(t){
            case EMPLEADOS:
                dao = new daoEmpleado();
            break;
            case DEPARTAMENTOS:
                dao = new daoDepartamento();
            break;
        }
        return dao;
    }
}
