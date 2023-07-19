/* registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.*/

package Servicio;
import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {
   Scanner leer = new Scanner(System.in);
   
   ArrayList<Cliente> clientes = new ArrayList<>();
    public void crearCliente (){
        
        
        System.out.println("Ingrese el id del cliente: " );
        int id =  leer.nextInt();
        System.out.println("Ingrese el nombre del cliente: " );
        String nombre =  leer.next();
        System.out.println("Ingrese la edad del cliente: " );
        int edad =  leer.nextInt();
        System.out.println("Ingrese la altura del cliente: " );
        int altura =  leer.nextInt();
        System.out.println("Ingrese el peso del cliente: " );
        int peso =  leer.nextInt();
        System.out.println("Ingrese el objetivo del cliente: " );
        String objetivo =  leer.next();
        
        
        Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> obtenerClientes (){
        return clientes;
    }
    public void agregarCliente (Cliente cliente){
        clientes.add(cliente);
    }
    
    public void eliminarCliente (int id){
        clientes.remove(buscarCliente(id));
    }
    
    public Cliente buscarCliente (int id){
        for(Cliente cl:clientes){
            if(cl.getId()== id)
                return cl;
        }
        return null;
    }
    
    public void actualizarClientes (int id, String nombre, int edad, int altura, double peso, String objetivo){
        Cliente cliente = buscarCliente(id);
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setObjetivo(objetivo);
    }
}
