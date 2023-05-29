entrada(paella).
entrada(gazpacho).
entrada(consome).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).



% 1.¿Cuáles son los menús que ofrece el restaurante?
menu(Entrada,Plato,Postre):-
    entrada(Entrada),
	(carne(Plato);
    pescado(Plato)),
    postre(Postre).
    
% 2.¿Cuáles son los menús que tienen Consomé en las entradas?
menu_con_consome(Plato,Postre):-
    menu(consome,Plato,Postre).

% 3.¿Cuáles son los menús que no contienen flan como postre?

menu_sin_flan(Entrada,Plato,Postre):-
    menu(Entrada,Plato,Postre),
    Postre \== flan.

    