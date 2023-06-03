hombre(carlos,alta,rubio,adulta).
hombre(federico,media,pelirrojo,joven).
hombre(jorge,alta,negro,vieja).
hombre(manuel,baja,negro,joven).


mujer(marta,media,castaño,adulta).
mujer(julieta,alta,pelirrojo,joven).
mujer(natalia,baja,castaño,adulta).
mujer(yamila,baja,pelirroja,joven).

%Donde N es el nombre de un hombre o una mujer, A su altura (alta, media, baja), 
%C el color de su cabello (rubio, castaño, pelirrojo, negro) y E su edad (joven,adulta,vieja).


gusta(carlos, jazz, ciencia, natacion).
gusta(federico, clasica, ciencia, jogging).
gusta(jorge, jazz, ficcion, jogging).
gusta(manuel, pop, aventura, jogging).
gusta(marta, jazz, ciencia, tenis).
gusta(natalia, pop, ficcion, natacion).
gusta(julieta, pop, aventura, natacion).
gusta(yamila, clasica, ficcion, jogging).



%Que indica que a la persona N le gusta el género de música M (clásica, pop, jazz), 
%el género de literatura L (aventura, ciencia-ficción, policíaca), y practica el deporte S (tenis, natación, jogging).


busca(N,A,C,E).

%Que expresa que la persona N busca una pareja de altura A, con cabello color C y edad E.
