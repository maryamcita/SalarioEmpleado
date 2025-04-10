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
        System.out.println ("ingrese el valor de la hora");
        valorHora = sc.nextDouble();  
        System.out.println ("ingrese la cantidad de horas trabajadas");
        horasTrabajadas = sc.nextDouble();
        salarioBruto = horasTrabajadas * valorHora;
        if(salarioBruto<=valorSalarioMinimo*2){
            auxilioTransporte = 200000;
            bonificacionEmpleado = salarioBruto * 0.1;
        }else{
            auxilioTransporte = 0;
            bonificacionEmpleado = 0;
        }
        deduccionPension = salarioBruto * 0.04;
        deduccionSalud = salarioBruto * 0.04;
        if(horasTrabajadas > 96){
            horasExtra = horasTrabajadas - 96;
            valorHoraExtra = valorHora * 1.25;
            totalHorasExtras = horasExtra * valorHoraExtra;  
            
        }
        if(horasTrabajadas < 24){
            System.out.println("aun no le puedo pagar, trabaje mas");
        } else {
            salarioNeto = salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + bonificacionEmpleado + horasExtra;
            System.out.println("El empleado" + nombreEmpledo);
            System.out.println("Con numero de documento:" + documentoEmpleado);
            System.out.println("el salario del empleado es:" + salarioNeto);
            System.out.println("esta es la cantidad a pagar por sus horas extra:" + horasExtra);
            System.out.println("este es el valor a pagar por su auxilio " + auxilioTransporte);
            System.out.println("el porcentaje de tus prestaciones sociales" + deduccionPension + deduccionSalud);

        }
    }
}



