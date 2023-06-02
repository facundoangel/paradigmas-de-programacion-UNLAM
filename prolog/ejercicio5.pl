parcial1(ana,7).
parcial1(juan,4).
parcial1(martin,4).
parcial1(jose,10).
parcial1(natalia,9).

parcial2(ana,9).
parcial2(juan,8).
parcial2(martin,5).
parcial2(jose,10).
parcial2(natalia,1).


prom_materia(X,Y):-
    parcial1(X,Nota1),
    parcial2(X,Nota2),
    Y is (Nota1 + Nota2) / 2.
    
