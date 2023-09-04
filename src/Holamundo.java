public class Holamundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");

        double valorCompra = 250.00;
        double valorParcial;
        double valorFinal;
    

        if(valorCompra >= 100.00 && valorCompra <= 199.99 ){

            valorParcial = valorCompra * 0.10;
            valorFinal = valorCompra - valorParcial;
            System.out.println("El valor final con descuento es " + valorFinal);
        } else if (valorCompra >= 200.00 && valorCompra <= 299.99){
            valorParcial = valorCompra * 0.15;
            valorFinal = valorCompra - valorParcial;
            System.out.println("El valor final con descuento es " + valorFinal);
        } else{
            valorParcial = valorCompra * 0.20;
            valorFinal =   valorCompra - valorParcial ;
            System.out.println("El valor final con descuento es " + valorFinal);
        }

        }

    }


