padre_de(pedro,alberto).
padre_de(matias,jore).
padre_de(federico, juan).
padre_de(felipe, alberto).
padre_de(alberto, carlos).


madre_de(maria,marta).
madre_de(felipe,ana).
madre_de(rodrigo,maria).


hijo_de(Progenitor,Hijo):-
    padre_de(Progenitor,Hijo);
    madre_de(Progenitor,Hijo).

abuelo_de(Nieto,Abuelo):-
    hijo_de(Nieto,Progenitor),
    hijo_de(Progenitor,Abuelo).

   
    