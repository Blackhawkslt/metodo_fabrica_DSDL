public class FabricaDeAutomoviles {
    public Producto creaProducto(String tipo1){
        if (tipo1.equals("Ferrari")){
            return new Ferrari();
        }else if (tipo1.equals("Hyundai")){
            return new Hyundai();
        }else{
            return null;
        }
    }
}