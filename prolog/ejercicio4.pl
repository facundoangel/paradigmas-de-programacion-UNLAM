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

viaje(C,S,H,P):-
    alojamiento(C,H,PEstadia),
    transporte(C,PViaje),
    P is PEstadia*S+PViaje*2.


% Regla para verificar si el costo P es menor que Pmax pesos
viajeeconomico(C, S, H, P, Pmax) :-
    viaje(C,S,H,P);
    Pmax < P.