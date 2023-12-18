class Nodo {
    Cancion Cancion;
    Nodo Siguiente;
    Nodo Anterior;

    public Nodo(Cancion cancion) {
        Cancion = cancion;
        Siguiente = null;
        Anterior = null;
    }
}
