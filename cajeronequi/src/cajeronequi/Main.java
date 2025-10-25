package cajeronequi;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ea = new Scanner(System.in);

        ArrayList<String> bancos = new ArrayList<>();
        bancos.add("Nequi");
        bancos.add("Banco Cock");

        System.out.print("ingresar su nombre de usuario: ");
        String nombreUsuario = ea.nextLine();

        Persona_1 persona = new Persona_1(nombreUsuario);
        saldoPersona cuenta = new saldoPersona(1000.0);

        System.out.println("\nBienvenido al cajero automático, " + persona.getNombre());
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Retirar");
        System.out.println("2. Consignar");
        int opcion = ea.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("¿Dónde desea retirar?");
                for (int i = 0; i < bancos.size(); i++) {
                    System.out.println((i + 1) + ". " + bancos.get(i));
                }

                int bancoElegido = ea.nextInt();
                

                System.out.print("cuanto desea retirar?: ");
                double cantidadRetiro = ea.nextDouble();

                if (bancoElegido >= 1 && bancoElegido <= bancos.size()) {
                    String bancoSeleccionado = bancos.get(bancoElegido - 1);

                    if (cantidadRetiro <= cuenta.getSaldo()) {
                        cuenta.setSaldo(cuenta.getSaldo() - cantidadRetiro);
                        System.out.println("Retiro exitoso desde " + bancoSeleccionado + ".");
                    } else {
                        System.out.println("no tiene suficiente saldo para retirar, favor de digitar  la cantidad correcta");
                    }
                } else {
                    System.out.println("opcion invalida, inténtelo otra vez.");
                }
                break;

            case 2:

                System.out.println("¿Dónde desea consignar?");
                for (int i = 0; i < bancos.size(); i++) {
                    System.out.println((i + 1) + ". " + bancos.get(i));
                }

                int bancoConsignar = ea.nextInt();
                
                if (bancoConsignar >= 1 && bancoConsignar <= bancos.size()) {
                    String bancoSeleccionado = bancos.get(bancoConsignar - 1);

                    System.out.print("¿Cuánto quiere consignar?: ");
                    double cantidadConsignar = ea.nextDouble();

                    cuenta.setMonto(cuenta.getMonto() + cantidadConsignar);
                    System.out.println("Consignación exitosa en " + bancoSeleccionado + ".");
                } else {
                    System.out.println("Opción inválida, inténtelo otra vez.");
                }
                break;

            default:
                System.out.println("Opción no encontrada, por favor intente de nuevo.");
                break;
        }

        System.out.println("\nInformación de la cuenta de " + persona.getNombre());
        System.out.println(persona.setmostrarInfo());
        System.out.println("Saldo actual: " + cuenta.getSaldo());

    }
}
