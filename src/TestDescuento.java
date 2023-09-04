public class TestDescuento {
    public static void main(String[] args) {
        double valorCompra = 250.0;
        double descuento = 0.0;

        if(valorCompra >= 100.00 && valorCompra < 200.00){
            descuento = 10.00;
        } else if (valorCompra >= 200.00 && valorCompra < 300.00){
            descuento = 15.0;
        } else if (valorCompra >= 300.00){
            descuento = 20.00;
        }
    }
}
