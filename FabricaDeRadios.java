public class FabricaDeRadios {
    public Producto creaProducto(String tipo2){
        if (tipo2.equals("Sony")){
            return new Sony();
        }else if (tipo2.equals("Pioneer")){
            return new Pioneer();
        }else{
            return null;
        }
    }
}