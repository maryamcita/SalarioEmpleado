import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpledo, documentoEmpleado, diaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double horasExtra = 0;
        double valorHoraExtra = 0;
        double totalHorasExtras = 0;
        System.out.println("ingrese el nombre del empleado");
        nombreEmpledo = sc.nextLine();
        System.out.println("ingrese el documento del empleado");
        documentoEmpleado = sc.nextLine();
        System.out.println("ingrese el dia de descanso solamente de lunes a viernes");
        diaDescanso = sc.nextLine();

    }
}



