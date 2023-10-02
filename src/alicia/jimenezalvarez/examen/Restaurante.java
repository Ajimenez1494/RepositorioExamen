package alicia.jimenezalvarez.examen;

public class Restaurante {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		En la clase restaurante crear el método main donde se crean 5 Platos (uno de ellos no estará disponible)
       Plato plato1 = new Plato("Macarrones boloñesa", 7, true);
       Plato plato2 = new Plato("Macarrones a la marinera", 12, true);
       Plato plato3 = new Plato("Macarrones napolitana", 5, true);
       Plato plato4 = new Plato("Ensalada capresse", 5, false);
       Plato plato5 = new Plato("Rissotto 4 quesos", 10, true);
       Plato platos[]= {plato1, plato2, plato3};
       Plato platos2[]= {plato4, plato5};
       
		// 2 bebidas
       Bebida bebida1= new Bebida("botella de vino", 12);
       Bebida bebida2= new Bebida("botella de agua", 2);
       Bebida bebidas[]= {bebida1, bebida2};
       
	   // y 2 cartas una de las cartas tendrá tres platos y una bebida y la otra carta 2 platos y una bebida
	   Carta carta1 = new Carta("Menu general", platos, bebidas);
	   Carta carta2 = new Carta("Menu general", platos2, bebidas);


	}

}
