module Main where

{-
1-Escribir una función que sume dos números enteros.-}
suma :: Int -> Int -> Int
suma a b = a + b 
{-
2-Implementar una función que calcule el área de un círculo dado su radio.-}
areaCirculo :: Float -> Float
areaCirculo r = 3.14 * r * r
{-
3-Definir una función que determine si un número es par o impar.-}
tipoNumero :: Int -> Bool
tipoNumero n = (n `mod` 2) ==0 
{-
4-Escribir una función que calcule el factorial de un número.-}

fac :: Int -> Int
fac 0 = 1
fac n = n * fac(n-1) 


{-
5-Implementar una función que invierta una lista.
-}
invertir :: [Int] -> [Int]
invertir [] = []
invertir (x:xs) = invertir xs  ++ [x]
{-
6-Definir una función que determine si una lista está ordenada de forma ascendente.-}
listAscend :: [Int] -> Bool
listAscend [] = True
listAscend [_] = True
listAscend (x:y:xs) = (x < y) && listAscend (y:xs)
{-
7-Escribir una función que cuente la cantidad de elementos en una lista.-}
contarElem :: [Int] -> Int
contarElem [] = 0
contarElem (x:xs) = 1 + contarElem xs
{-
8-Implementar una función que obtenga los elementos en posiciones pares de una lista.-}
obtenerPosPares :: [Int] -> [Int]
obtenerPosPares [] = []
obtenerPosPares [x] = []
obtenerPosPares (x:y:xs) = x : obtenerPosPares xs


{-
9-Definir una función que calcule el máximo común divisor de dos números.-}
mcd :: Int -> Int -> Int
mcd a b = if b /= 0
then mcd b (a `mod` b)
else a

{-
10-Implementar una función que calcule la suma de los dígitos de un número entero.-}

sumaDigitos :: Int -> Int
sumaDigitos n = if n /= 0
then n `mod` 10 + sumaDigitos (n `div` 10)
else 0

{-
11-Definir una función que encuentre el elemento mínimo en una lista.-}

minimo :: Int -> Int -> Int
minimo x y = if x < y 
then x 
else y

minList :: [Int] -> Int
minList [x] = x
minList (x:xs) = minimo x (minList xs)



{-
12-Escribir una función que obtenga el enésimo número de la secuencia de Fibonacci.-}
fib :: Int -> Int
fib 0 = 0
fib 1 = 1
fib n = fib(n-1) + fib(n-2)

{-
13-Implementar una función que verifique si una cadena de texto es un palíndromo.-}

invertirTexto :: String -> String
invertirTexto [] = ""
invertirTexto (x:xs) =  invertirTexto xs ++ [x]

esPalindromo :: String -> Bool
esPalindromo x = x ==  invertirTexto(x)

{-
14-Definir una función que elimine los duplicados de una lista.-}

contiene :: [Int] -> Int -> Bool
contiene [] _ = False
contiene (x:xs) n =  n == x || contiene xs n

eliminarDup :: [Int] -> [Int]
eliminarDup [] = []
eliminarDup (x:xs) = if (contiene xs x)
then eliminarDup xs
else x : eliminarDup xs

{-
15-Implementar una función que obtenga el producto de todos los elementos de una lista.
-}

productoTotal :: [Int] -> Int
productoTotal [] = 1
productoTotal (x:xs) = x * productoTotal xs

main = print(fac 3)
