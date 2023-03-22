import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private static ArrayList<Autoria> autorias = new ArrayList<Autoria>();
    private static ArrayList<Libro> libros = new ArrayList<Libro>();
    private static ArrayList<Revista> revistas = new ArrayList<Revista>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println(" ");
            System.out.println("MENU");
            System.out.println("1.Crear autor/a");
            System.out.println("2.Ver autoras/es");
            System.out.println("3.Crea el libro");
            System.out.println("4.Mostrar libros");
            System.out.println("5.Presta un libro");
            System.out.println("6.Devuelve un libro");
            System.out.println("7.Crea la revista");
            System.out.println("8.Mostrar revistas");
            System.out.println("9.Presta una revista");
            System.out.println("10.Devuelve una revista");
            System.out.println("0.Salir");
            System.out.println(" ");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    System.out.println("1.");
                    crearAutor();
                    break;
                case 2:
                    System.out.println("2.");
                    verAutores();
                    break;
                case 3:
                    System.out.println("3.");
                    crearLibro();
                    break;
                case 4:
                    System.out.println("4.");
                    verLibros();
                    break;
                case 5:
                    System.out.println("5.");
                    prestarLibro();
                    break;
                case 6:
                    System.out.println("6.");
                    devolverLibro();
                    break;
                case 7:
                    System.out.println("7.");
                    crearRevista();
                    break;
                case 8:
                    System.out.println("8.");
                    verRevistas();
                    break;
                case 9:
                    System.out.println("9.");
                    prestarRevista();
                    break;
                case 10:
                    System.out.println("10.");
                    devolverRevista();
                    break;
                case 0:
                    System.out.println("Has elegido salir");
                    break;
                default:
                    System.err.println("Opción incorrecta");
                    System.out.println(" ");
            }
        } while (opcion != 0);
    }

    private static void crearAutor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el id: ");
        int id = sc.nextInt();
        for (Autoria autoria : autorias) {
            if (autoria.getId() == id) {
                System.err.println("El id ya existe");
                return;
            }
        }
        sc.nextLine();
        System.out.println("Introduce el nombre del autor: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos del autor: ");
        String apellidos = sc.nextLine();
        Autoria autoria = new Autoria(id, nombre, apellidos);
        autorias.add(autoria);
    }

    private static void verAutores() {
        for (Autoria autoria : autorias) {
            System.out.println(autoria);
        }
    }

    private static void crearLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ISBN: ");
        String isbn = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.err.println("El ISBN ya existe");
                return;
            }
        }
        System.out.println("Introduce el título del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Introduce el número de autores: ");
        Autoria[] autoria = new Autoria[sc.nextInt()];
        System.out.println("Introduce el número de ejemplares: ");
        int ejemplares = sc.nextInt();
        System.out.println("Introduce el número de prestados: ");
        int prestados = sc.nextInt();
        Libro libro = new Libro(isbn, titulo, autoria, ejemplares, prestados);
        libros.add(libro);
    }

    private static void verLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    private static void prestarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro: ");
        String isbn = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libro.prestar();
            }
        }
    }

    private static void devolverLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro: ");
        String isbn = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libro.devolver();
            }
        }
    }

    private static void crearRevista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISSN de la revista: ");
        String issn = sc.nextLine();
        for (Revista revista : revistas) {
            if (revista.getIssn().equals(issn)) {
                System.err.println("El ISSN ya existe");
                return;
            }
        }
        System.out.println("Introduce el título de la revista: ");
        String titulo = sc.nextLine();
        System.out.println("Introduce el número de autores: ");
        Autoria[] autoria = new Autoria[sc.nextInt()];
        System.out.println("Introduce el número de prestados: ");
        int prestados = sc.nextInt();
        Revista revista = new Revista(issn, titulo, autoria, prestados);
        revistas.add(revista);
    }

    private static void verRevistas() {
        for (Revista revista : revistas) {
            System.out.println(revista);
        }
    }

    private static void prestarRevista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISSN de la revista: ");
        String issn = sc.nextLine();
        for (Revista revista : revistas) {
            if (revista.getIssn().equals(issn)) {
                revista.prestar();
            }
        }
    }

    private static void devolverRevista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ISSN de la revista: ");
        String issn = sc.nextLine();
        for (Revista revista : revistas) {
            if (revista.getIssn().equals(issn)) {
                revista.devolver();
            }
        }
    }
}