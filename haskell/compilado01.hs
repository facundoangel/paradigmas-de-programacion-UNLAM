{- 
  
1-Dado dos números enteros A y B, implemente una función que retorne la división entera de ambos por el método de las restas sucesivas -}
divEntera :: Int -> Int -> Int
divEntera a b = if a < b
  then 0
  else 1 + divEntera (a-b) b


{-
2-Escribir una función para hallar la potencia de un número
-}

potencia :: Float -> Int -> Float
potencia a 0 = 1
potencia a b = a * potencia a (b-1)

{-
3-Definir una función menor que devuelve el menor de sus dos argumentos enteros-}

menor :: Int ->Int ->Int 
menor a b = if a < b 
then a
else b

{-
4-Definir una función maximoDeTres que devuelve el máximo de sus argumentos enteros
-}

mayor :: Int ->Int ->Int
mayor a b  = if a > b 
then a
else b

maximoDeTres :: Int ->Int ->Int ->Int
maximoDeTres a b = mayor (mayor a b)


main = print(maximoDeTres 20 100 9)
