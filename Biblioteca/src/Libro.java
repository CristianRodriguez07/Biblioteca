 public class Libro {
        //Atributos
        private String isbn;
        private String titulo;
        private Autoria[] autoria;
        private int ejemplares;
        private int prestados;

        //Constructor vacio
        public Libro(String isbn, String titulo, int ejemplares, Autoria[] autoria) {
        }

        //Constructor
        public Libro(String isbn, String titulo, Autoria[] autoria, int ejemplares, int prestados) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autoria = autoria;
            this.ejemplares = ejemplares;
            this.prestados = prestados;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Autoria[] getAutoria() {
            return autoria;
        }

        public void setAutoria(Autoria[] autoria) {
            this.autoria = autoria;
        }

        public int getEjemplares() {
            return ejemplares;
        }

        public void setEjemplares(int ejemplares) {
            this.ejemplares = ejemplares;
        }

        public int getPrestados() {
            return prestados;
        }

        public void setPrestados(int prestados) {
            this.prestados = prestados;
        }


        public int prestar(){
            if (prestados < ejemplares) {
                prestados++;
                return ejemplares - prestados;
            } else {
                return -1;
            }
        }

        //Devolver: Comprueba que había ejemplares prestados para hacer la devolución. El método devuelve un número entero con el número de librosdisponibles en la biblioteca trasesta devolución, o -1 en caso de que no se haya podido hacer (no había librosprestados).
        public int devolver(){
            if (prestados > 0) {
                prestados--;
                return ejemplares - prestados;
            } else {
                return -1;
            }
        }

        public String toString() {
            return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autoria=" + autoria + ", ejemplares=" + ejemplares
                    + ", prestados=" + prestados + "]";
        }


    }
