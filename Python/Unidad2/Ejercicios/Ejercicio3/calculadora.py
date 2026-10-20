try:
    num1 = int(input("Introduce el primer número: \n"))
    num2 = int(input("Introduce el segundo número: \n"))
    operador = input("Introduce el operador (+, -, *, /): \n")
    
    if operador not in ["+", "-", "*", "/"]:
        raise Exception("Error: Operación no válida.")
        exit()
    
    if operador == "+":
        resultado = num1 + num2
    elif operador == "-":
        resultado = num1 - num2
    elif operador == "*":
        resultado = num1 * num2
    elif operador == "/":
        resultado = num1 / num2
except ValueError:
    print("Error: Introduce un valor numérico.")
    exit()
except ZeroDivisionError:
    print("Error: No se puede dividir entre 0.")

    
print(f"{num1} {operador} {num2} = {resultado}")