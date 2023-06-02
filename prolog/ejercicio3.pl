hombre(pedro) .
hombre(manuel) .
hombre(arturo) .
mujer(maría).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría).


    


niño(X,Y):- % expresa que X es hijo o hija de Y.
	padre(Y,X).    
hijo(X,Y):- % expresa que X es un hijo varón de Y.
	hombre(X),
	padre(Y,X).
hija(X,Y):- % expresa que X es una hija de Y.
    mujer(X),
	padre(Y,X).
hermano_o_hermana(X,Y):- % expresa que X es hermano o hermana de Y.
    niño(X,Padre),
    niño(Y,Padre).

hermano(X,Y):- % expresa que X es un hermano de Y.
    niño(X,Padre),
    niño(Y,Padre),
    hombre(X).
hermana(X,Y):- % expresa que X es una hermana de Y.
	niño(X,Padre),
    niño(Y,Padre),
    mujer(X).