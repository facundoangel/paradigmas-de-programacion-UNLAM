hombre(carlos, media, rubio, joven).
hombre(roman, alta, pelirrojo, adulta).
hombre(german, alta, rubio, vieja).
hombre(federico, media, negro, joven).
hombre(jorge, media, rubio, adulta).
hombre(juan, media, negro, vieja).
hombre(martin, media, castaño, joven).
hombre(ezequiel, baja, rubio, joven).
hombre(tomas, alta, pelirrojo, adulta).
hombre(hernan, alta, castaño, joven).
hombre(david, baja, negro, vieja).
hombre(manuel, media, pelirrojo, adulta).

mujer(maria, media, rubio, joven).
mujer(antonella, alta, pelirrojo, vieja).
mujer(romina, alta, pelirrojo, joven).
mujer(claudia, baja, rubio, vieja).
mujer(mia, baja, negro, joven).
mujer(luz, alta, negro, joven).
mujer(juliana, baja, negro, vieja).
mujer(mirta, media, pelirrojo, joven).
mujer(marta, alta, negro, joven).
mujer(natalia, baja, castaño, adulta).
mujer(julieta, media, pelirrojo, joven).
mujer(yamila, alta, pelirrojo, adulta).


%Donde N es el nombre de un hombre o una mujer, A su altura (alta, media, baja), 
%C el color de su cabello (rubio, castaño, pelirrojo, negro) y E su edad (joven,adulta,vieja).


gusta(carlos, pop, ciencia, tenis).
gusta(roman, pop, ficcion, natacion).
gusta(german, jazz, ficcion, jogging).
gusta(federico, clasica, ficcion, tenis).
gusta(jorge, jazz, ciencia, tenis).
gusta(juan, jazz, ficcion, jogging).
gusta(martin, clasica, ciencia, jogging).
gusta(ezequiel, clasica, aventura, natacion).
gusta(tomas, pop, ciencia, jogging).
gusta(hernan, clasica, ficcion, tenis).
gusta(david, clasica, aventura, natacion).
gusta(manuel, clasica, ciencia, tenis).
gusta(maria, pop, ciencia, tenis).
gusta(antonella, pop, ciencia, natacion).
gusta(romina, pop, aventura, jogging).
gusta(claudia, pop, ciencia, natacion).
gusta(mia, pop, ficcion, natacion).
gusta(luz, pop, ciencia, jogging).
gusta(juliana, clasica, aventura, natacion).
gusta(mirta, clasica, ciencia, natacion).
gusta(marta, jazz, aventura, jogging).
gusta(natalia, clasica, aventura, jogging).
gusta(julieta, clasica, ciencia, natacion).
gusta(yamila, jazz, ciencia, tenis).


%Que indica que a la persona N le gusta el género de música M (clásica, pop, jazz), 
%el género de literatura L (aventura, ciencia-ficción, policíaca), y practica el deporte S (tenis, natación, jogging).



busca(carlos, media, rubio, joven).
busca(roman, baja, pelirrojo, vieja).
busca(german, media, castaño, adulta).
busca(federico, alta, rubio, joven).
busca(jorge, baja, pelirrojo, vieja).
busca(juan, baja, rubio, joven).
busca(martin, alta, rubio, joven).
busca(ezequiel, baja, pelirrojo, vieja).
busca(tomas, alta, pelirrojo, joven).
busca(hernan, alta, pelirrojo, adulta).
busca(david, media, negro, vieja).
busca(manuel, media, castaño, adulta).
busca(maria, media, rubio, joven).
busca(antonella, media, rubio, joven).
busca(romina, baja, castaño, joven).
busca(claudia, baja, negro, adulta).
busca(mia, media, castaño, joven).
busca(luz, alta, pelirrojo, joven).
busca(juliana, alta, pelirrojo, joven).
busca(mirta, alta, negro, vieja).
busca(marta, media, rubio, joven).
busca(natalia, media, negro, adulta).
busca(julieta, media, negro, adulta).
busca(yamila, media, pelirrojo, joven).




%Que expresa que la persona N busca una pareja de altura A, c
%on cabello color C y edad E.



compatible(X,Y):-
    hombre(X,Ah,Ch,Eh),
    mujer(Y,Am,Cm,Em),
    busca(X,Am,Cm,Em),
    busca(Y,Ah,Ch,Eh).
