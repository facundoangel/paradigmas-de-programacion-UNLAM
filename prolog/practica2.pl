limita(argentina,uruguay).
limita(argentina,paraguay).
limita(argentina,chile).



limita(brasil,uruguay).
limita(brasil,paraguay).
limita(brasil,argentina).
limita(brasil,guyana).



limita(chile,peru).


%=========================================================================

limita_con(X,Y):-
    limita(X,Y);
    limita(Y,X).

translimita_con(X,Y):-
    limita(X,OtroPais),
    limita(OtroPais,Y),
    \+limita_con(X,Y).
    
