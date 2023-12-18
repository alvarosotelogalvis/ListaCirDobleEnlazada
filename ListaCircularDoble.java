class ListaCircularDoble {
    private Nodo cabeza;

    public ListaCircularDoble() {
        cabeza = null;
    }

    public void insertarAlInicio(Cancion cancion) {
        Nodo nuevoNodo = new Nodo(cancion);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.Siguiente = cabeza;
            cabeza.Anterior = cabeza;
        } else {
            nuevoNodo.Siguiente = cabeza;
            nuevoNodo.Anterior = cabeza.Anterior;
            cabeza.Anterior.Siguiente = nuevoNodo;
            cabeza.Anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    public void mostrarListaAdelante() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.println(actual.Cancion);
            actual = actual.Siguiente;
        } while (actual != cabeza);
    }

    public void mostrarListaAtras() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza.Anterior;
        do {
            System.out.println(actual.Cancion);
            actual = actual.Anterior;
        } while (actual != cabeza.Anterior);
    }

    public void reproducirCancion(String nombreCancion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.Cancion.Nombre.equals(nombreCancion)) {
                System.out.println("Reproduciendo: " + actual.Cancion);
                return;
            }
            actual = actual.Siguiente;
        } while (actual != cabeza);

        System.out.println("La canción no se encuentra en la lista.");
    }

    public void actualizarCancion(String nombreCancion, String nuevoNombre, String nuevoArtista, int nuevaDuracion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.Cancion.Nombre.equals(nombreCancion)) {
                actual.Cancion.Nombre = nuevoNombre;
                actual.Cancion.Artista = nuevoArtista;
                actual.Cancion.DuracionSegundos = nuevaDuracion;
                System.out.println("Canción actualizada.");
                return;
            }
            actual = actual.Siguiente;
        } while (actual != cabeza);

        System.out.println("La canción no se encuentra en la lista.");
    }

    public void eliminarCancion(String nombreCancion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.Cancion.Nombre.equals(nombreCancion)) {
                if (actual == cabeza) {
                    cabeza = actual.Siguiente;
                }
                actual.Anterior.Siguiente = actual.Siguiente;
                actual.Siguiente.Anterior = actual.Anterior;
                System.out.println("Canción eliminada.");
                return;
            }
            actual = actual.Siguiente;
        } while (actual != cabeza);

        System.out.println("La canción no se encuentra en la lista.");
    }

    public void eliminarLista() {
        cabeza = null;
        System.out.println("Toda la lista ha sido eliminada.");
    }
}
