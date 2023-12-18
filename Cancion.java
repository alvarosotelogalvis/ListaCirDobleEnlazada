class Cancion {
    String Nombre;
    String Artista;
    int DuracionSegundos;

    public Cancion(String nombre, String artista, int duracionSegundos) {
        Nombre = nombre;
        Artista = artista;
        DuracionSegundos = duracionSegundos;
    }

    public String toString() {
        return "Canción: " + Nombre + ", Artista: " + Artista + ", Duración: " + DuracionSegundos + " segundos";
    }
}
