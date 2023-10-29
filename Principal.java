// El presente ejercicio consiste en el diseño de un programa que construya vehiculos e instale radios
// para el ejercicio, se cran dos fabricas, una para automoviles y otra para radios
// en la fabrica de automòviles, conforme a la marca de automovil (Ferrari o Hyundai) que desee crear,de acuerdo al valor ingresado en la vaiable tipo1, ejecutará la construcciòn del vehiculo
// èste mismo principio se aplica de la misma manera para la fàbrica de radios
// para la construccion de cada producto, sean automoviles o radios, se inicializa una interfase llamada producto que ejecutara un mètodo void denominado operacion
// la interfase es entonces implementada en cada una de las clases definidas para cada producto (4 en total) ya sean vehiculos Hyundai y Ferrari, asì como radios Pioneer y Sony
// la fabricas reciben el tipo de vehiculo (Ferrari o Hyundai) y el tipo de radio (Hyundai o Pioneer), y ejecutan el void operacion de la interfase producto, fabricando el vehiculo y el radio deseado
// la salida corresponde a la confirmaciòn del vehiculo fabricado y el radio instalado

public class Principal {
    public static void main(String[] args) {
        FabricaDeAutomoviles fabricaA = new FabricaDeAutomoviles();
        Producto carro1 = fabricaA.creaProducto("Ferrari");
        carro1.operacion();

        FabricaDeRadios fabricaR = new FabricaDeRadios();
        Producto radio1 = fabricaR.creaProducto("Pioneer");
        radio1.operacion();
    }
}
