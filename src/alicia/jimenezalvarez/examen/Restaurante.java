package alicia.jimenezalvarez.examen;

import java.util.Scanner;

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
		Plato platos[] = { plato1, plato2, plato3 };
		Plato platos2[] = { plato4, plato5 };

		// 2 bebidas
		Bebida bebida1 = new Bebida("botella de vino", 12);
		Bebida bebida2 = new Bebida("botella de agua", 2);
		Bebida bebidas1[] = { bebida1 };
		Bebida bebidas2[] = { bebida2 };

		// y 2 cartas una de las cartas tendrá tres platos y una bebida y la otra carta
		// 2 platos y una bebida
		Carta carta1 = new Carta("Menu general", platos, bebidas1);
		Carta carta2 = new Carta("Menu del día", platos2, bebidas2);
		Carta cartas[] = { carta1, carta2 };

		Restaurante restaurante = new Restaurante();
		restaurante.mostrarCarta(cartas);
		// restaurante.eligeCarta(cartas);
		restaurante.indicarImporte(cartas);
	}
//  4. Método que muestre el contenido de cada carta mostrando solo los platos disponibles (1.5 puntos)

	public void mostrarCarta(Carta... cartas) {

		for (Carta cartaList : cartas) {
			System.out.println(cartaList.getNombre());
			Plato arrayPlatos[] = cartaList.getPlatos();
			for (Plato platoList : arrayPlatos) {
				if (platoList.isDisponible())
					System.out.println(platoList.getNombre());
			}
			Bebida arrayBebidas[] = cartaList.getBebidas();
			for (Bebida bebidaList : arrayBebidas)
				System.out.println(bebidaList.getNombre());
		}

	}

//	   5. Método que pida al usuario qué carta de la que tiene el restaurante desea. (1.5 puntos)
	public void eligeCarta(Carta... cartas) {
		for (Carta cartaList : cartas) {

			String carta = pideDato("Elige una carta:" + cartaList.getNombre());
			System.out.println("Has elegido la carta: " + carta);

		}

	}

	// 6. Indicar el importe de todos los productos de la carta seleccionada por el
	// usuario. (2 puntos)
	public void indicarImporte(Carta... cartas) {
		for (Carta cartaList : cartas) {
			Plato arrayPlatos[] = cartaList.getPlatos();
			Bebida arrayBebidas[] = cartaList.getBebidas();

			double i = 0;
			for (Plato platoList : arrayPlatos)

			{
				if (platoList.isDisponible())

					i = i + platoList.getPrecio();

			}
			for (Bebida bebidaList : arrayBebidas) {
				i= i +bebidaList.getPrecio();
			}
			
			System.out.println("El precio final es: " + i);

		}

	}

	public static String pideDato(String texto) {
		String reply = null;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		reply = scan.nextLine();

		return reply;
	}
}
