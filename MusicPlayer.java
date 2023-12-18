import java.util.Scanner;

public class MusicPlayer {
    public static Scanner scanner = null;
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        ListaCircularDoble lista = new ListaCircularDoble();

        while (true) {
            try {
            scanner = new Scanner(System.in);
            
            System.out.print("*************************************************\n");
            System.out.print("             Reproductor de musica\n");
            System.out.print("*************************************************\n");
            System.out.println("\nMenú:");
            System.out.println("1. Crear nueva canción");
            System.out.println("2. Reproducir una canción deseada");
            System.out.println("3. Reproducir la lista completa hacia adelante");
            System.out.println("4. Reproducir la lista completa hacia atrás");
            System.out.println("5. Actualizar una canción");
            System.out.println("6. Eliminar una canción deseada");
            System.out.println("7. Eliminar toda la lista");
            System.out.println("8. Apagar reproductor");
            System.out.print("\nElija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción: ");
                    String nombre = scanner.next();
                    System.out.print("Nombre del artista: ");
                    String artista = scanner.next();
                    System.out.print("Duración en segundos: ");
                    int duracion = scanner.nextInt();

                    Cancion cancion = new Cancion(nombre, artista, duracion);
                    lista.insertarAlInicio(cancion);
                    System.out.println("Canción creada.");
                    break;
                case 2:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción a reproducir: ");
                    String nombreReproducir = scanner.next();
                    lista.reproducirCancion(nombreReproducir);
                    break;
                case 3:
                    System.out.print("*************************************************\n");
                    System.out.println("Reproduciendo la lista completa hacia adelante:");
                    lista.mostrarListaAtras();
                    break;
                case 4:
                    System.out.print("*************************************************\n");
                    System.out.println("Reproduciendo la lista completa hacia atrás:");
                    lista.mostrarListaAdelante();
                    break;
                case 5:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción a actualizar: ");
                    String nombreActualizar = scanner.next();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.next();
                    System.out.print("Nuevo artista: ");
                    String nuevoArtista = scanner.next();
                    System.out.print("Nueva duración en segundos: ");
                    int nuevaDuracion = scanner.nextInt();
                    lista.actualizarCancion(nombreActualizar, nuevoNombre, nuevoArtista, nuevaDuracion);
                    break;
                case 6:
                    System.out.print("*************************************************\n");
                    System.out.print("Nombre de la canción a eliminar: ");
                    String nombreEliminar = scanner.next();
                    lista.eliminarCancion(nombreEliminar);
                    break;
                case 7:
                    System.out.print("*************************************************\n");
                    lista.eliminarLista();
                    //Eliminar la lista
                    break;
                case 8:
                    System.out.print("*************************************************\n");
                    System.out.print("             Apagando reproductor...\n");
                    System.out.print("*************************************************\n");
                    scanner.close();
                    return;
                default:
                    System.out.print("Opcion no valida, intente nuevamente: \n");
                    break;
            }
            } catch (Exception e) {
                // TODO: handle exception
                scanner=null;
                System.out.print("Ingreso alguna opcion no valida, intente nuevamente.\n");
            }
        }
    }
}