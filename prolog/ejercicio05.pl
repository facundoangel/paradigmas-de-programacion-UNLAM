parcial1(ana,7).
parcial1(juan,4).
parcial1(martin,4).
parcial1(jose,10).
parcial1(natalia,9).
parcial1(juancruz,1).
parcial1(federico,10).

parcial2(ana,9).
parcial2(juan,8).
parcial2(martin,5).
parcial2(jose,10).
parcial2(natalia,1).
parcial2(juancruz,2).
parcial2(federico,10).


nota_final(X,Y):-
    parcial1(X,Nota1),
    parcial2(X,Nota2),
    Y is (Nota1 + Nota2) / 2.

%1. El listado de los alumnos que promocionan la materia, indicando el nombre
% y la nota final (promedio de los dos parciales), para cada uno.
prom_materia(X,Y):-
    nota_final(X,Y),
    Y >= 7.

%2. El listado de los alumnos que obtendrán la cursada.
cursada_materia(X,Y):-
    nota_final(X,Y),
    Y >= 4.

%3.El listado de los alumnos que recursan la materia.
recursa_materia(X,Y):-
    nota_final(X,Y),
    Y < 4.

%4.A fin de entregar la medalla al mérito, encontrar de aquellos que
%promocionan, el o los alumnos con mayor nota final.
menores_que(X,Y,NotaMayor):-
    prom_materia(X,Y),
    Y > NotaMayor.
    

mayor_promedio(X,Y):-
    prom_materia(X,Y),
    \+ menores_que(_,_,Y).
    