import java.util.Scanner;

public class ProyectoEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        String[] nombres = new String[numEstudiantes];
        double[] calificaciones = new double[numEstudiantes];

        ingresarDatos(nombres, calificaciones, scanner);
        mostrarDatos(nombres, calificaciones);
        calcularEstadisticas(calificaciones);

        scanner.close();
    }

    public static void ingresarDatos(String[] nombres, double[] calificaciones, Scanner scanner) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            scanner.nextLine(); // Consumir el salto de línea
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la calificacion de " + nombres[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
        }
    }

    public static void mostrarDatos(String[] nombres, double[] calificaciones) {
        System.out.println("\nLista de estudiantes y sus calificaciones:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + calificaciones[i]);
        }
    }

    public static void calcularEstadisticas(double[] calificaciones) {
        double suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (double nota : calificaciones) {
            suma += nota;
            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        double promedio = suma / calificaciones.length;
        System.out.println("\nEstadisticas:");
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Calificacion mas alta: " + max);
        System.out.println("Calificacion mas baja: " + min);
    }
}
