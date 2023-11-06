package controller;

import data.EmpleadoDao;
import domain.Empleado;
import java.sql.SQLException;
import java.util.List;

public class EmpleadoController {
    
    // Se define una variable privada de tipo EmpleadoDao
    // Esta clase nos va a permitir acceder a todos los metodos de la clase EmpleadoDao
    private EmpleadoDao empleadoDao;
    
    // Crear el constructor
    public EmpleadoController(){
        empleadoDao=new EmpleadoDao();
    }
    
    // Se crean los metodos para retornar los mismos metodos que se habian definido en la clase EmpleadoDao
    public List<Empleado> obtenerEmpleados() throws SQLException{
        
        return empleadoDao.obtenerEmpleados();
    }
    
    public void crear(Empleado empleado)throws SQLException{
        empleadoDao.crear(empleado);
    }
    
    public Empleado obtenerEmpleado(int id)throws SQLException{
        
        return empleadoDao.obtenerEmpleado(id);
    }
    
    public void actualizarEmpleado(int id, Empleado empleado)throws SQLException{
        empleadoDao.actualizarEmpleado(id, empleado);
    }
    
    public void eliminarEmpleado(int id)throws SQLException{
        empleadoDao.eliminarEmpleado(id);
    }
    
}
