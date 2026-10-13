import math

radio = 1

while(radio != 0):
    radio = float(input("Introduce el radio: \n"))
    
    resultado = math.pi * (radio **2)
    
    print(f"El radio es: {resultado}")