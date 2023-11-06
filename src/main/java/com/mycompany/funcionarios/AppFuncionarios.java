package com.mycompany.funcionarios;

import controller.EmpleadoController;
import domain.Empleado;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AppFuncionarios {
    
    // Crear metodos
    // Metod Crear
    public static void crear(EmpleadoController empleadoController){
     
        try {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Digite el documento de identidad");
            String docIdentidad=sc.nextLine();
            System.out.println("El documento de identidad es: "+docIdentidad);
            System.out.println("______________________");
            
            System.out.println("Digite el nombre");
            String nombre=sc.nextLine();
            System.out.println("El nombre es: "+nombre);
            System.out.println("______________________");
            
            System.out.println("Digite el apellido");
            String apellido=sc.nextLine();
            System.out.println("El apellido es: "+apellido);
            System.out.println("______________________");
            
            System.out.println("Digite el estado civil");
            String estadoCivil=sc.nextLine();
            System.out.println("El estado civil es : "+estadoCivil);
            System.out.println("______________________");
            
            System.out.println("Digite el sexo");
            String sexo=sc.nextLine();
            System.out.println("el sexo es: "+sexo);
            System.out.println("______________________");

            System.out.println("Digite la direccion");
            String direccion=sc.nextLine();
            System.out.println("la direccion es : "+direccion);
            System.out.println("______________________");
            
            System.out.println("Digite el telefono");
            String telefono=sc.nextLine();
            System.out.println("el telefono es: "+telefono);
            System.out.println("______________________");
            
            System.out.println("Digite la fecha de nacimiento");
            String fechaNac=sc.nextLine();
            System.out.println("la fecha de nacimiento es: "+fechaNac);
            System.out.println("______________________");
            
            System.out.println("Digite el nivel educativo");
            String nivelEducativo=sc.nextLine();
            System.out.println("el nivel educativo es: "+nivelEducativo);
            System.out.println("______________________");
            
            System.out.println("Digite el titulo obtenido");
            String tituloObtenido=sc.nextLine();
            System.out.println("el titulo obtenido es: "+tituloObtenido);
            System.out.println("______________________");
            
            System.out.println("Digite el id universitario");
            int idUniversidad=sc.nextInt();
            System.out.println("el id universitario es: "+idUniversidad);
            System.out.println("______________________");
            
            // Ahora settiamos los datos
            Empleado empleado=new Empleado();
            empleado.setIdentidad(docIdentidad);
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setEstado(estadoCivil);
            empleado.setSexo(sexo);
            empleado.setDireccion(direccion);
            empleado.setTelefono(telefono);
            empleado.setNacimiento(fechaNac);
            empleado.setNivel(nivelEducativo);
            empleado.setTitulo(tituloObtenido);
            empleado.setUniversidad(idUniversidad);
            
            // Aqui se le envia la informacion a la clase EmpleadoController
            empleadoController.crear(empleado);
            System.out.println("Empleado creado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    // Listar todos los empleados
    public static void obtenerEmpleados(EmpleadoController empleadoController){
        
        try {
            List<Empleado> empleados=empleadoController.obtenerEmpleados();
            if(empleados.isEmpty()){
                System.out.println("No hay empleados");
            } else{
                empleados.forEach(empleado -> {
                    System.out.println("Id: "+empleado.getId());
                    System.out.println("Documento de Identidad: "+empleado.getIdentidad());
                    System.out.println("Nombre: "+empleado.getNombre());
                    System.out.println("Apellido: "+empleado.getApellido());
                    System.out.println("Estado Civil: "+empleado.getEstado());
                    System.out.println("Sexo: "+empleado.getSexo());
                    System.out.println("Direccion: "+empleado.getDireccion());
                    System.out.println("Telefono: "+empleado.getTelefono());
                    System.out.println("Fecha Nacimiento: "+empleado.getNacimiento());
                    System.out.println("Nivel Educativo: "+empleado.getNivel());
                    System.out.println("Titulo Obtenido: "+empleado.getTitulo());
                    System.out.println("Id Universidad: "+empleado.getUniversidad());
                    System.out.println("______________________________");
                    System.out.println("______________________________");
                    
                    
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
        // Eliminar Empleado
    public static void eliminarEmpleado(EmpleadoController empleadoController){
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Digite el Id");
            int id=sc.nextInt();
            System.out.println("el Id es: "+id);
            System.out.println("______________________");
            
            // Ahora settiamos los datos
            Empleado empleado=new Empleado();
            empleado.setId(id);
            
            // Aqui se le envia la informacion a la clase CarroController
            empleadoController.eliminarEmpleado(id);
            System.out.println("Empleado eliminado exitosamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
         EmpleadoController empleadoController=new EmpleadoController();
        //crear(empleadoController);
        obtenerEmpleados(empleadoController);
        //eliminarEmpleado(empleadoController);
        
    }
}
