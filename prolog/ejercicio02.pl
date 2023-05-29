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

bebida(vino).
bebida(cerveza).
bebida(aguaMineral).

menu(Entrada,Plato,Postre,Bebida):-
    entrada(Entrada),
	(carne(Plato);
    pescado(Plato)),
    postre(Postre),
    bebida(Bebida).