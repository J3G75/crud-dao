
package data;

import com.mycompany.funcionarios.util.ConnectionUtil;
import domain.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao {
    
        // CRUD
    // Declaracion de variables
    private static final String GET_EMPLEADOS="select * from empleado";
    
    private static final String CREATE_EMPLEADO="INSERT INTO empleado"
        +"(identidad,nombre,apellido,estado,sexo,direccion,telefono,nacimiento,nivel,titulo,universidad)" 
        +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    //private static final String CREATE_EMPLEADO="INSERT INTO empleado(docIdentidad,nombre,apellido,estadoCivil,sexo,direccion,telefono,fechaNac,nivelEducativo,tituloObtenido,idUniversidad) values(?,?,?,?,?,?,?,?,?,?,?)";
    
    private static final String GET_EMPLEADO_BY_ID="select * from empleado where id=?";
    
    //private static final String UPDATE_EMPLEADO="UPDATE empleado"
        //+"SET identidad=?, nombre=?, apellido=?, estado=?, sexo=?, direccion=, telefono=?, nacimiento=?, nivel=?, titulo=?, universidad=?"
        //+"WHERE id=?";
    
    private static final String UPDATE_EMPLEADO="UPDATE empleado SET identidad=?, nombre=?, apellido=?, estado=?, sexo=?, direccion=?, telefono=?, nacimiento=?, nivel=?, titulo=?, universidad=? WHERE id=?";
    
    private static final String DELETE_EMPLEADO="DELETE from empleado WHERE id=?";
    
    // Creacion de metodos
    // Metodo obtener empleados
    public List<Empleado>obtenerEmpleados()throws SQLException{
        
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Empleado> empleados=new ArrayList<>();
        
        // Crear bloque de excepciones
        try {
            // Llamar al metodo getConnection de la clase ConectionUtil
            connection = ConnectionUtil.getConnection();
            // Preparamos la consulta
            preparedStatement = connection.prepareStatement(GET_EMPLEADOS);
            // Guardamos el resultado
            resultSet = preparedStatement.executeQuery();

            // Ciclo settear los empleados
            while (resultSet.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(resultSet.getInt("id"));
                empleado.setIdentidad(resultSet.getString("identidad"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellido"));
                empleado.setEstado(resultSet.getString("estado"));
                empleado.setSexo(resultSet.getString("sexo"));
                empleado.setDireccion(resultSet.getString("direccion"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setNacimiento(resultSet.getString("nacimiento"));
                empleado.setNivel(resultSet.getString("nivel"));
                empleado.setTitulo(resultSet.getString("titulo"));
                empleado.setUniversidad(resultSet.getInt("universidad"));

                // Agregar los empleados a la lista para mostrarlos al usuario
                empleados.add(empleado);
            }

            // Retornar los empleados
            return empleados;
            
        } finally {
            // Aqui se cierran los flujos
            if(connection !=null){
                connection.close();
            }
            if(preparedStatement !=null){
                preparedStatement.close();
            }
            if(resultSet !=null){
                resultSet.close();
            }
        }
           
    }
    
    // Metodo Crear Empleado
    public void crear(Empleado empleado)throws SQLException{
        
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        
        try {
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareCall(CREATE_EMPLEADO);
            
            preparedStatement.setString(1,empleado.getIdentidad());
            preparedStatement.setString(2,empleado.getNombre());
            preparedStatement.setString(3,empleado.getApellido());
            preparedStatement.setString(4,empleado.getEstado());
            preparedStatement.setString(5,empleado.getSexo());
            preparedStatement.setString(6,empleado.getDireccion());
            preparedStatement.setString(7,empleado.getTelefono());
            preparedStatement.setString(8,empleado.getNacimiento());
            preparedStatement.setString(9,empleado.getNivel());
            preparedStatement.setString(10,empleado.getTitulo());
            preparedStatement.setInt(11,empleado.getUniversidad());
            
            // Ejecutamos la consulta
            preparedStatement.executeUpdate();
            
        } finally {
            if(connection!=null){
                connection.close();
            }
            if (preparedStatement!=null){
                preparedStatement.close();
            }
        }
    }
    
    // Metodo obtener empleado por id
    public Empleado obtenerEmpleado(int id)throws SQLException{
        
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Empleado empleado=null;
        
        try {
            
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(GET_EMPLEADO_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet=preparedStatement.executeQuery();
            
            // Si hay empleados, entonces settear y obtener el empleado
            if(resultSet.next()){
                empleado=new Empleado();
                empleado.setId(resultSet.getInt("id"));
                empleado.setIdentidad(resultSet.getString("identidad"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellido(resultSet.getString("apellido"));
                empleado.setEstado(resultSet.getString("estado"));
                empleado.setSexo(resultSet.getString("sexo"));
                empleado.setDireccion(resultSet.getString("direccion"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setNacimiento(resultSet.getString("nacimiento"));
                empleado.setNivel(resultSet.getString("nivel"));
                empleado.setTitulo(resultSet.getString("titulo"));
                empleado.setUniversidad(resultSet.getInt("universidad"));
                
                
            }
            return empleado;
            
        } finally {
            
            if(connection!=null){
                connection.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
            if(resultSet!=null){
                resultSet.close();
            }
        }
    }
    
    // Metodo actualizar empleado
    public void actualizarEmpleado(int id, Empleado empleado)throws SQLException{
        
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        
        try {
            
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(UPDATE_EMPLEADO);
            
            preparedStatement.setString(1,empleado.getIdentidad());
            preparedStatement.setString(2,empleado.getNombre());
            preparedStatement.setString(3,empleado.getApellido());
            preparedStatement.setString(4,empleado.getEstado());
            preparedStatement.setString(5,empleado.getSexo());
            preparedStatement.setString(6,empleado.getDireccion());
            preparedStatement.setString(7,empleado.getTelefono());
            preparedStatement.setString(8,empleado.getNacimiento());
            preparedStatement.setString(9,empleado.getNivel());
            preparedStatement.setString(10,empleado.getTitulo());
            preparedStatement.setInt(11,empleado.getUniversidad());
            preparedStatement.setInt(12,empleado.getId());
            preparedStatement.executeUpdate();
            
        }finally{
            
            if(connection!=null){
                connection.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
        }
    }
    
    // Metodo eliminar empleado
    public void eliminarEmpleado(int id)throws SQLException{
        
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        
        try {
            
            connection=ConnectionUtil.getConnection();
            preparedStatement=connection.prepareStatement(DELETE_EMPLEADO);
            
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        } finally {
            
            if(connection!=null){
                connection.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
        }
    }
    
}
