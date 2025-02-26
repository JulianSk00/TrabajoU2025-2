/*
 * Una heladería desea obtener un reporte semanal de ventas. 
 * Para ello debe capturar en un sistema todas las facturas de ventas realizadas. 
 * Cada factura contiene la cantidad y el sabor de las paletas vendidas. 
 * Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
fresa ($2000) y crema ($3000). 
El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. 
Considere que una factura puede tener varias paletas de diferentes sabores.
 */

import java.util.Scanner;

public class ReporteHeladeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean indSabor = true, indFac = true;
        int acumLimon = 0, acumNuez = 0, acumLulo = 0, acumFresa = 0, acumCrema = 0;
        int numFac =1;

        while (indFac) {
            System.out.println("No. Fac: "+numFac);
            indSabor=true;
            while (indSabor) {
                System.out.println("Menú Sabores");
                System.out.println("1 - Limón");
                System.out.println("2 - Nuez");
                System.out.println("3 - Lulo");
                System.out.println("4 - Fresa");
                System.out.println("5 - Crema");
                System.out.print("Seleccione un sabor: ");
                int sabor = sc.nextInt();
                sc.nextLine();
                switch (sabor) {
                    case 1:
                        System.out.print("Cantidad de paletas de limón: ");
                        int cantL = sc.nextInt();
                        sc.nextLine();
                        // Validar la cantidad ingresada
                        acumLimon += cantL;
                        break;
                    case 2:
                        System.out.print("Cantidad de paletas de nuez: ");
                        int cantN = sc.nextInt();
                        sc.nextLine();
                        // Validar la cantidad ingresada
                        acumNuez += cantN;
                        break;
                        case 3:
                        System.out.print("Cantidad de paletas de lulo: ");
                        int cantLulo = sc.nextInt();
                        sc.nextLine();
                        acumLulo += cantLulo;
                        break;
                        case 4:
                        System.out.print("Cantidad de paletas de fresa: ");
                        int cantFresa = sc.nextInt();
                        sc.nextLine();
                        acumFresa += cantFresa;
                        break;
                        case 5:
                        System.out.print("Cantidad de paletas de crema: ");
                        int cantCrema = sc.nextInt();
                        sc.nextLine();
                        acumCrema += cantCrema;
                        break;
                    // Incluir para los otros sabores

                    default:
                        System.out.println("Error en el sabor ingresado");
                }
                System.out.print("Desea incluir otro sabor: (S/N)");
                String rta = sc.nextLine();
                //sc.nextLine();
                // if(rta=="S")
                if (rta.toUpperCase().equals("S"))
                    indSabor = true;
                else
                    indSabor = false;

            }

            System.out.print("Desea incluir otra factura: (S/N)");
            String rta = sc.nextLine();
            // if(rta=="S")
            if (rta.toUpperCase().equals("S")){
                indFac = true;
                numFac++;
            }
                
            else
                indFac = false;
        }
        System.out.println("Sabor       CantVenta       TotVenta");
        System.out.println("Limon       "+acumLimon+"       "+(acumLimon*2500));
        System.out.println("Nuez        "+acumNuez+"       "+(acumNuez*2800));
        System.out.println("Lulo        "+acumLulo+"       "+(acumLulo*2600));
        System.out.println("Fresa       "+acumFresa+"       "+(acumFresa*2000));
        System.out.println("Crema       "+acumCrema+"       "+(acumCrema*3000));
        System.out.println("Venta Total: "+((acumLimon*2500)+(acumNuez*2800)+(acumLulo*2600)+(acumFresa*2000)+(acumCrema*3000)));
        

    }

}
