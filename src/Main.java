public class Main {
    public static void main(String args []){
        String estacion_del_año = "Otoño";
        if(estacion_del_año == "Verano"){
            System.out.println("***Estamos en verano***");
            System.out.println("Beber agua");
            System.out.println("Ir a la playa");
            System.out.println("Usar sombrero");
        }else{
            System.out.println("**Estamos en otra estacion** ");
        }

        ///////////////////////////////////////////////////////
        //working with while
        int contador = 10;
        while(contador > 0 ){
            System.out.println("El valor de contador va por: " + contador);
            //contador = contador-1;
            contador--;
        }
        System.out.println("**********************");
        /////////////////////////////////////////////////////
        // working with Dowhile
        int Dw  = 5;
        do{
            System.out.println("El valor dentro de Dowhile: " + Dw);
            Dw--;
        }while (Dw > 1);

        /////////////////////////////////////////////////////
        // working at For
        for (int iterandoConFor = 1; iterandoConFor <= 10; iterandoConFor++) {
            System.out.println(" valor dentro de for: " + iterandoConFor);
        }
        System.out.println("********************");

        int valores[] = {10,20,30,40};
        for (int i = 0; i < valores.length; i++) {
            System.out.println("valor dentro de array: " + valores[i]);
        }
        System.out.println("********************");
        ///////////////////////////////////////////////////////
        // working at swicht
         var  estaciones = "enero-febrero-marzo";
            switch (estaciones){
                case "mayo-junio-julio":
                    System.out.println("mayo,junio,julio es: verano");
                    break;
                case "agosto-septiembre-octubre":
                    System.out.println("agosto, septiembre,octubre es: otoño");
                    break;
                case "noviembre-diciembre-enero":
                    System.out.println("noviembre,diciembre,enero es: invierno");
                    break;
                case "enero-febrero-marzo":
                    System.out.println("enero,febrero,marzo son meses de verano");
                    break;
                default:
                    System.out.println("3 de verano, 3 de otoño y 3 de invierno");
            }
    }
}
