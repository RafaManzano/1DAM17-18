package main;

import java.util.Scanner;

import funcionalidades.funcionalidadesCopiadas;

public class mainCopiado {

    public static void main(String[] args) {

        //Scanner para las palabras
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        //Constantes
        final int PUNTUACION_SUPERAR = 3;
        final int NUMERO_ERRORES = 6;
        final int NUMERO_JUGADORES = 2;
        final int NUMERO_CARACTERES = 26;

        //Variables y arrays usados
        String jugadores[] = new String[NUMERO_JUGADORES];
        int puntos[] = new int[NUMERO_JUGADORES];
        int turno = 0, numeroErrores = NUMERO_ERRORES; //Controla a quien le toca
        String palabraElegida, pista, palabraAdivinar, palabraUsuario;
        char abecedario[] = funcionalidadesCopiadas.generaCaracteres(); // Genera in array con los caracteres de A-Z, no se incluye la ñ
        boolean caracteresInsertados[] = new boolean[NUMERO_CARACTERES];

        //Pedimos el nombre de los jugadores
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = funcionalidadesCopiadas.pedirString(sn, "Escribe el nombre del jugador " + (i + 1));
        }

        while (!funcionalidadesCopiadas.fin(puntos, PUNTUACION_SUPERAR)) {

            //Validamos la palabra y la pista
            palabraElegida = funcionalidadesCopiadas.validar(sn,
                    "Escribe una palabra con solo caracteres y sin espacios, Jugador: " + jugadores[turno],
                    "Error, escribe palabra con solo caracteres y sin espacios y de longitud de mas de 1");

            pista = funcionalidadesCopiadas.validar(sn,
                    "Escribe una pista con solo caracteres y sin espacios, Jugador: " + jugadores[turno],
                    "Error, escribe pista con solo caracteres y sin espacios");

            funcionalidadesCopiadas.espacios(30); //añadimos espacios para que el otro jugador no vea
            palabraAdivinar = funcionalidadesCopiadas.rellenaGuiones(palabraElegida); //rellenamos la palabraAdivinar con guiones

            //ahora toca adivinar la palabra
            while (!funcionalidadesCopiadas.palabraCorrecta(palabraElegida, palabraAdivinar) && numeroErrores > 0) {

                //mostamos la pista, la palabra y los repetidos
                System.out.println("Pista: " + pista);
                funcionalidadesCopiadas.mostrarPalabra(palabraAdivinar);
                funcionalidadesCopiadas.mostrarRepetidos(abecedario, caracteresInsertados);

                //el jugador escribe
                palabraUsuario = funcionalidadesCopiadas.pedirString(sn, "Escribe una letra, si escribes una palabra sera como escribir la solucion, Jugador: " + jugadores[turno]).toLowerCase();

                //si la longitud es de una, podemos decir que quiere poner una letra
                if (palabraUsuario.length() == 1) {

                    if (Character.isAlphabetic(palabraUsuario.charAt(0))) {

                        if (funcionalidadesCopiadas.caracterIntroducido(caracteresInsertados, palabraUsuario.charAt(0))) {
                            System.out.println("El caracter ya esta puesto, elige otro");
                        } else if (funcionalidadesCopiadas.numRemplazos(palabraElegida, palabraUsuario.charAt(0)) > 0) {
                            palabraAdivinar = funcionalidadesCopiadas.remplazar(palabraElegida, palabraAdivinar, palabraUsuario.charAt(0));
                        } else {
                            numeroErrores--;
                            System.out.println("Error, te quedan " + numeroErrores + " errores");
                        }
                        funcionalidadesCopiadas.actualizarInsertados(caracteresInsertados, palabraUsuario.charAt(0));
                    }

                    //si es mas de una letra, el jugador quiere intentar adivinarlo
                } else if (!funcionalidadesCopiadas.palabraCorrecta(palabraElegida, palabraUsuario)) {
                    numeroErrores--;
                    System.out.println("Error, no es la palabra correcta");
                } else {
                    //Si entramos aqui, significa que la plabra es correcta, necesitamos asignar la palabra del usuario a la de adivinar
                    //Otra solucion podria ser poner en la condicion otra llamada al metodo palabraCorrecta
                    palabraAdivinar = palabraUsuario;
                    System.out.println("Correcto, has acertado");
                }
            }

            //Si el numero de errores es mayor que cero, significa que hemos acertado la palabra
            if (numeroErrores > 0) {
                //Suma puntos el resto de jugadores y se cambia el turno
            	funcionalidadesCopiadas. sumaPuntosOtroJugador(puntos, 1, turno);
                turno = funcionalidadesCopiadas.cambiaTurno(turno, jugadores.length - 1);
            } else {
                //el usuario que puso la palabra suma un punto y continua escribiendo la palabra
                puntos[turno]++;
            }

            //Mostramos las puntuaciones de los jugadores
            funcionalidadesCopiadas.mostrarPuntuaciones(jugadores, puntos);

            //reiniciamos los errores y los caracteres insertados
            numeroErrores = NUMERO_ERRORES;
            funcionalidadesCopiadas.actualizarInsertados(caracteresInsertados);

        }

        //Indicamos el ganador
        funcionalidadesCopiadas.mostrarGanador(puntos, jugadores, PUNTUACION_SUPERAR);

        System.out.println("Fin");

    }
}
