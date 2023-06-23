# Guía de Ejercicios: Prolog

Resolver los siguientes ejercicios utilizando el lenguaje de programación Prolog, con el paradigma lógico.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01
Las siguientes clausulas corresponden al programa "menú" de un restaurante. El restaurante ofrece menús completos compuestos por una entrada, un plato principal y un postre. El plato principal puede ser carne o pescado.

```prolog
entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).
```

Implementar las reglas necesarias para formular las siguientes consultas en Prolog:
1. ¿Cuáles son los menús que ofrece el restaurante?
2. ¿Cuáles son los menús que tienen Consomé en las entradas?
3. ¿Cuáles son los menús que no contienen flan como postre?

## Ejercicio 02
Completar el programa "menú" de manera que una comida esté formada también por la elección de una bebida, a elegir entre vino, cerveza o agua mineral.

## Ejercicio 03
El árbol genealógico siguiente se describe con el programa Prolog:

```prolog
hombre(pedro) .
hombre(manuel) .
hombre(arturo) .
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría) .
```

A partir de estas afirmaciones, formular las reglas generales de:

```prolog
niño(X,Y) % expresa que X es hijo o hija de Y.
hijo(X,Y) % expresa que X es un hijo varón de Y.
hija(x,y) % expresa que X es una hija de Y.
hermano-o-hermana(X,Y) % expresa que X es hermano o hermana de Y.
hermano(X,Y) % expresa que X es un hermano de Y.
hermana(X,Y) % expresa que X es una hermana de Y.
```

> **Nota:** Un individuo no puede ser hermano ni hermana de sí mismo.

## Ejercicio 04
Una agencia de viajes propone a sus clientes viajes de una o varias semanas a Roma, Londres o Túnez. El catálogo de la agencia contiene, para cada destino, el precio del transporte (con independencia de la duración) y el precio de una semana de estancia que varía según el destino y el nivel de comodidad elegidos: hotel, hostal o camping.

Escribir el conjunto de declaraciones que describen este catálogo (se muestra a continuación).

```prolog
transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).
```

1. Expresar la relación `viaje(C,S,H,P)` que se interpreta por:
"el viaje a la ciudad `C` durante `S` semanas con estancia en `H` cuesta `P` pesos"
2. Completar con `viajeeconomico(C,S,H,P,Pmax)` que expresa que el costo `P` es menor que `Pmax` pesos.

## Ejercicio 05
Se dispone de un listado con los resultados de los parciales de los alumnos del curso de **Paradigmas de Programación**, organizado de la siguiente manera:

### Versión 1
Se dispone de las notas de ambos parciales para todos los alumnos.

```prolog
parcial1(ana,7).
parcial1(juan,4).
parcial1(julio, 2).
parcial1(maria, 10).

parcial2(ana,9).
parcial2(juan,8).
parcial2(julio, 4).
parcial2(maria, 2).
```

Se desea obtener:
1.
  a. El listado de los alumnos que promocionan la materia
  b. El mismo listado pero esta vez incluyendo la nota final (promedio de los dos parciales) para cada uno
2. El listado de los alumnos que recursan la materia.
3. El listado de los alumnos que obtendrán la cursada. 
4. <maximos> A fin de entregar la medalla al mérito, encontrar de aquellos que promocionan (1b), el o los alumnos con mayor nota final (nombre y nota)
5. <maximos> Ahora se desea obtener cuales fueron las dos notas más altas, considerando simplemente a la nota como el promedio de la nota de parcial1 y parcial2. Solo interesan los números. Un tip es pensar la resolución en dos etapas, la más alta, y después la más alta de lo restante

### Versión 2
El listado se compone de al menos una nota para cada alumno. En caso de que algún alumno adeude uno de los parciales (es decir no tenga un hecho relacionado a su parcial), su condición es ausente.
No se toman en cuenta quienes no dieron ninguno de los parciales.

## Ejercicio 06
Una agencia matrimonial de los años '80 tiene un fichero de candidatos al matrimonio organizado según las declaraciones siguientes:

```prolog
hombre(N,A,C,E).
mujer(N,A,C,E).
```
Donde `N` es el nombre de un hombre o una mujer, `A` su altura (alta, media, baja), `C` el color de su cabello (rubio, castaño, pelirrojo, negro) y `E` su edad (joven,adulta,vieja).

```prolog
gusta(N,M,L,S).
```
Que indica que a la persona `N` le gusta el género de música `M` (clásica, pop, jazz), el género de literatura `L` (aventura, ciencia-ficción, policíaca), y practica el deporte `S` (tenis, natación, jogging).

```prolog
busca(N,A,C,E).
```
Que expresa que la persona `N` busca una pareja de altura `A`, con cabello color `C` y edad `E`.

Se considera que dos personas x e y de sexos diferentes son adecuadas si x conviene a y e y conviene a x.
Se dice que x conviene a y si x conviene físicamente a y (la altura, edad y color de cabello de y son los que busca x) y si, además, los gustos de x e y en música, literatura y deporte coinciden.

## Ejercicio 07
Con el programa 'menú', dado en clase, describir la semántica de las siguientes tres consultas Prolog y decir cuál es el resultado de la ejecución:

```prolog
menu(E,PP,P), !.
menu(E,PP,P), pescado(PP), !.
menu(E,PP,P), !, pescado(PP).
```

Analizar el comportamiento del operador ! (operador de corte o " cut").

## Ejercicio 08
Modificar el programa del **Ejercicio 01** (menú) para poder consultar cual es el menú completo que tiene menor cantidad de calorías (agregando las calorias como parte de la información de los hechos)

## Ejercicio 09
Basado en el ejemplo de paises.pl visto en clase, complete la base de conocimientos `pais_superficie(P,A)` con todos los países de latinoamérica y codifique las reglas prolog que permitan encontrar el país de mayor superficie.

## Ejercicio 10
Dado el listado de vendedores y ventas semestrales se desea obtener el listado anual de comisiones. Las comisiones se liquidan de la siguiente manera:

- 20% del total vendido en el año para aquellos vendedores que hayan tenido ventas en ambos semestres y cada una de ellas supera los $ 20000.
- 10% del total vendido en el año para aquellos vendedores que hayan tenido ventas en ambos semestres, pero no superan los $ 20000 en alguno de estos.
- 5% del total vendido para los vendedores que no registran ventas en algún semestre 

Se dispone de los siguientes datos:

```prolog
ventas1erSem(vendedor, importe).
.
.
ventas2doSem(vendedor, importe).
```

> **Nota:** No todos los vendedores venden en ambos semestres, todos los importes son mayores que cero. En caso de no registrarse ventas en algún semestre, no figura la regla correspondiente para ese vendedor.

## Ejercicio 11: Recursividad

1. Codifique en prolog las reglas necesarias para obtener el término N en la serie de Gauss
2. Codifique en prolog las reglas necesarias para obtener el término N en la serie de Fibonacci (sin, y con mejora)
3. Codifique en prolog las reglas necesarias para obtener el factorial de un número natural N. 
4. Codifique en prolog las reglas necesarias para obtener el producto de dos numeros X e Y, aplicando sumas sucesivas. 
5. Codifique en prolog las reglas necesarias para obtener la potencia N de un numero X aplicando multiplicaciones sucesivas. 
6. Codifique en prolog las reglas necesarias para obtener la el cociente entre dos números a partir de restas sucesivas. 
7. Idem 6, pero que permita obtener el cociente y el resto.
Definir la relación `mcd(X,Y,Z)` que se verifique si Z es el máximo común divisor entre X e Y. 
Por ejemplo:

```prolog
mcd(10,15,X).
> X = 5
```
8. Define un predicado `mcm(X,Y,M)` que signifique "M es el mínimo común múltiplo de X e Y"
