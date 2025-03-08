package org.Alpha;

/*
* Esta auto evaluacion esta hecha para medir mis conocimientos actuales en Java,
*  Hecha por grok3 (X)
*
* */

import java.util.*;

/*
* sección 1: Conceptos Básicos (20 puntos)
(5 puntos)
Escribe un programa en Java que solicite al usuario un número entero mediante Scanner y determine si es par o impar.
*  Imprime un mensaje claro con el resultado.
Ejemplo de salida: "El número 4 es par" o "El número 7 es impar".

(5 puntos)
¿Qué hace la siguiente línea de código? Explica brevemente y escribe el resultado si x = 10.
java

int y = x / 3 + x % 3;

*/
public class AutoExamen {
    public static void main(String[] args) {
        // 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Numero Entero");

        int opcUsr = teclado.nextInt();
        if ((opcUsr % 2) == 1){
            System.out.println(opcUsr + "Es impar");
        }else{
            System.out.println("Es par");
        }
        // 2
        // y = 10/3 + 10 % 3;
        // y es igual al valor de las operaciones en corrido de izquierda a derecha,
        // al no tener parentesis no se prioriza el orden jerarquico
        // y = 3.3333 + 10 = 33.3333
        // y = 33.333 % 3 = 0
        // y es igual a 0
        // el operador / hace una division y el % nos da el residuo de la division, por ejemplo 33 % 3 = 0 ya que cabe 11 veces (exacto)

        // 3
        // Crea un arreglo con los números del 1 al 10.
        // Usa un bucle for para imprimir solo los números que son múltiplos de 3. Usa un arreglo y el operador módulo (%).
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            if(i % 3 == 0){
                System.out.println("El numero: " + i + " Es multiplo de 3");
            }
        }

        /*
        * Sección 2: Estructuras de Control (20 puntos)
        (10 puntos)
        Escribe un programa que tome un número entero positivo como entrada usando Scanner y determine si es un número primo.
        *  Un número primo es divisible solo por 1 y por sí mismo. Imprime un mensaje indicando si es primo o no.
        Ejemplo: Para 7, imprime "7 es primo"; para 4, imprime "4 no es primo".
        * * */

        System.out.println("ingrese numero Entero positivo ");
        int opcUsr2 = teclado.nextInt();
        // opcUsr2 % 2 == 0 || opcUsr2 % 3 == 0
        // 2 % 2 == 0 || 2 % 3 == 1
        // 3 % 2 == 1 || 3 % 3 == 0
        // 12 % 2 == 0 || 12 % 3 == 0
        if ((opcUsr2 % 2) != 0 && (opcUsr2 % 3) != 0){
            System.out.println(opcUsr2 + " Es primo " );
        }else {
            System.out.println("No es primo");
        }

        /*
        (10 puntos)
        Usa un bucle while para imprimir los primeros 5 números de la serie de Fibonacci (0, 1, 1, 2, 3, ...).
        * Explica cómo funciona tu lógica en una o dos frases.
        * */
        int n = 1;
        int[] m = new int[7];
        m[0] = 1;
        while (n < m.length -1){
            m[n + 1] = m[n] + m[n-1];
            System.out.println(m[n]);
            n += 1;
        }
        // m = n-1 + n-2

        /*
        * Sección 3: Métodos (20 puntos)
        (10 puntos)
        Define un metodo público estático llamado calcularPromedio que tome un arreglo de double como argumento y
        *  devuelva el promedio de esos números. Prueba el metodo con el arreglo {4.0, 8.0, 15.0, 16.0, 23.0} e imprime el resultado.
        */
        double[] calificaciones = {4.0,8.0,15.0,16.0,23.0};
        System.out.println(calcularPromedio(calificaciones));

        /*
        (10 puntos)
        Crea un metodo público estático llamado esPalindromo que reciba una cadena (String)
        * como argumento y devuelva true si es un palíndromo (se lee igual al revés,
         ignorando mayúsculas/minúsculas y espacios) y false si no lo es. Prueba con las cadenas "radar" y "hola".
        Ejemplo: "radar" → true, "hola" → false.
        */
        System.out.println(esPalindromo("radar"));
        System.out.println(esPalindromo("jola"));


        /*
        *
        * Sección 4: Manejo de Datos y Estructuras (20 puntos)
        (10 puntos)
        Dado un HashMap que representa una lista de estudiantes y sus notas:
        * Escribe un programa que imprima el nombre del estudiante con la nota más alta y su valor.
        */
        HashMap<String, Integer> estudiantes = new HashMap<>();
        estudiantes.put("Ana", 85);
        estudiantes.put("Luis", 92);
        estudiantes.put("María", 78);
        estudiantes.put("Pedro", 95);
        for (int i = 0; i < estudiantes.size(); i++) {
            int valor;
            for (Map.Entry<String, Integer> s : estudiantes.entrySet()){
                valor = s.getValue();

            }
        }

        /*
        (10 puntos)
        Crea un arreglo de objetos Persona (define una clase simple con nombre y edad)
        *  con al menos tres instancias (ejemplo: new Persona("Ana", 25), new Persona("Luis", 30)).
        * Usa un bucle for para generar una nueva lista (ArrayList) con los nombres de las personas mayores de 28 años.
        *
        */
        ArrayList<String> listaNombres = new ArrayList<>();
        Persona persona1 = new Persona(listaNombres,"Luis", 20);
        Persona persona2 = new Persona(listaNombres,"Ana", 30);
        Persona persona3 = new Persona(listaNombres,"Felipe", 15);
        Persona persona4 = new Persona(listaNombres,"Nahomi", 19);
        for (String s : listaNombres){
            System.out.println(s);
        }

        /*
        * Sección 5: Resolución de Problemas (20 puntos)
        (20 puntos)
           Escribe un programa que resuelva el siguiente problema:
           Una tienda ofrece un descuento del 10% en compras mayores a $100 y un descuento adicional del 5%
           * si el cliente es miembro (identificado por un valor booleano esMiembro).
           * Dado el monto de la compra y si el cliente es miembro, calcula el precio final
           *  después de aplicar los descuentos correspondientes.

        Pide al usuario el monto de la compra y si es miembro (ingresando "sí" o "no" con Scanner).

        Aplica las reglas de descuento y muestra el precio original, el descuento total y el precio final.
           Ejemplo de salida:

        Monto original: $150.00
        Descuento aplicado: $22.50
        Precio final: $127.50
        * */

        System.out.println("Ingrese monto total");
        double montoTotal = teclado.nextDouble();
        double montoFinal = montoTotal;
        if(montoTotal >= 100.0){
            montoFinal = montoTotal - montoFinal * .10;
            System.out.println("¿Es miembro? : SI || NO");
            String esMiembro = teclado.next();
            if (esMiembro.toLowerCase().contains("si")){
                montoFinal = montoFinal - montoFinal * .05;
            }
        }
        System.out.println("Precio Final : " + montoFinal);

    }
    public static double calcularPromedio(double[] args){
        double total = 0;
        //int cantidadMaterias =
        for (int i = 0; i < args.length; i++){
            total = total + args[i];
        }
        return (total/args.length);
    }

    public static boolean esPalindromo(String args){
        StringBuilder str = new StringBuilder();
        for (int i = args.length()-1; i >= 0; i--){
            str.append(args.charAt(i));
        }
        if (str.toString().equals(args)){
            return true;
        }
        return false;
    }

}

class Persona{

    String nombre;
    int edad;
    public Persona(ArrayList<String> listaNombres, String nombre, int edad){
        if (edad > 28){
            listaNombres.add(nombre);
        }
        this.nombre = nombre;
        this.edad = edad;
    }

}

/*
*Comentarios y Análisis
* Calificacion 59/100
Aún no alcanzas el mínimo de 60/100 para aprobar.

Fortalezas:
El método calcularPromedio sigue siendo correcto y sólido.

Debilidades:
Errores lógicos persisten (preguntas 1, 3, 4, 7), especialmente en bucles y condiciones.

La pregunta 8 sigue incompleta, y el cálculo de descuentos (pregunta 10) tiene errores matemáticos.

El tiempo de 2 horas sugiere que necesitas practicar para optimizar tu enfoque.

Sugerencias:
Revisa la diferencia entre índices y valores en arreglos (pregunta 3).

Aprende a implementar correctamente la lógica de números primos (pregunta 4) usando un bucle hasta n\sqrt{n}\sqrt{n}

Para descuentos, usa multiplicación por (1 - descuento) en lugar de restas consecutivas.

Calificación Final: 59/100 (No aprobado).

*
*/