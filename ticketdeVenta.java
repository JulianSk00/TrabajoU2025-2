import java.util.Scanner;

public class ticketdeVenta {
    public static void main(String[] args) {
        System.out.println("**TicketdeVenta***");
        var consola= new Scanner(System.in);
        System.out.print("Precio 1:");
        var precio1=Double.parseDouble(consola.nextLine());
        System.out.print("Precio2:");
        var precio2=Double.parseDouble(consola.nextLine());
        System.out.print("Precio 3:");
        var precio3=Double.parseDouble(consola.nextLine());
        System.out.print("Precio4:");
        var precio4=Double.parseDouble(consola.nextLine());
        //aplicar un descuento
        System.out.print("Aplicar un descuento %?");
        var descuentoprocentaje=Integer.parseInt(consola.nextLine());

        //Precio sin iva
        var siniva =precio1 + precio2 +precio3 + precio4;
        //descuento
        var descuento= siniva * (descuentoprocentaje/100.0);
        //subtotal con despuecto
        var sinivdescuento=siniva - descuento;

        //impuestos
        var impuesto= siniva * 0.16;
        //total
        var costototoal=sinivdescuento + impuesto;

        //Imprimimos
        System.out.printf("""
                %n TICKET DE VENTA
                %n--------------------
                Subtotal: $%.0f
                Descuento: $%.0f (%d%%)
                Impuesto(16%%) $%.0f
                TOTAL: $%.0f""",sinivdescuento,descuento,descuentoprocentaje
                ,impuesto,costototoal);


    }
}
