parcial1(ana,7).
parcial1(juan,4).
parcial1(martin,4).
parcial1(jose,10).
parcial1(natalia,9).
parcial1(juancruz,1).
parcial1(federico,10).
parcial1(facundo,6).

parcial2(ana,9).
parcial2(juan,8).
parcial2(martin,5).
parcial2(jose,10).
parcial2(natalia,1).
parcial2(juancruz,2).
parcial2(federico,10).



evaluar_presentismo(X,Y):-
    (	(
          parcial1(X,_)
        	,
          \+ parcial2(X,_)
        )
    ;
    	(	
    	\+parcial1(X,_)
    		,
    	parcial2(X,_))
    ),
    Y = ausente.



calculo_nota(X,Y):-
    parcial1(X,Nota1),
    parcial2(X,Nota2),
    Y is (Nota1 + Nota2) / 2.


nota_final(X,Y):-
    evaluar_presentismo(X,Y);
    calculo_nota(X,Y).


    