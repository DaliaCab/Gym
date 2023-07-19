import Entidad.Cliente;
import Servicio.ServicioCliente;
import java.util.Scanner;


public class MainGym {
    Scanner leer = new Scanner(System.in);

    ServicioCliente servicioCliente = new ServicioCliente();
    public static void main(String[] args) {
        MainGym gym = new MainGym();
        gym.clientesIniciales();
        gym.mostrarClientes();
        //gym.eliminarCliente();
        //gym.mostrarClientes();
        gym.actualizarCliente();
        gym.mostrarClientes();
    }
    public void mostrarClientes(){
        servicioCliente.obtenerClientes().forEach(System.out::println);
    }
    
    public void clientesIniciales(){
        servicioCliente.agregarCliente(new Cliente(90277, "Pepito", 23, 170, 70, "Aumentar masa"));
        servicioCliente.agregarCliente(new Cliente(90232, "Edison", 25, 170, 90, "Adelgazar"));
        servicioCliente.agregarCliente(new Cliente(98274, "Felipe", 56, 180, 80, "Aumentar masa"));
        servicioCliente.agregarCliente(new Cliente(12937, "Brenda", 27, 170, 60, "Aumentar masa"));
    }
    
    public void eliminarCliente(){
        System.out.println("Ingrese el ID del cliente a eliminar: ");
        int id =  leer.nextInt();
        if (servicioCliente.buscarCliente(id)!= null)
            servicioCliente.eliminarCliente(id);
        else
            System.err.println("El cliente no existe");
    }
    
    public void actualizarCliente(){
        
        System.out.println("Ingrese el id del cliente: " );
        int id =  leer.nextInt();
        if (servicioCliente.buscarCliente(id)== null){
            System.err.println("El cliente no existe");
            return;
        }
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
        
        servicioCliente.actualizarClientes(id, nombre, edad, altura, peso, objetivo);
    }
    
}
