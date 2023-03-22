public class Revista {
    private String issn;
    private String titulo;
    private Autoria[] autoria;
    private int prestados;

    public Revista(String issn, String titulo, int ejemplares) {
    }

    public Revista(String issn, String titulo, Autoria[] autoria, int prestados) {
        this.issn = issn;
        this.titulo = titulo;
        this.autoria = autoria;
        this.prestados = prestados;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
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

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public int prestar(){
        prestados++;
        return prestados;
    }

    public int devolver(){
        if (prestados > 0) {
            prestados--;
            return prestados;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Revista [issn=" + issn + ", titulo=" + titulo + ", autoria=" + autoria + ", prestados=" + prestados + "]";
    }

}
