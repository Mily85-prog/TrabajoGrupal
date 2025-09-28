public class Libro {
    private String nombre;

    
    public Libro(String nombre) {
        this.nombre = nombre;
    }
    public Libro() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // clase interna 
    public class Pagina {
        private String contenido;
        private int numero;
        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }
        public void mostrarContenido() {
            System.out.println("Contenido de la "
                    + "página " + numero + ": " 
                    + contenido);
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }    
    }
}


