public class main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico("A","NACIONAL");
        System.out.println("el precio base es: "+electrodomestico.preciobasico());

        Televisor tv  = new Televisor("A","NACIONAL",false,41);
        System.out.println("el precio base es: "+tv.preciobasico());

        Nevera nevera = new Nevera("A","NACIONAL",140);
        System.out.println("el precio base es: "+nevera.preciobasico());
    }
}