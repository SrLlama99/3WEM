filas = int(input("Introduce el número de filas: \n"))

for i in range(0, filas, 1):
    asteriscos = 2 * (filas - i) -1 
    print(" " * i + "*" * asteriscos)