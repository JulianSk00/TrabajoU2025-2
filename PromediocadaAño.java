import java.util.Random;

public class PromediocadaAño {
    public static void main(String[] args) {
      String[] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        int[]dias={31,28,31,30,31,30,31,31,30,31,30,31};
        int[][]temperatura= new int[12][];
        var random=new Random();
        int sumaAnual=0;
        int maxAnual=Integer.MAX_VALUE;
        int minAnual=Integer.MIN_VALUE;
        //generamos las temperaturas para cadia dia del mes
        for (int i=0;i<12; i++){
            temperatura[i]=new int[dias[i]];
            int sumaMes=0;
            int maxMes=Integer.MAX_VALUE;
            int minMes=Integer.MIN_VALUE;
            for (int j=0;j<dias[i];j++){
                temperatura[i][j]=new Random().nextInt(40)-5;
                System.out.println(i+"-"+ temperatura[i][j]);
                sumaMes+= temperatura[i][j];
                sumaAnual+= temperatura[i][j];
                maxMes=Math.max(maxMes, temperatura[i][j]);
                minMes=Math.min(minMes,temperatura[i][j]);
                maxAnual=Math.max(maxAnual,temperatura[i][j]);
                minAnual=Math.min(minAnual,temperatura[i][j]);

            }
            System.out.println("mes: "+meses[i]);
            System.out.println("Promedio: "+(double)sumaMes/dias[i]+"grados");
            System.out.println("maxima: "+maxMes+ "grados");
            System.out.println("minima: "+minMes+"grados");
            System.out.println("----------------");
            int totaldias=0;
            for (int diaa:dias){
                totaldias+=diaa;
            }
            System.out.println("promedio anual: "+(double)sumaAnual/totaldias+"grados");
            System.out.println("maximo anual: "+maxAnual+"grados");
            System.out.println("minimo anual: "+minAnual+"grados");

        }
    }
}
